package basics.recursion;
/**
 * Checks if a given string is a valid palindrome.
 *
 * A valid palindrome ignores spaces, punctuation, and case differences.
 * Only alphanumeric characters are considered for comparison.
 *
 * @param s the input string to check
 * @return true if the string is a palindrome, false otherwise
 */
public boolean ValidPalindrome(String s) {
    int left = 0, right = s.length() - 1;

    while (left < right) {
        if (!Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        } else if (!Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        } else if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
            left++;
            right--;
        } else {
            return false;
        }
    }

    return true;
}
