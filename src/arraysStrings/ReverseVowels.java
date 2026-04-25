package arraysstrings;

/**
 * Reverses only the vowels of a string in-place.
 *
 * <p>
 * <b>Time Complexity:</b> O(N)
 * <br><b>Space Complexity:</b> O(N) for character array
 */
class ReverseVowels {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int i = 0, j = arr.length - 1;

        while (i < j) {
            while (i < j && !isVowel(arr[i]))
                i++;
            while (i < j && !isVowel(arr[j]))
                j--;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return new String(arr);
    }

    private boolean isVowel(char ch) {
        return ("aeiouAEIOU".indexOf(ch) != -1);

    }
}