package basics.recursion;
import java.util.Arrays;

/**
 * Solution class to calculate the nth Fibonacci number using memoization (top-down DP).
 */
class FibonacciNumber {

    /**
     * Public method to calculate the nth Fibonacci number.
     *
     * @param n the index of the Fibonacci number (0-based)
     * @return the nth Fibonacci number
     */
    public int fib(int n) {
        int[] memo = new int[n + 1];       // Memoization array
        Arrays.fill(memo, -1);             // Initialize with -1 (uncomputed)
        return fibMemo(n, memo);
    }

    /**
     * Recursive helper function that computes Fibonacci numbers using memoization.
     *
     * @param n    the Fibonacci index to compute
     * @param memo the memoization array storing already computed Fibonacci numbers
     * @return the nth Fibonacci number
     */
    private int fibMemo(int n, int[] memo) {
        if (n == 0) {
            return 0;   // Base case: Fib(0) = 0
        } else if (n == 1) {
            return 1;   // Base case: Fib(1) = 1
        } else if (memo[n] != -1) {
            return memo[n]; // Return cached value if already computed
        } else {
            // Compute Fibonacci number and store in memo
            memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
            return memo[n];
        }
    }
}
