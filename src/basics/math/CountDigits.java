package basics.math;

import java.lang.Math;

/**
 * The {@code CountDigits} class provides methods to count the number of digits
 * in a given integer. It includes an optimal approach using logarithms.
 * <p>
 * Example usage:
 * <pre>
 *     CountDigits cd = new CountDigits();
 *     int numDigits = cd.countDigits(12345); // returns 5
 * </pre>
 * </p>
 *
 * Note: The class currently only supports non-negative integers for the logarithmic method.
 */
public class CountDigits {
    // Brute Force: digit_counter++ until n/10 == 0
    // Optimal: using Math.floor() and Math.log10()
    int count_digit = 0;

    /**
     * Counts the number of digits in the given integer using an optimal logarithmic approach.
     *
     * @param n the integer whose digits are to be counted
     * @return the number of digits in {@code n}; returns 1 if {@code n} is 0
     */
    public int countDigits(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (int) (Math.floor(Math.log10(n)) + 1); // cast int from double
        }
    }
}
