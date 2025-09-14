package sorting;

/**
 * Recursive Bubble Sort implementation.
 * Replaces the outer loop with recursion.
 */
public class RecursiveBubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return; // Base case

        // One pass of Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for the rest
        bubbleSort(arr, n - 1);
    }
}
