package arrays.easy;

class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0; // res will hold the single one later
        for (int num : nums) {
            res ^= num; // XOR with each no.
        }
        return res; // same elems cancelled out
    }
}