package queue;

import java.util.ArrayDeque;
import java.util.Deque;

class Dota2Senate {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Deque<Integer> radiant = new ArrayDeque<>();
        Deque<Integer> dire = new ArrayDeque<>();

        // Step 1: Fill queues with indices
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        // Step 2: Simulate rounds
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d) {
                // Radiant bans Dire -> comes back next round
                radiant.offer(r + n);
            } else {
                // Dire bans Radiant -> comes back next round
                dire.offer(d + n);
            }
        }
        // Step 3: Winner
        return (radiant.isEmpty()) ? "Dire" : "Radiant";
    }
}