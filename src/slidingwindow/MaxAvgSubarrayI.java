package slidingwindow;

class MaxAvgSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        // First window sum
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            // Add curr elem
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        // Slide the window
        for (int i = k; i < nums.length; i++) {
            // Add next and remove leftmost
            windowSum += nums[i] - nums[i - k];
            // Update maxSum
            maxSum = Math.max(maxSum, windowSum);
        }
        // Return average
        return (double) maxSum / k;
    }
}