package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1305. All Elements in Two Binary Search Trees
public class Leetcode1305 {

    List<Integer> list = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        if(root1 == null && root2 == null) return null;

        list = helper(root1, list);
        list = helper(root2, list);

        Collections.sort(list);
        return list;

    }

    public List<Integer> helper(TreeNode root, List<Integer> list){

        if(root == null) return list;

        helper(root.left, list);

        list.add(root.val);

        helper(root.right, list);

        return list;

    }

}
