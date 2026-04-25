package arraysstrings;

/**
 * Finds which kids have the greatest number of candies after receiving the extra candies.
 *
 * <p>
 * <b>Time Complexity:</b> O(N)
 * <br><b>Space Complexity:</b> O(N)
 */
class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find max of candies
        int max = candies[0];
        for (int c : candies) {
            max = Math.max(max, c);
        }
        // Step 2: Check for each kid
        List<Boolean> res = new ArrayList<>();
        for (int c : candies) {
            if (c + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}