package Tree;

import java.util.LinkedList;
import java.util.Queue;

// 513. Find Bottom Left Tree Value
public class Leetcode513 {

    public int findBottomLeftValue(TreeNode root) {

        int depth = maxDepth(root);

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while(!q.isEmpty()){

            int size = q.size();
            level++;

            for(int i = 0; i < size; i++){

                TreeNode curr = q.poll();

                if(level == depth)
                    return curr.val;

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }
        }

        return -1;
    }

    public int maxDepth(TreeNode root){

        if(root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

}
