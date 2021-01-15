package Tree;

import java.util.Queue;
import java.util.LinkedList;

// 111. Minimum Depth of Binary Tree
public class Leetcode111 {

    // BFS Solution
    public int minDepth(TreeNode root) {

        if (root == null) return 0;

        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i = 0; i < size; i++){

                TreeNode curr = queue.poll();

                if(curr.left == null && curr.right == null)
                    return depth;

                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);

            }

            depth++;
        }

        return depth;

    }
}
