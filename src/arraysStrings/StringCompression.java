class StringCompression {
    public int compress(char[] chars) {
        int i = 0; // start of group
        int write = 0; // where to write result
        while (i < chars.length) {
            char current = chars[i];
            int j = i;
            // count same characters
            while (j < chars.length && chars[j] == current)
                j++;
            int count = j - i;
            // write the character
            chars[write++] = current;
            // write count if > 1
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
            // move to next group
            i = j;
        }
        return write;
    }
}