package binarysearch;

class First&LastPos {

    /**
     * Finds the first and last position of a target value in a sorted array.
     *
     * Approach: - Use binary search twice. - First search is biased to the left
     * to find the first occurrence. - Second search is biased to the right to
     * find the last occurrence.
     *
     * Time Complexity: O(log n) Space Complexity: O(1)
     *
     * @param nums sorted integer array (may contain duplicates)
     * @param target value to search for
     * @return array of two integers [firstIndex, lastIndex]
     */
    public int[] searchRange(int[] nums, int target) {

        // default result if target is not found
        int[] ans = {-1, -1};

        // find first occurrence
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans[0] = mid;
                high = mid - 1; // move left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // find last occurrence
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans[1] = mid;
                low = mid + 1; // move right
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
