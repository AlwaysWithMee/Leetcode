package Tree;

public class Leetcode1302 {

    public int deepestLeavesSum(TreeNode root) {

        if (root.left == null && root.right == null) return root.val;

        int depth = maxDepth(root);

        return helper(root, 1, depth);

    }

    public int maxDepth(TreeNode root){

        if(root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

    public int helper (TreeNode root, int h, int depth){
        if (root == null) return 0;

        int val = (root.left == null && root.right == null && h == depth ? root.val : 0);

        return val + helper(root.left, h+1, depth) + helper(root.right, h+1, depth);

    }

}
