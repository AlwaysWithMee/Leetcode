package Tree;

// 1315. Sum of Nodes with Even-Valued Grandparent
public class Leetcode1315 {

    public int sumEvenGrandparent(TreeNode root) {

        return helper(null, root, root.left) + helper(null, root, root.right);

    }

    public int helper(TreeNode grandParent, TreeNode parent, TreeNode root){

        if (root == null) return 0;

        int val = (grandParent != null && grandParent.val % 2 == 0 ? root.val : 0);

        return val + helper(parent, root, root.left) + helper(parent, root, root.right);

    }

}
