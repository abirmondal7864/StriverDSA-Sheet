package stack;

import java.util.ArrayDeque;
import java.util.Deque;

class DecodeString {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> strStack = new ArrayDeque<>();

        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char ch : s.toCharArray()) {
            // Build No. (multi-digit safe)
            if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0'); // shift left + add new digit
            }
            // Start of new bracket
            else if (ch == '[') {
                // Save current state
                countStack.push(currNum);
                strStack.push(currStr);
                // Reset for inner block
                currStr = new StringBuilder();
                currNum = 0;
            }
            // End bracket -> Decode
            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prevStr = strStack.pop();

                // Repeat curr str
                for (int i = 0; i < repeat; i++) {
                    prevStr.append(currStr);
                }
                currStr = prevStr;
            }
            // Normal character
            else {
                currStr.append(ch);
            }
        }
        return currStr.toString();
    }
}