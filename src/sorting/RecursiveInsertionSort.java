package sorting;
/**
 * Recursive implementation of Insertion Sort.
 * <p>
 * Insertion Sort builds a sorted portion of the array one element at a time.
 * In this recursive approach:
 * <ul>
 *   <li>We sort the first n-1 elements recursively.</li>
 *   <li>Then we insert the nth element into its correct position
 *       in the already sorted subarray.</li>
 * </ul>
 * Time Complexity: O(n^2) in worst and average case.
 * Space Complexity: O(n) due to recursion stack.
 */
public class RecursiveInsertionSort {

    /**
     * Sorts an array using recursive insertion sort.
     *
     * @param arr The array to be sorted
     * @param n   The size of the portion of the array to sort
     */
    static void insertionSortRecursive(int[] arr, int n) {
        // Base case: array of size 0 or 1 is already sorted
        if (n <= 1) {
            return;
        }

        // Sort the first n-1 elements
        insertionSortRecursive(arr, n - 1);

        // Insert the last element at its correct position
        // in the sorted subarray
        int last = arr[n - 1];
        int j = n - 2;

        // Shift elements that are greater than 'last'
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Place 'last' in its correct position
        arr[j + 1] = last;
    }
}

