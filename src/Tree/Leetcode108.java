package Tree;

// 108. Convert Sorted Array to Binary Search Tree
public class Leetcode108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0) return null;

        return helper(0, nums.length-1, nums);

    }

    public TreeNode helper(int low, int high, int [] arr){

        if (low > high) return null;

        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = helper(low, mid-1, arr);
        node.right = helper(mid+1, high, arr);
        return node;

    }

}
