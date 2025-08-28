package basics.math;
class ArmstrongNumber {
    static boolean armstrongNumber(int n) {
        int orgNum = n;
        int sum = 0;

        // Count the number of digits
        int digitsCount = (int) Math.log10(n) + 1;

        while (n > 0) {
            int digit = n % 10;                       // Extract the last digit
            sum += (int) Math.pow(digit, digitsCount); // Compute digit^digitsCount and add
            n /= 10;                                  // Remove the last digit
        }

        return sum == orgNum;
    }
}
