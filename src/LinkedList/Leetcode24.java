package LinkedList;

// 24. Swap Nodes in Pairs
public class Leetcode24 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Recursive Solution
    public ListNode swapPairs(ListNode head) {

        // Empty list || Only 1 element in the list
        if (head == null || head.next == null)
            return head;

        ListNode res = head.next;
        ListNode prev = null;

        swapPairsHelper(head, prev);

        return res;

    }

    public void swapPairsHelper(ListNode node, ListNode prev){

        if (node == null || node.next == null)
            return;

        // Perform swap
        ListNode temp = node.next;
        node.next = node.next.next;
        temp.next = node;

        if (prev != null)
            prev.next = temp;

        prev = node;

        swapPairsHelper(node.next, prev);

    }

}
