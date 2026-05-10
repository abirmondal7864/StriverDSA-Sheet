package arrays.easy;

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) { 
        if (nums.length == 0) return 0;  

        int i = 0; // points to last unique elem

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // move i forward
                nums[i] = nums[j]; // overwrite duplicate
            }
        }
        return i + 1; // length of unique elements = i + 1
    }
}