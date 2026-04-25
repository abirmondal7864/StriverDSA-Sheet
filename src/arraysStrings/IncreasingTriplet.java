package arraysstrings;

/**
 * Determines if there exists an increasing triplet subsequence in the array.
 *
 * <p>
 * <b>Time Complexity:</b> O(N)
 * <br><b>Space Complexity:</b> O(1)
 */
class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true; // found third
            }
        }
        return false;
    }
}