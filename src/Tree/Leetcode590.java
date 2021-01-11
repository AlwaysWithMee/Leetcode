package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Leetcode590 {

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

    // Recursive Solution
    public List<Integer> postorder(Node root) {

        // Base Case
        if (root == null) return res;

        // Recursively called children node
        for (Node node : root.children)
            postorder(node);

        // Add node value to the array
        res.add(root.val);
        return res;

    }

    // Iterative Solution
    public List<Integer> postorder1(Node root) {

        if (root == null) return res;

        Stack<Node> stack = new Stack();
        stack.add(root);

        while (!stack.isEmpty()){

            Node curr = stack.pop();
            res.add(curr.val);

            for(Node node : curr.children)
                stack.push(node);

        }

        Collections.reverse(res);
        return res;

    }
}
