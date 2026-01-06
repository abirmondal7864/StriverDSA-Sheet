package arraysStrings;
/**
 * Checks whether two strings are valid anagrams.
 *
 * An anagram is formed when both strings contain
 * the same characters with the same frequencies,
 * regardless of order.
 *
 * This implementation assumes:
 * - All characters are lowercase English letters (a–z)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class ValidAnagram {

    /**
     * Determines if two strings are anagrams.
     *
     * @param s the first input string
     * @param t the second input string
     * @return true if s and t are anagrams, false otherwise
     */
    public boolean isAnagram(String s, String t) {

        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length())
            return false;

        // Frequency array for characters a–z
        int[] freq = new int[26];

        // Count characters from s and cancel using t
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // increment for s
            freq[t.charAt(i) - 'a']--; // decrement for t
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        // All checks passed
        return true;
    }
}



// import java.util.HashMap;
// import java.util.Map;

// /**
//  * Unicode-safe anagram check using HashMap.
//  * Works for all characters including uppercase,
//  * special symbols, and non-English scripts.
//  */
// class ValidAnagram {

//     /**
//      * Checks if two strings are anagrams (Unicode-safe).
//      *
//      * @param s first input string
//      * @param t second input string
//      * @return true if s and t are anagrams, false otherwise
//      */
//     public boolean isAnagram(String s, String t) {

//         // Length check
//         if (s.length() != t.length())
//             return false;

//         // Frequency map for characters
//         Map<Character, Integer> freqMap = new HashMap<>();

//         // Count frequencies from s
//         for (char ch : s.toCharArray()) {
//             freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
//         }

//         // Cancel frequencies using t
//         for (char ch : t.toCharArray()) {
//             if (!freqMap.containsKey(ch) || freqMap.get(ch) == 0)
//                 return false;
//             freqMap.put(ch, freqMap.get(ch) - 1);
//         }

//         return true;
//     }
// }
