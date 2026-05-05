package linkedlist;

class MaxTwinSumofLL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // will become new head
        ListNode curr = head; // start from head

        while (curr != null) {
            ListNode next = curr.next; // store next node

            curr.next = prev; // reverse pointer

            prev = curr; // move prev forward
            curr = next; // move curr forward
        }
        return prev; // new head
    }
}