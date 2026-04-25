class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--; // skip spaces
            if (i < 0)
                break;
            int j = i; // end of word
            while (i >= 0 && s.charAt(i) != ' ')
                i--; // find start of word
            if (res.length() > 0)
                res.append(' ');
            res.append(s.substring(i + 1, j + 1));
        }
        return res.toString();
    }
}