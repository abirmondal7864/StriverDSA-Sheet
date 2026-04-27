package slidingwindow;

class LongestSubarrOnesAfter1Del {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int maxLen = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                zeros++;
            // shrink window if more than 1 zero
            while (zeros > 1) {
                if (nums[left] == 0)
                    zeros--;
                left++;
            }
            // length = window size - 1 (delete one element)
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}