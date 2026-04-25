package greedy;

/**
 * Finds the minimum number of intervals to remove to make the rest non-overlapping.
 *
 * <p>
 * <b>Time Complexity:</b> O(N log N)
 * <br><b>Space Complexity:</b> O(1)
 */
class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Step 1: Sort by end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0; // number of intervals we can keep
        int prevEnd = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] >= prevEnd) {
                count++; // take it
                prevEnd = interval[1];
            }
        }

        return intervals.length - count; // removals
    }
}