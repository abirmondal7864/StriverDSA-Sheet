package sorting;

/**
 * Implementation of Selection Sort algorithm.
 *
 * Selection Sort works by repeatedly finding the minimum element
 * from the unsorted part of the array and swapping it with the first
 * unsorted element.
 *
 * Time Complexity:
 * - Best Case: O(n^2)
 * - Worst Case: O(n^2)
 * - Average Case: O(n^2)
 *
 * Space Complexity: O(1) (in-place sorting)
 *
 * Stability: Not stable
 */
class SelectionSort {
    /**
     * Sorts the given array in ascending order using Selection Sort.
     *
     * @param arr the array of integers to be sorted
     */
    void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i; // assume current element is minimum

            // find index of minimum element in unsorted part
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}


