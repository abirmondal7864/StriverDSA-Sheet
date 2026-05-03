package stack;

import java.util.ArrayDeque;
import java.util.Deque;

class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int a : asteroids) {
            boolean exploded = false;

            // Stack not empty AND current < 0 AND last > 0
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                if (stack.peek() < -a) {
                    stack.pop(); // remove smaller
                } else if (stack.peek() == -a) {
                    exploded = true;
                    stack.pop();
                    break;
                } else {
                    exploded = true;
                    break;
                }
            }

            // Push if not exploded
            if (!exploded)
                stack.push(a);
        }

        int[] res = new int[stack.size()];
        int i = res.length - 1;
        for (int val : stack)
            res[i--] = val;
        return res;
    }
}