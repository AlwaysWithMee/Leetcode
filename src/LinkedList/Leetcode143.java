package LinkedList;

// 143. Reorder List
public class Leetcode143 {

    public void reorderList(ListNode head) {

        ArrayList<ListNode> array = new ArrayList<ListNode>();
        2ListNode iterator = head;

        while(iterator != null){
            array.add(iterator);
            iterator = iterator.next;
        }

        for(int i = 0; i < array.size()/2; ++i){

            head.next = array.get(array.size()-i-1);
            head = head.next;
            head.next = array.get(i+1);
            head = head.next;
            head.next = null;
        }
    }63
}
