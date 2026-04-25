package heap;

/**
 * Merges k sorted linked lists into one sorted linked list.
 *
 * <p>
 * <b>Time Complexity:</b> O(N log K) where N is total nodes
 * <br><b>Space Complexity:</b> O(K) priority queue space
 */
class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        // Min Heap based on node value
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        // Step 1: Add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy node for result list
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Step 2: Process heap
        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll(); // smallest node

            tail.next = minNode; // attach
            tail = tail.next;

            // If next exists, push into heap
            if (minNode.next != null) {
                pq.add(minNode.next);
            }
        }

        return dummy.next;
    }
}