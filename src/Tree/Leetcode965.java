package Tree;

// 965. Univalued Binary Tree
public class Leetcode965 {

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

    int val = -1;
    public boolean isUnivalTree(TreeNode root) {

        if (root == null) return true;
        if (val == -1) val = root.val;

        return val == root.val && isUnivalTree(root.left) && isUnivalTree(root.right);

    }

}
