package hashing;

public class GroupAnagrams {
    /**
 * Groups strings that are anagrams of each other.
 * Uses character frequency as hashmap key.
 * Time: O(N * K), Space: O(N * K)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Frequency key -> list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            // Count frequency of characters
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Build unique key from frequency array
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
             keyBuilder.append('#').append(count);
            }
            String key = keyBuilder.toString(); 

            // Create group if absent
            map.putIfAbsent(key, new ArrayList<>());
            // Add original string
            map.get(key).add(s);

        }

        // Return grouped anagrams
        return new ArrayList<>(map.values());
    }
}

}
