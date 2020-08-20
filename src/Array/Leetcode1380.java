package Array;

import java.util.HashMap;
import java.util.List;

// 1380. Lucky Numbers in a Matrix
public class Leetcode1380 {

    public List<Integer> luckyNumbers (int[][] matrix) {

        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int r = 0; r < matrix.length; ++r){

            for(int c = 0; c < matrix[0].length; ++c){

                if (!map.containsKey(r))
                    map.put(r, matrix[r][c]);
                else{
                    int currMin = map.get(r);
                    if (matrix[r][c] < currMin)
                        map.put(r, matrix[r][c]);
                }

                if(!map.containsKey(2*c))
                    map.put(2*c, matrix[r][c]);
                else{
                    int currMax = map.get(2*c);

                }
            }
        }

        return null;

    }

}
