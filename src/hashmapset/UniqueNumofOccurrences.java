package hashmapset;

class UniqueNumofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        // Step 1: Count frequencies
        for (int num : arr)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        // Step 2: Check uniqueness using set
        Set<Integer> set = new HashSet<>();
        for (int freq : freqMap.values()) {
            if (set.contains(freq))
                return false;
            set.add(freq);
        }
        return true;
    }
}