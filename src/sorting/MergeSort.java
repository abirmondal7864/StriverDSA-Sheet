package sorting;

class MergeSort{

    /**
     * Sorts the array using Merge Sort algorithm.
     * This method recursively divides the array into halves,
     * sorts them, and then merges them.
     *
     * @param arr the array to be sorted
     * @param l   the starting index of the subarray
     * @param r   the ending index of the subarray
     */
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int mid = l + (r - l) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    /**
     * Merges two sorted subarrays of arr[].
     * First subarray is arr[l..mid]
     * Second subarray is arr[mid+1..r]
     *
     * @param arr the main array containing the subarrays
     * @param l   the left index of the first subarray
     * @param mid the dividing index
     * @param r   the right index of the second subarray
     */
    void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;   // size of left subarray
        int n2 = r - mid;       // size of right subarray

        // Temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i]; //Imp**
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j]; //Imp**
        }

        // Merge the temporary arrays into arr[l..r]
        int i = 0, j = 0; // Initial indexes of left and right subarrays
        int k = l; // Initial index of merged array***** // l not 0 or 1

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[], if any
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right[], if any
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}
