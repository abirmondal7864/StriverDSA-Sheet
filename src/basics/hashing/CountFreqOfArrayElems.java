package basics.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A class to demonstrate counting frequencies of elements in an array
 * using a HashMap for efficiency.
 */
public class CountFreqOfArrayElems{

    /**
     * Counts the frequency of each integer in the given array.
     *
     * @param arr the input array of integers
     * @return an ArrayList of ArrayLists, where each inner list contains:
     *         [element, frequency]
     *
     * Example:
     * Input: {10, 20, 10, 5, 20}
     * Output: [[10, 2], [20, 2], [5, 1]]
     */
    public static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {

        // HashMap to store frequency of each number
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Final result list
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Count frequency of each number
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Build the answer list from the frequency map
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());    // element
            temp.add(entry.getValue());  // frequency
            ans.add(temp);
        }

        return ans;
    }
}
