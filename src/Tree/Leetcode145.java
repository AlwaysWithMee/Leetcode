package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 145. Binary Tree Postorder Traversal
public class Leetcode145 {

    List<Integer> res = new ArrayList<>();

    // Recursive Solution
    public List<Integer> postorderTraversal(TreeNode root) {

        if(root == null) return res;
        postorderTraversal(root.left);
        postorderTraversal(root.right);

        res.add(root.val);

        return res;
    }

    // Iterative Solution
    public List<Integer> postorderTraversal1(TreeNode root) {

        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            res.add(0, root.val);
            if(root.left != null) stack.push(root.left);
            if(root.right != null) stack.push(root.right);

        }
        return res;
    }
}
