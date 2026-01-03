package arraysStrings;

import java.util.HashMap;

/**
 * LeetCode 3: Longest Substring Without Repeating Characters
 *
 * This method uses the Sliding Window technique with a HashMap
 * to find the length of the longest substring containing
 * all unique characters.
 *
 * Approach:
 * - Maintain a window [left, right] with no repeating characters.
 * - Use a HashMap to store the last index of each character.
 * - Expand the window using the right pointer.
 * - If a duplicate is found inside the window, move the left pointer.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class LengthOfLongestSubstring {

    /**
     * Returns the length of the longest substring without repeating characters.
     *
     * @param s the input string
     * @return the maximum length of a substring with all unique characters
     */
    public int lengthOfLongestSubstring(String s) {

        /**
         * HashMap to store characters and their most recent index.
         * Example: 'a' -> 0, 'b' -> 1
         */
        HashMap<Character, Integer> map = new HashMap<>();

        /**
         * Left pointer of the sliding window.
         * Represents the starting index of the current substring.
         */
        int left = 0;

        /**
         * Stores the maximum length of a valid substring found so far.
         */
        int maxLen = 0;

        /**
         * Right pointer moves through the string character by character.
         */
        for (int right = 0; right < s.length(); right++) {

            /**
             * Current character entering the sliding window.
             */
            char ch = s.charAt(right);

            /**
             * If the character already exists in the map AND
             * its last occurrence is inside the current window,
             * move the left pointer to avoid repetition.
             */
            if (map.containsKey(ch) && map.get(ch) >= left) {

                // Move left pointer just after the previous occurrence
                left = map.get(ch) + 1;
            }

            /**
             * Update the latest index of the current character.
             */
            map.put(ch, right);

            /**
             * Calculate the current window size and update maximum length.
             */
            maxLen = Math.max(maxLen, right - left + 1);
        }

        /**
         * Return the length of the longest valid substring.
         */
        return maxLen;
    }
}

