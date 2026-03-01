package linkedlist;

// /**
//  * Definition for singly-linked list node.
//  */
// class ListNode {
//     int val;           // Value stored in the node
//     ListNode next;     // Reference to next node

//     /**
//      * Constructor to initialize node with value.
//      *
//      * @param val value of the node
//      */
//     ListNode(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

/**
 * Solution class to reverse a singly linked list.
 */
class ReverseList {

    /**
     * Reverses a singly linked list.
     *
     * Approach:
     * - Use three pointers: prev, curr, next
     * - Reverse links one by one
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param head the head node of the linked list
     * @return the new head of the reversed linked list
     */
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            // Store next node
            ListNode next = curr.next;

            // Reverse current node's pointer
            curr.next = prev;

            // Move pointers forward
            prev = curr;
            curr = next;
        }

        // prev becomes new head
        return prev;
    }
}