package Tree;

// 1038. Binary Search Tree to Greater Sum Tree
public class Leetcode1038 {

    int sum = 0, temp = 0;
    public TreeNode bstToGst(TreeNode root) {

        dfs(root);
        helper(root);
        return root;

    }

    public void helper(TreeNode root){

        if(root == null) return;

        helper(root.left);
        temp = root.val;
        root.val = sum;
        sum = sum - temp;
        helper(root.right);

        return;

    }

    public void dfs(TreeNode root){

        if(root == null) return;

        dfs(root.left);
        sum += root.val;
        dfs(root.right);

        return;

    }
}
