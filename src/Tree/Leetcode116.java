package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode116 {

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

    // Depth-First Search
    public Node connect1(Node root) {

        if (root == null) return null;
        connectHelper(root.left, root.right);

        return root;

    }

    public void connectHelper(Node node1, Node node2){

        if(node1 == null || node2 == null)
            return;

        node1.next = node2;

        connectHelper(node1.left, node1.right);
        connectHelper(node2.left, node2.right);
        connectHelper(node1.right, node2.left);

    }
}
