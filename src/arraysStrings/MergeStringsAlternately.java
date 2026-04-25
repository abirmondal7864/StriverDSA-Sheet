package arraysstrings;

/**
 * Merges two strings by adding letters in alternating order.
 *
 * <p>
 * <b>Time Complexity:</b> O(M + N)
 * <br><b>Space Complexity:</b> O(M + N)
 */
class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        
        int i = 0, j = 0;

        // Step 1: alternate merge
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }

        // Step 2: leftover from word1
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }

        // Step 3: leftover from word2
        while (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }

        return result.toString();
    }
}