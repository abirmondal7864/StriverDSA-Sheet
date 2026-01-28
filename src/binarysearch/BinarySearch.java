package binarysearch;

public class BinarySearch {

    /**
     * Searches for a target element in a sorted array using Binary Search.
     *
     * @param nums sorted array of integers
     * @param target element to be searched
     * @return index of target if found, otherwise -1
     *
     * Time Complexity: O(log n) Space Complexity: O(1)
     */
    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        // search space exists while low <= high
        while (low <= high) {
            // overflow-safe mid calculation
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // target not found
    }
}
