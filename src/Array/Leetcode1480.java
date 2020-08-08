package Array;
// 1480. Running Sum of 1d Array
public class Leetcode1480 {

    public static int[] runningSum(int[] nums) {

        int [] res = new int [nums.length];
        res[0] = nums[0];

        for(int i = 1; i < nums.length; ++i)
            res[i] = res[i-1] + nums[i];

        return res;
    }

    // No extra space
    public static int[] runningSum2(int[] nums) {

        for(int i = 1; i < nums.length; ++i)
            nums[i] = nums[i-1] + nums[i];

        return nums;
    }
}
