package heap;
import java.util.*;

/**
 * Top K Frequent Elements using Min Heap
 *
 * Time: O(n log k)
 * Space: O(n)
 */
class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap (based on frequency)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(a) - freqMap.get(b)
        );

        // Step 3: Maintain heap size k
        for (int num : freqMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove least frequent
            }
        }

        // Step 4: Build result
        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }

        return result;
    }
}