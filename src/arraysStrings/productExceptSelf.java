package arraysStrings;

/**
 * LeetCode 238 – Product of Array Except Self
 *
 * <p>
 * Given an integer array {@code nums}, this method returns an array {@code ans}
 * where {@code ans[i]} is the product of all elements in {@code nums} except
 * {@code nums[i]}.</p>
 *
 * <p>
 * <b>Constraints:</b></p>
 * <ul>
 * <li>No division operation is used.</li>
 * <li>Runs in O(n) time complexity.</li>
 * <li>Uses O(1) extra space (excluding the output array).</li>
 * </ul>
 *
 * <p>
 * <b>Approach:</b></p>
 * <ol>
 * <li>Compute prefix (left) products and store them in the result array.</li>
 * <li>Traverse from right while maintaining a suffix product and multiply it
 * with the corresponding prefix value.</li>
 * </ol>
 */
class Solution {

    /**
     * Returns an array where each index contains the product of all elements in
     * the input array except the element at that index.
     *
     * @param nums the input integer array
     * @return an array containing product of elements except self
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Initialize first element since there are no elements to the left
        ans[0] = 1;

        // Compute prefix (left) products
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Compute suffix (right) products and multiply with prefix values
        int suffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    }
}
