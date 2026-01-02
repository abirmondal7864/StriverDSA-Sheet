package arraysStrings;

/**
 * Moves all zero elements of the array to the end while maintaining the
 * relative order of the non-zero elements.
 *
 * <p>
 * This method uses a one-traversal compaction approach:
 * <ul>
 * <li>First pass copies all non-zero elements to the front of the array</li>
 * <li>Second pass fills the remaining positions with zeroes</li>
 * </ul>
 *
 * <p>
 * The operation is performed in-place with constant extra space.</p>
 *
 * <p>
 * <b>Time Complexity:</b> O(n)</p>
 * <p>
 * <b>Space Complexity:</b> O(1)</p>
 *
 * @param nums the input integer array in which zeroes are moved to the end
 */
class MoveZeros {

    public void moveZeroes(int[] nums) {
        // Position to place the next non-zero element
        int pos = 0;

        // Copy all non-zero elements to the front
        for (int num : nums) {
            if (num != 0)   nums[pos++] = num;
        }

        // Fill the remaining positions with zeroes
        while (pos < nums.length) nums[pos++] = 0;
    }
}
