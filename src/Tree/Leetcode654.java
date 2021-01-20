package Tree;

import java.util.Arrays;

// 654. Maximum Binary Tree
public class Leetcode654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        // Empty List
        if(nums.length == 0) return null;

        return helper(nums);

    }

    public TreeNode helper(int [] nums){

        if(nums.length == 0) return null;

        int [] arr = findMax(nums);

        TreeNode root = new TreeNode(arr[1]);
        int [] leftArr = Arrays.copyOfRange(nums, 0, arr[0]);
        int [] righArr = Arrays.copyOfRange(nums, arr[0]+1, nums.length);

        root.left = helper(leftArr);
        root.right = helper(righArr);

        return root;

    }

    public int [] findMax(int nums[]){

        int max = -1, index = -1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > max){

                max = nums[i];
                index = i;
            }
        }

        return new int[]{index, max};
    }

}
