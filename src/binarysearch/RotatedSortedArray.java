package binarysearch;
/**
 * Searches for a target element in a rotated sorted array using binary search.
 *
 * Idea:
 * At every step, at least one half (left or right) is sorted.
 * Identify the sorted half and check if the target lies in that range.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class RotatedSortedArray {

    /**
     * Returns the index of target if found, otherwise -1.
     *
     * @param nums   rotated sorted array with distinct elements
     * @param target element to search
     * @return index of target or -1 if not found
     */
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // target found
            if (nums[mid] == target)
                return mid;

            // left half is sorted
            if (nums[low] <= nums[mid]) {
                // target lies in left half
                if (nums[low] <= target && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // right half is sorted
            else {
                // target lies in right half
                if (nums[mid] < target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
