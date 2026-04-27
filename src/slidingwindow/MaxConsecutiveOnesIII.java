package slidingwindow;

class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zerosCount = 0;
        int maxLen = 0;

        // 'right' expands the window
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                zerosCount++;
            // Shrink the window from the 'left' if condition is violated
            while (zerosCount > k) {
                if (nums[left] == 0)
                    zerosCount--;
                left++;
            }
            // Calculate current valid window size and update maxLen
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}