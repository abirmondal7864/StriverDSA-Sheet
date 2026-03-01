package linkedlist;

class HasCycle {

    /**
     * Detects whether a linked list contains a cycle.
     *
     * <p>This method uses Floyd's Cycle Detection Algorithm (Tortoise and Hare approach).
     * Two pointers are used:
     * If a cycle exists, the fast pointer will eventually meet the slow pointer.
     * If no cycle exists, the fast pointer will reach null.
     *
     * @param head the head node of the singly linked list
     * @return true if the linked list contains a cycle, false otherwise
     *
     * @timecomplexity O(n)
     * @spacecomplexity O(1)
     */
    public boolean hasCycle(ListNode head) {

        // Edge case: empty list or single node without cycle
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Traverse list with two pointers
        while (fast != null && fast.next != null) {

            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps

            // If both pointers meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // If fast reaches null, no cycle
        return false;
    }
}