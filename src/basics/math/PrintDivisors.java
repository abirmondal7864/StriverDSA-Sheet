package basics.math;

/**
 * PrintDivisors class to print all divisors of a given number.
 */
class PrintDivisors {

    /**
     * Prints all divisors of the given integer n in sorted order.
     *
     * The method first prints smaller divisors from 1 to √n,
     * then prints corresponding larger divisors in reverse order to maintain sorted order.
     *
     * @param n The number for which divisors are to be printed.
     */
    public static void print_divisors(int n) {
        int sqrt = (int) Math.sqrt(n);

        // Print smaller divisors
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }

        // Print larger divisors in reverse order
        for (int i = sqrt; i >= 1; i--) {
            if (n % i == 0 && i != n / i) System.out.print(n / i + " ");
        }
    }
}
