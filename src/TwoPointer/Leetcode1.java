package TwoPointer;

import java.util.Arrays;
import java.util.HashMap;

// 1. Two Sum
public class Leetcode1 {

    // Hashmap
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; ++i){

            if(map.containsKey(nums[i]))
                return new int[] {i, map.get(nums[i])};
            else
                map.put(target - nums[i], i);

        }
        return null;
    }
}
