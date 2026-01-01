package arraysStrings;

/**
 * Solution class to find the Majority Element in an array.
 *
 * A Majority Element is an element that appears more than ⌊n/2⌋ times.
 *
 * This implementation uses Moore’s Voting Algorithm to find a potential
 * candidate in O(n) time and O(1) space, followed by a verification step to
 * handle cases where the majority element is NOT guaranteed.
 */
class MajorityElement {

    /**
     * Finds the majority element in the array.
     *
     * @param nums the input integer array
     * @return the majority element if it exists, otherwise -1
     */
    public int majorityElement(int[] nums) {

        // Step 1: Find potential candidate using Moore’s Voting Algorithm
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // choose new candidate
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify the candidate (important if majority is not guaranteed)
        int freq = 0;
        for (int num : nums) {
            if (num == candidate) {
                freq++;
            }
        }

        // Check if candidate is actually a majority element
        if (freq > nums.length / 2) {
            return candidate;
        }

        return -1; // no majority element exists
    }
}
