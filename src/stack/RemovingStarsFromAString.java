package stack;

import java.util.ArrayDeque;
import java.util.Deque;

class RemovingStarsFromAString {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (!stack.isEmpty())
                    stack.pop(); // pop() LIFO
            } else {
                stack.push(ch); // push(ch) LIFO
            }
        }
        // build result
        StringBuilder sb = new StringBuilder();
        for (char ch : stack)
            sb.append(ch);

        return sb.reverse().toString();
    }
}