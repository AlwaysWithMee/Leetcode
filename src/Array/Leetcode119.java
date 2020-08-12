package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 119. Pascal's Triangle II
public class Leetcode119 {
    public static List<Integer> getRow(int rowIndex) {

        ArrayList<ArrayList<Integer>> pascalArray = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(1, 1));
        pascalArray.add(row1);
        pascalArray.add(row2);

        for (int i = 2; i < rowIndex + 1; ++i) {

            ArrayList<Integer> prevRow = pascalArray.get(i - 1);
            ArrayList<Integer> currRow = pascal(prevRow);

            pascalArray.add(currRow);
        }

        return pascalArray.get(rowIndex);
    }

    public static ArrayList<Integer> pascal(List<Integer> prevRow) {

        ArrayList<Integer> nextRow = new ArrayList<Integer>();
        nextRow.add(1);

        for (int i = 0; i < prevRow.size() - 1; ++i) {

            int j = i + 1;
            nextRow.add(prevRow.get(i) + prevRow.get(j));

        }
        nextRow.add(1);
        return nextRow;
    }
}
