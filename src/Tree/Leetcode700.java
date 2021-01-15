package Tree;

public class Leetcode700 {

    // Binary Search Solution
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;

        TreeNode temp = root;

        while(temp != null){

            if (temp.val == val) return temp;
            if (temp.val > val) temp = temp.left;
            else temp = temp.right;

        }

        return null;

    }

    // Recursive Solution
    public TreeNode searchBST1(TreeNode root, int val) {

        if (root == null) return null;

        if (root.val == val) return root;
        else if (val < root.val) return searchBST(root.left, val);
        else if (val > root.val) return searchBST(root.right, val);

        return root;

    }
}
