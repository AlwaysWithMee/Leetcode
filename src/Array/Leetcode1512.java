package Array;

import java.util.HashMap;

// 1512. Number of Good Pairs
public class Leetcode1512 {

    // Brutal force O(n^2)
    public static int numIdenticalPairs(int[] nums) {

        int res = 0;

        for(int i = 0; i < nums.length - 1; ++i)
            for(int j = 1; j < nums.length; ++j)
                if(nums[i] == nums[j] && i < j)
                    res++;
        return res;
    }

    // HashMap O(n)
    public static int numIdenticalPairs2(int[] nums){

        int res = 0;
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; ++i){

            if(map.containsKey(nums[i])){

                map.replace(nums[i], map.get(nums[i]) + 1);
                res += map.get(nums[i]);
            }

            else
                map.put(nums[i], 0);
        }
        return res;
    }
}
