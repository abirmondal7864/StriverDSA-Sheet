package greedy;

/**
 * Assigns cookies to children to maximize the number of content children.
 *
 * <p>
 * <b>Time Complexity:</b> O(N log N)
 * <br><b>Space Complexity:</b> O(1) assuming sort is in-place
 */
class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // sort greed
        Arrays.sort(s); // sort cookies
        
        int i = 0; // child pointer
        int j = 0; // cookie pointer
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // child satisfied
            }
            j++; // move to next cookie always
        }
        
        return i; // number of satisfied children
    }
}
