package sorting;

/**
 * Solution class containing a Bubble Sort implementation.
 */
class BubbleSort {
    /**
     * Sorts the given array in ascending order using the Bubble Sort algorithm.
     *
     * <p>Bubble Sort works by repeatedly swapping adjacent elements
     * if they are in the wrong order. After each iteration, the
     * largest element in the unsorted portion of the array "bubbles up"
     * to its correct position.</p>
     *
     * @param arr the array of integers to be sorted
     *
     * <p>Time Complexity:</p>
     * <ul>
     *   <li>Best Case: O(n) (when the array is already sorted, with optimization)</li>
     *   <li>Average Case: O(n²)</li>
     *   <li>Worst Case: O(n²)</li>
     * </ul>
     *
     * <p>Space Complexity: O(1) (in-place sorting)</p>
     */
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
