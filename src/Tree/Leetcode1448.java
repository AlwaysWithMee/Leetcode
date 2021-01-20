package Tree;

// 1448. Count Good Nodes in Binary Tree
public class Leetcode1448 {

    public int goodNodes(TreeNode root) {

        if(root == null) return 0;

        return 1 + helper(root.left, root.val) + helper(root.right, root.val);

    }

    public int helper(TreeNode node, int max){

        if(node == null) return 0;

        if(node.val >= max){

            int currMax = node.val > max ? node.val : max;
            return 1 + helper(node.left, currMax) + helper(node.right, currMax);

        }

        return 0 + helper(node.left, max) + helper(node.right, max);

    }

}
