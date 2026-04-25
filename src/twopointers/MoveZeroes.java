package twopointers;
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // Position to keep next non zero
        int pos = 0;
        // Move non zeros to left
        for (int num : nums) {
            if (num != 0)
                nums[pos++] = num;
        }
        // Fill remaining with zeros
        while (pos < nums.length) {
            nums[pos++] = 0;
        }

    }
}   