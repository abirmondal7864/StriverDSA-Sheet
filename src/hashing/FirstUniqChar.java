package hashing;

class FirstUniqChar {

    /**
     * Returns the index of the first non-repeating character in the string.
     *
     * Approach:
     * 1) Count frequency of each lowercase character.
     * 2) Traverse string again to find the first character with frequency = 1.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int firstUniqChar(String s) {

        // Frequency array for lowercase letters a-z
        int[] freq = new int[26];

        // First pass: count character frequencies
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Second pass: find first unique character index
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }

        // No unique character found
        return -1;
    }
}
