package arrays.easy;


import java.util.ArrayList;
import java.util.Collections;
public class chocolateDistribution {

    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // Edge case: Not enough packets to give each student one
        if (arr == null || arr.size() < m || m == 0) return 0;

        // Step 1: Sort the array in ascending order
        Collections.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Step 2: Use a sliding window of size 'm'
        // Start from index 0 to (n - m), inclusive
        for (int i = 0; i <= arr.size() - m; i++) {
            // Find difference between max and min in this group
            int currentDiff = arr.get(i + m - 1) - arr.get(i);

            // Update the minimum difference found so far
            minDiff = Math.min(minDiff, currentDiff);
        }

        // Step 3: Return the smallest possible difference
        return minDiff;
    }
}
