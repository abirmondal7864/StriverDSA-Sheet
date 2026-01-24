package hashing;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {

    /**
     * Checks whether the array contains any duplicate element.
     *
     * @param nums the input array of integers
     * @return true if any value appears at least twice, false otherwise
     *
     * Time Complexity: O(n) Space Complexity: O(n)
     */
    public boolean containsDuplicate(int[] nums) {

        // HashSet to store elements seen so far
        Set<Integer> set = new HashSet<>();

        // Traverse the array
        for (int num : nums) {

            // If element already exists, duplicate found
            if (set.contains(num)) {
                return true;
            }

            // Otherwise, add element to set
            set.add(num);
        }

        // No duplicates found
        return false;
    }
}
