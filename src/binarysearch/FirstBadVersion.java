package binarysearch;

/**
 * Finds the first bad version among versions 1 to n.
 * Uses binary search on the version range where versions are monotonic
 * (all good versions come before bad versions).
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * @param n total number of versions
 * @return the first bad version
 */
public class FirstBadVersion extends VersionControl {

    /**
     * Returns the earliest version for which isBadVersion(version) is true.
     *
     * @param n total number of versions
     * @return first bad version
     */
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;      // keep mid, could be first bad
            } else {
                left = mid + 1;   // discard good versions (at left part)
            }
        }
        return left;
    }
}

