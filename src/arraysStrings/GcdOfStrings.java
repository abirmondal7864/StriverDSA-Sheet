package arraysstrings;

/**
 * Finds the greatest common divisor of two strings.
 *
 * <p>
 * <b>Time Complexity:</b> O(M + N)
 * <br><b>Space Complexity:</b> O(M + N)
 */
class GcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {

        // Step 1: Check if valid pattern exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return substring
        return str1.substring(0, gcdLength);
    }

    // Euclidean Algorithm
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}