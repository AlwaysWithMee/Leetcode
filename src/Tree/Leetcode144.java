package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 144. Binary Tree Preorder Traversal
public class Leetcode144 {

    List<Integer> res = new ArrayList<>();

    // Recursive Solution
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null) return res;
        res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return res;

    }

    // Iterative Solution
    public List<Integer> preorderTraversal1(TreeNode root) {

        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();

        while(root != null || !stack.isEmpty()){

            while(root != null){

                res.add(root.val);
                stack.push(root);
                root = root.left;

            }

            root = stack.pop();
            root = root.right;
        }

        return res;
    }
}
