package Tree;

import java.util.*;

// 103. Binary Tree Zigzag Level Order Traversal
public class Leetcode103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if(root == null) return res;

        int count = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            int size = q.size();
            List<Integer> arr = new ArrayList<>();

            for(int i = 0; i < size; i++){

                TreeNode curr = q.poll();
                arr.add(curr.val);

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }
            if(count % 2 == 0)
                Collections.reverse(arr);
            res.add(arr);
            count++;

        }

        return res;

    }
}
