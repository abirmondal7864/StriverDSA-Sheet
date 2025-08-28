package basics.math;

/**
 * Class to calculate GCD (HCF) of two numbers using the Euclidean algorithm.
 */
public class GcdOfTwo {

    /**
     * Recursive method to calculate the GCD of two integers.
     *
     * @param a First integer
     * @param b Second integer
     * @return The greatest common divisor (GCD) of a and b
     */
    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    /**
     * The main method to test the GCD calculation.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println("GCD (HCF) of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
