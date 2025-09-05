package basics.hashing;

import java.util.*;

/**
 * A utility class to calculate the difference between the highest
 * and lowest frequencies of elements in an integer array.
 */
public class maxMinFreqDiff {

    /**
     * Finds the difference between the maximum and minimum frequency
     * of elements in the given array.
     *
     * @param arr the input array of integers
     * @return the difference between the highest and lowest frequency
     * of any element; returns 0 if the array is null or empty
     */
    public static int findDiff(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        // Count frequencies of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find maximum and minimum frequency
        int maxFreq = Collections.max(freqMap.values());
        int minFreq = Collections.min(freqMap.values());

        return maxFreq - minFreq;
    }

    /**
     * Driver method to test the findDiff function.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};
        System.out.println("Difference between highest and lowest frequency: " + findDiff(arr));
    }
}


