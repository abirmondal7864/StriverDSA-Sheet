package arraysStrings;

/**
 * Implements Kadane's Algorithm to find the maximum sum of a contiguous
 * subarray.
 *
 * <p>
 * The algorithm works by maintaining:
 * <ul>
 * <li><b>currSum</b>: Maximum subarray sum ending at the current index</li>
 * <li><b>maxSum</b>: Maximum subarray sum found so far</li>
 * </ul>
 *
 * <p>
 * At each element, we decide whether to:
 * <ul>
 * <li>Extend the existing subarray</li>
 * <li>Or start a new subarray from the current element</li>
 * </ul>
 *
 * <p>
 * <b>Time Complexity:</b> O(n) — single traversal of the array
 * <br><b>Space Complexity:</b> O(1) — constant extra space
 *
 * @param arr the input integer array (may contain negative numbers)
 * @return the maximum sum of any contiguous subarray
 */
class Kadane {

    /**
     * Returns the maximum subarray sum using Kadane's Algorithm.
     *
     * @param arr input array of integers
     * @return maximum sum of a contiguous subarray
     */
    int maxSubarraySum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : arr) {

            // Either extend the previous subarray or start a new one
            currSum = Math.max(num + currSum, num);

            // Update the maximum sum found so far
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
