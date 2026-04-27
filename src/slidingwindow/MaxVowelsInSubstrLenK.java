package slidingwindow;

class MaxVowelsInSubstrLenK {
    public int maxVowels(String s, int k) {
        int n = s.length();
        if (n < k)
            return -1; // Edge case: string is smaller than window

        int windowVowels = 0;

        // 1. Compute the no. of vowels of the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                windowVowels++;
        }

        int maxVowels = windowVowels;

        // 2. Slide the window from index k to n-1
        for (int i = k; i < n; i++) {
            // Add new char**
            if (isVowel(s.charAt(i)))
                windowVowels++;
            // Remove old char**
            if (isVowel(s.charAt(i - k)))
                windowVowels--;

            maxVowels = Math.max(maxVowels, windowVowels);
            if (maxVowels == k)
                return k; // early exit for performance
        }
        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
