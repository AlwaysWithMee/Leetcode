package DP;

import java.util.Arrays;
import java.util.List;

// 967. Numbers With Same Consecutive Differences
public class Leetcode967 {

    public int[] numsSameConsecDiff(int N, int K) {

        List<Integer> array = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);





        return null;
    }

    public static boolean isSameConsecDiff(int num, int K){

        String str = Integer.toString(num);

        for(int i = 0; i < str.length() - 1; ++i){

            int j = i+1;

            char curr = str.charAt(i);
            char next = str.charAt(j);

            if (Math.abs(Character.getNumericValue(next) - Character.getNumericValue(curr)) != K)
                return false;
        }
        return true;

    }

    public static void main(String args[]){


    }

}
