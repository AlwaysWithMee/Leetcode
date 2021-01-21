package Tree;

import java.util.ArrayList;
import java.util.List;

// 94. Binary Tree Inorder Traversal
public class Leetcode94 {

    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root == null) return res;

        inorderTraversal(root.left);

        res.add(root.val);

        inorderTraversal(root.right);

        return res;
    }

}
