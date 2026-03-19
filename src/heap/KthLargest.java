package heap;
/**
 * Find kth largest element using Min Heap
 * Time: O(n log k)
 * Space: O(k)
 */
class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        // Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            // Keep only k elements
            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }

        // Top = kth largest
        return pq.peek();
    }
}