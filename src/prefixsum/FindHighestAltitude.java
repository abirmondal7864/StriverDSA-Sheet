package prefixsum;

class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n + 1];
        alt[0] = 0;
        for (int i = 1; i <= n; i++) {
            alt[i] = alt[i - 1] + gain[i - 1];
        }
        int maxAlt = alt[0];
        for (int h : alt) {
            maxAlt = Math.max(maxAlt, h);
        }
        return maxAlt;
    }
}