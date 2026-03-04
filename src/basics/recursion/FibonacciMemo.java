package basics.recursion;
import java.util.Arrays;

class Solution {

    /**
     * Calculates the nth Fibonacci number using Top-Down Dynamic Programming
     * (Memoization).
     *
     * Idea: Instead of recalculating Fibonacci values multiple times, we store
     * already computed values in a memo array.
     *
     * Example: fib(5) = fib(4) + fib(3) If fib(3) was already computed earlier,
     * we simply return it from the memo array.
     *
     * Time Complexity: O(n) Space Complexity: O(n)
     *
     * @param n index of Fibonacci number
     * @return nth Fibonacci number
     */
    public int fib(int n) {

        // memo array to store computed Fibonacci values
        int[] memo = new int[n + 1];

        // initialize all values with -1 (means not calculated yet)
        Arrays.fill(memo, -1);

        // start recursive memoized computation
        return fibMemo(n, memo);
    }

    /**
     * Recursive helper method that computes Fibonacci while storing results in
     * memo array.
     *
     * @param n current Fibonacci index
     * @param memo array storing previously computed values
     * @return Fibonacci number at index n
     */
    public int fibMemo(int n, int[] memo) {

        // Base case: F(1) = 1
        if (n == 1) {
            return 1; 
        }// Base case: F(0) = 0
        else if (n == 0) {
            return 0; 
        }// If already calculated, return stored result
        else if (memo[n] != -1) {
            return memo[n]; 
        }// Otherwise compute and store in memo
        else {
            memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        }

        // return stored value
        return memo[n];
    }
}
