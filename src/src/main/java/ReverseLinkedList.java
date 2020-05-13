public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        //pointers
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null) {
            //save next
            next = current.next;
            //reverse
            current.next = previous;
            //advance previous and current
            previous = current;
            current = next;
        }
        //new head at end
        return previous;
    }
}

