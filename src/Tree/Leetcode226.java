package Tree;

import java.util.LinkedList;
import java.util.Queue;

// 226. Invert Binary Tree
public class Leetcode226 {

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

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size();

            for(int i = 0; i < size; i++){

                TreeNode curr = queue.poll();
                TreeNode left = curr.left;

                curr.left = curr.right;
                curr.right = left;

                if (curr.left != null)
                    queue.offer(curr.left);
                if (curr.right != null)
                    queue.offer(curr.right);

            }
        }

        return root;
    }
}
