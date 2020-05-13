public class DeleteNode {

        public void deleteNode(ListNode node) {
            //change the current node you want to delete to the next node
            node.val = node.next.val;
            //point to the end of the node
            node.next = node.next.next;
        }
}
