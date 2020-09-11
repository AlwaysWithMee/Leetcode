package DP;

// 152. Maximum Product Subarray
public class Leetcode152 {

    // Simplifier version
    public int maxProduct(int[] nums) {

        int res = nums[0], left = 0, right = 0;

        for (int i = 0; i < nums.length; ++i) {

            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[nums.length - i - 1];

            res = Math.max(res, Math.max(left, right));

        }

        return res;
    }

    public int maxProduct1(int[] nums) {

        int maxl = nums[0], curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (curr == 0)
                curr = 1;
            curr *= nums[i];
            maxl = Math.max(maxl, curr);
        }

        int maxr = nums[nums.length - 1];
        curr = maxr;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (curr == 0)
                curr = 1;
            curr *= nums[i];
            maxr = Math.max(maxr, curr);

        }

        return Math.max(maxl, maxr);

    }
}
