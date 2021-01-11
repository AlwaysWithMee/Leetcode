package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode589 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    List <Integer> res = new ArrayList<>();

    // Recursive solution
    public List<Integer> preorder(Node root) {

        // Base case
        if (root == null) return res;

        // Add node value to the array
        res.add(root.val);

        // Preorder call children node
        for (Node node : root.children)
            preorder(node);

        // Return result
        return res;

    }

    // Iterative solution
    public List<Integer> preorder1(Node root) {

        // Base case
        if (root == null)
            return res;

        // Initialize Stack
        Stack <Node> stack = new Stack<>();

        // Add root node to the stack
        stack.add(root);

        // While the stack is not empty
        while (!stack.isEmpty()){

            // Get the current node
            Node curr = stack.pop();

            // Add current node to the array
            res.add(curr.val);

            // Preorder traversal
            // Push node to the stack from last to first
            for(int i = curr.children.size() - 1; i >= 0; i--)
                stack.push(curr.children.get(i));

        }

        return res;

    }

}
