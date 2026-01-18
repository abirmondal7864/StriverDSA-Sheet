package hashing;

import java.util.HashSet;

class LongestConsecutiveSequence {

    /**
     * Returns the length of the longest consecutive sequence in an unsorted array.
     *
     * A consecutive sequence means numbers appearing in increasing order
     * with a difference of exactly 1 (order in array does NOT matter).
     *
     * Example:
     * Input:  [100, 4, 200, 1, 3, 2]
     * Output: 4  (sequence: 1, 2, 3, 4)
     *
     * @param nums the input array of integers
     * @return the length of the longest consecutive elements sequence
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int longestConsecutive(int[] nums) {

        // Edge case: empty array
        if (nums.length == 0)
            return 0;

        /**
         * HashSet is used for:
         * 1. O(1) average lookup time
         * 2. Automatically removing duplicates
         */
        HashSet<Integer> set = new HashSet<>();

        // Insert all numbers into the HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Stores the maximum length found
        int longest = 1;

        /**
         * Iterate through each unique number in the set
         * We try to start a sequence ONLY if the number has no predecessor
         */
        for (int num : set) {

            /**
             * Check if num is the START of a sequence.
             * If (num - 1) exists, then num is NOT a start.
             */
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                /**
                 * Expand the sequence forward
                 * Example: num, num+1, num+2, ...
                 */
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest sequence length found so far
                longest = Math.max(longest, currentStreak);
            }
        }

        // Return the maximum consecutive sequence length
        return longest;
    }
}

