package linkedlist;
class MergeTwoLists {
    /**
     * Merges two sorted linked lists into one sorted linked list.
     *
     * Approach:
     * - Use a dummy node to simplify edge cases.
     * - Compare nodes from both lists.
     * - Attach the smaller node to the merged list.
     * - Move the corresponding pointer forward.
     * - When one list ends, attach the remaining part of the other list.
     *
     * @param list1 Head of the first sorted linked list
     * @param list2 Head of the second sorted linked list
     * @return Head of the merged sorted linked list
     *
     * Time Complexity: O(n + m)
     * Space Complexity: O(1)
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to simplify merging
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes (if any)
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return merged list (skip dummy)
        return dummy.next;
    }
}