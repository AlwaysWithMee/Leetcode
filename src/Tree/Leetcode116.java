package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode116 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {

        if (root == null) return root;

        Queue<Node> queue = new LinkedList<>();

        // Put root node to the Queue
        queue.offer(root);

        // Breadth-first Search Algo
        while (!queue.isEmpty()){

            int size = queue.size();

            for (int i = 0; i < size; i++){

                Node temp = queue.poll();

                // Set next to the Right Node
                temp.next = queue.peek();

                // If the Node is the Last Node in the level, set it to null
                if (i == size - 1)
                    temp.next = null;

                // Add next level Node to the Queue
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);

            }
        }
        return root;
    }
}
