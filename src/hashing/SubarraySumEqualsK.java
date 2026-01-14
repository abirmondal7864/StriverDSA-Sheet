package hashing;

import java.util.HashMap;
import java.util.Map;

class SubarraySumEqualsK {

    /**
     * Returns the total number of continuous subarrays
     * whose sum equals k.
     *
     * Core idea:
     * prefixSum[j] - prefixSum[i] = k
     * => prefixSum[i] = prefixSum[j] - k
     *
     * We store frequencies of prefix sums seen so far
     * to count how many valid subarrays end at each index.
     *
     * @param nums the input integer array (can contain negatives)
     * @param k the target sum
     * @return number of subarrays with sum = k
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int subarraySum(int[] nums, int k) {

        // Map to store prefixSum -> frequency
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Base case:
        // prefixSum = 0 occurs once (important for subarrays starting at index 0)
        freqMap.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            // Update prefix sum
            currSum += num;

            // Check if (currSum - k) existed before
            if (freqMap.containsKey(currSum - k)) {
                count += freqMap.get(currSum - k);
            }

            // Store/update frequency of current prefix sum
            freqMap.put(currSum, freqMap.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
