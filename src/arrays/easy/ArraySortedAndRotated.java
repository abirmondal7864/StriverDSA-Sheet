package arrays.easy;

public class ArraySortedAndRotated{
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        // checking for the number of dips
        for (int i = 0; i < n; i++) {
            // if count > 1 return false
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        // if count is less than or equal to 1, return true
        return count <= 1;
    }
}
