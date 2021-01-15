package Tree;

public class Node {
    int val;
    Node left;
    Node right;
    Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        this.val = _val;
        this.left = _left;
        this.right = _right;
        this.next = _next;
    }

}
