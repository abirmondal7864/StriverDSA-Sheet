package linkedlist;

class DeleteMiddleOfLL{
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: single node → becomes empty
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next; // move 1 step
            fast = fast.next.next; // move 2 steps
        }
        // Delete middle node
        prev.next = slow.next;

        return head;
    }
}