package linkedlist;

class OddEvenLL{
    public ListNode oddEvenList(ListNode head) {
        // Edge case
        if (head == null || head.next == null)
            return head;

        ListNode odd = head; // 1st node
        ListNode even = head.next;// 2nd node
        ListNode evenHead = even; // Save start of even list

        while (even != null && even.next != null) {

            // Connect odd nodes
            odd.next = even.next; // That's why even drives loop
            odd = odd.next;

            // Connect even nodes
            even.next = odd.next;
            even = even.next;
        }

        // Attach even list at end of odd list
        odd.next = evenHead;

        return head;
    }
}