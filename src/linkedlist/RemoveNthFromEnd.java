package linkedlist;
/**
 * Removes the Nth node from the end of a singly linked list.
 *
 * Approach:
 * Uses two-pointer technique (fast and slow).
 * Fast pointer moves n+1 steps ahead so that when fast reaches the end,
 * slow pointer is just before the node to remove.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Create dummy node to handle edge cases like deleting head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }

        // Move both pointers until fast reaches null
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}