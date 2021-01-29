package Tree;

import java.util.Stack;

public class Leetcode98 {

    TreeNode prev;

    // Recursive Solution
    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;

        if(!isValidBST(root.left)) return false;
        if(prev != null && root.val <= prev.val) return false;
        prev = root;
        if(!isValidBST(root.right)) return false;

        return true;

    }

    // Iterative Solution
    public boolean isValidBST1(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return true;
        TreeNode prev = null;

        while(root != null || !stack.isEmpty()){

            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(prev != null && root.val <= prev.val) return false;
            prev = root;
            root = root.right;

        }
        return true;
    }
}
