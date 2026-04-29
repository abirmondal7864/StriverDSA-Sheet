package prefixsum;

class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];

        sumLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i];
        }

        sumRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? 0 : sumLeft[i - 1];
            int right = (i == n - 1) ? 0 : sumRight[i + 1];

            if (left == right)
                return i;
        }

        return -1;
    }
}