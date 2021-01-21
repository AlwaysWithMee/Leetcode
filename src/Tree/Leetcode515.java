package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 515. Find Largest Value in Each Tree Row
public class Leetcode515 {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int size = queue.size(), max = Integer.MIN_VALUE;

            for(int i = 0; i < size; i++){

                TreeNode curr = queue.poll();

                if(curr.val > max)
                    max = curr.val;

                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);

            }

            res.add(max);

        }

        return res;

    }
}
