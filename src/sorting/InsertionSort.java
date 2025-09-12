package sorting;

/**
 * Class to demonstrate Insertion Sort algorithm
 */
class InsertionSort {
    /**
     * Sorts an array in ascending order using Insertion Sort.
     *
     * @param arr the array to be sorted
     */
    public void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from index 1, as a single element at index 0 is already "sorted"
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be placed correctly
            int j = i - 1;

            // Shift elements of arr[0..i-1] greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }
}
