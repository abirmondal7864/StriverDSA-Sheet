package recursionbacktracking;

class FibonacciOptimized {

    /**
     * Returns the nth Fibonacci number.
     *
     * Fibonacci sequence definition: F(0) = 0 F(1) = 1 F(n) = F(n-1) + F(n-2)
     *
     * Approach: Instead of storing all previous Fibonacci numbers, we only
     * store the last two values because each number depends only on the
     * previous two numbers.
     *
     * Example: 0, 1, 1, 2, 3, 5, 8...
     *
     * Time Complexity: O(n) Space Complexity: O(1)
     *
     * @param n the index of the Fibonacci number
     * @return the nth Fibonacci number
     */
    public int fib(int n) {

        // Base cases
        if (n <= 1) {
            return n;
        }

        int prev2 = 0; // F(0)
        int prev1 = 1; // F(1)

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2; // F(n) = F(n-1) + F(n-2)

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
