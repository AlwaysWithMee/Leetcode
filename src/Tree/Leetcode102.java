package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 102. Binary Tree Level Order Traversal
public class Leetcode102 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null) return res;

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
            res.add(arr);

        }
        return res;
    }

}
