package basics.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * This program finds the element with the highest and lowest frequency
 * in an integer array.
 */
public class maxMinFreqElems {
    /**
     * Finds and prints the elements with the highest and lowest frequency
     * in the given array.
     *
     * @param arr the input array of integers
     */
    static void findFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        int maxElement = 0, minElement = 0;

        // Find max and min frequency elements
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = element;
            }
            if (count < minFreq) {
                minFreq = count;
                minElement = element;
            }
        }

        System.out.println("Highest frequency element: " + maxElement);
        System.out.println("Lowest frequency element: " + minElement);
    }
}
