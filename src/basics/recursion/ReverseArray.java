package basics.recursion;

/**
 * Class containing a method to reverse an array recursively.
 */
class ReverseArray {

    /**
     * Reverses the given array in place using recursion.
     *
     * @param arr the array to be reversed
     */
    public void reverseArray(int[] arr) {
        reverse(arr, 0);
    }

    /**
     * A recursive helper method that swaps elements symmetrically
     * until the middle of the array is reached.
     *
     * @param arr   the array to reverse
     * @param index the current index to process
     */
    private void reverse(int[] arr, int index) {
        int n = arr.length;

        // Base case: stop when index reaches the middle
        if (index >= n / 2) return;

        // Swap arr[index] with its mirror element arr[n-1-index]
        int temp = arr[index];
        arr[index] = arr[n - 1 - index];
        arr[n - 1 - index] = temp;

        // Recursive call for the next index
        reverse(arr, index + 1);
    }
}
