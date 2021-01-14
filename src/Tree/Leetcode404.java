package Tree;

public class Leetcode404 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {

        return helper(root, false);

    }

    public int helper (TreeNode root, boolean isLeft){

        if (root == null) return 0;

        if (root.left == root.right && isLeft) return root.val;

        return helper(root.left, true) + helper(root.right, false);

    }

}
