package twopointers;

class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for s
        int j = 0; // pointer for t
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++; // if match found
            j++; // move j always
        }
        return i == s.length(); // if all characters of s matched
    }
}