package Array;

// 1512. Number of Good Pairs
public class Leetcode1512 {

    public static int numIdenticalPairs(int[] nums) {

        int res = 0;

        for(int i = 0; i < nums.length - 1; ++i)
            for(int j = 1; j < nums.length; ++j)
                if(nums[i] == nums[j] && i < j)
                    res++;
        return res;
    }
}
