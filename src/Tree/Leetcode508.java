package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 508. Most Frequent Subtree Sum
public class Leetcode508 {

    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {

        helper(root);

        List<Integer> res = new ArrayList<>();

        for(int i : map.keySet())
            if(map.get(i) == max)
                res.add(i);

        return res.stream().mapToInt(i->i).toArray();

    }

    public int helper(TreeNode root){

        if(root == null) return 0;

        int sum = helper(root.left) + helper(root.right) + root.val;

        map.put(sum, map.getOrDefault(sum, 0) + 1);
        max = Math.max(max, map.get(sum));

        return sum;

    }
}
