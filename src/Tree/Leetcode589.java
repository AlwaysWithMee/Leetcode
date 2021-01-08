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

        if (root == null)
            return res;

        res.add(root.val);

        for(Node node : root.children)
            preorder(node);

        return res;

    }

    // Iterative solution
    public List<Integer> preorder1(Node root) {

        List <Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){

            Node curr = stack.pop();
            res.add(curr.val);

            for(int i = curr.children.size() - 1; i >= 0; i--){

                stack.push(curr.children.get(i));

            }
        }

        return res;
    }

}
