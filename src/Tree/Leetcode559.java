package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 559. Maximum Depth of N-ary Tree
public class Leetcode559 {

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

    // BST Solution
    public int maxDepth(Node root) {

        if(root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 0;

        while (!queue.isEmpty())
        {

            int size = queue.size();

            for (int i = 0; i < size; i++)
            {

                Node curr = queue.poll();
                for(Node node : curr.children)  queue.offer(node);

            }

            depth++;
        }

        return depth;
    }

    // DFS Solution
    public int maxDepth1(Node root) {

        if(root == null) return 0;

        int res = 0;
        for (Node curr : root.children){

            int value = maxDepth(curr);

            if (value > res)
                res = value;

        }

        return res + 1;

    }

}
