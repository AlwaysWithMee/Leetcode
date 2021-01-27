package Tree;

import java.util.LinkedList;
import java.util.Queue;

// 1609. Even Odd Tree
public class Leetcode1609 {

    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int depth = 0;
        int currVal = 0;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                // Even
                if(depth % 2 == 0){
                    if(curr.val % 2 == 0)
                        return false;
                    if(i == 0)
                        currVal = curr.val;
                    else
                        if(curr.val > currVal)
                            currVal = curr.val;
                        else
                            return false;
                }
                // Odd
                else if(depth % 2 != 0){
                    if(curr.val % 2 != 0)
                        return false;
                    if(i == 0)
                        currVal = curr.val;
                    else
                        if(curr.val < currVal)
                            currVal = curr.val;
                        else
                            return false;
                }

                if(curr.left  != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }// End for
            depth++;
        }// End While
        return true;
    }
}
