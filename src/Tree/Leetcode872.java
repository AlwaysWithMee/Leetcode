package Tree;

import java.util.ArrayList;
import java.util.List;

// 872. Leaf-Similar Trees
public class Leetcode872 {

    List<Integer> arr1 = new ArrayList<>();
    List<Integer> arr2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        // Base case
        if(root1 == null || root2 == null) return false;
        return dfs(root1, arr1).equals(dfs(root2, arr2));

    }

    public List<Integer> dfs (TreeNode root, List<Integer> arr){

        if(root == null) return arr;

        if(root.left == null && root.right == null)
            arr.add(root.val);

        dfs(root.left, arr);
        dfs(root.right, arr);

        return arr;

    }
}
