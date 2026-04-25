package arraysstrings;

/**
 * Checks if 'n' new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 *
 * <p>
 * <b>Time Complexity:</b> O(N)
 * <br><b>Space Complexity:</b> O(1)
 */
class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {

                int left = (i == 0) ? 0 : flowerbed[i - 1];
                int right = (i == len - 1) ? 0 : flowerbed[i + 1];

                if (left == 0 && right == 0) {
                    flowerbed[i] = 1; // place flower
                    count++;

                    if (count >= n)
                        return true;

                    i++; // skip next index
                }
            }
        }
        return count >= n;
    }
}