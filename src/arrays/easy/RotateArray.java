package arrays.easy;

class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // Step 0: Handle large k
        k = k % n; // normalized

        // Step 1: Reverse whole arr
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse array part
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            // swap
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            // move left and right
            left++;
            right--;
        }
    }
}
