package Tree;

public class Leetcode404 {

    public int sumOfLeftLeaves(TreeNode root) {

        return helper(root, false);

    }

    public int helper (TreeNode root, boolean isLeft){

        if (root == null) return 0;

        if (root.left == root.right && isLeft) return root.val;

        return helper(root.left, true) + helper(root.right, false);

    }

}
