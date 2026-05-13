package arrays.easy;

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; // current count of 1's
        int maxCount = 0; // max streak of 1's
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0; // reset count
            }
        }
        return maxCount;
    }
}