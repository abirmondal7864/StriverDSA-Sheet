package linkedlist;

class MiddleNode {

    /**
     * Returns the middle node of a singly linked list.
     * 
     * If the list has an even number of nodes, 
     * the second middle node is returned.
     *
     * Approach:
     * Uses the two-pointer technique (slow & fast pointers).
     * - slow moves 1 step at a time
     * - fast moves 2 steps at a time
     * When fast reaches the end, slow will be at the middle.
     *
     * @param head the head of the linked list
     * @return the middle node of the linked list
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // move until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps
        }

        return slow;   // slow is at middle
    }
}