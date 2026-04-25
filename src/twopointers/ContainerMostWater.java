package twopointers;

class ContainerMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            // Calculate width between pointers
            int width = right - left;
            // Calculate current area using shorter wall
            int currentWater = Math.min(height[left], height[right]) * width;
            // Update global maximum
            maxWater = Math.max(maxWater, currentWater);
            // Move ptr pointing to shorter wall
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}