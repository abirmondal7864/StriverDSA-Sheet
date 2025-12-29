package arraysStrings;

import java.util.HashMap;

/**
 * Provides a solution to the classic Two Sum problem.
 *
 * <p>
 * Given an array of integers and a target value, this method finds two distinct
 * indices such that the numbers at those indices add up to the target.</p>
 *
 * <p>
 * The solution uses a HashMap to achieve an optimal time complexity of O(n) by
 * storing previously seen numbers along with their indices.</p>
 */
class TwoSum {

    /**
     * Finds indices of the two numbers such that they add up to the target.
     *
     * @param nums the input array of integers
     * @param target the target sum
     * @return an array containing the two indices whose values sum to target
     */
    public int[] twoSum(int[] nums, int target) {

        // Map to store number as key and its index as value
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array once
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            // Check if the complement already exists
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            // Store the current number with its index
            map.put(nums[i], i);
        }

        // According to problem constraints, a solution always exists
        return new int[]{};
    }
}
