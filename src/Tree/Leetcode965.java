package Tree;

// 965. Univalued Binary Tree
public class Leetcode965 {

    int val = -1;
    public boolean isUnivalTree(TreeNode root) {

        if (root == null) return true;
        if (val == -1) val = root.val;

        return val == root.val && isUnivalTree(root.left) && isUnivalTree(root.right);

    }

}
