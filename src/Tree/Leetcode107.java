package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 107. Binary Tree Level Order Traversal II
public class Leetcode107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){

            int size = q.size();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < size; i++){

                TreeNode curr = q.poll();
                arr.add(curr.val);

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }
            res.add(0, arr);

        }

        return res;
    }

}
