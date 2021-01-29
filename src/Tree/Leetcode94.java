package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 94. Binary Tree Inorder Traversal
public class Leetcode94 {

    List<Integer> res = new ArrayList<>();

    // Recursive Solution
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root == null) return res;

        inorderTraversal(root.left);

        res.add(root.val);

        inorderTraversal(root.right);

        return res;
    }

    // Iterative Solution
    public List<Integer> inorderTraversal1(TreeNode root) {

        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();

        while(root != null || !stack.isEmpty()){

            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            res.add(root.val);
            root = root.right;

        }
        return res;
    }
}
