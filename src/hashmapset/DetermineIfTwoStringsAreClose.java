package hashmapset;

class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        // Step 1: Frequency maps
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        for (char c : word2.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0) + 1);

        // Step 2: Check same character set*
        if (!map1.keySet().equals(map2.keySet()))
            return false;

        // Step 3: Compare frequencies (as multiset)
        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        if (!freq1.equals(freq2))
            return false;

        return true;
    }
}