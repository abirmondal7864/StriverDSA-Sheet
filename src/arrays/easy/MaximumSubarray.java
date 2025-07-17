package arrays.easy;

public class MaximumSubarray{
    public int maxSubArray(int[] nums) {
        int currSum= 0;
        int maxSum=Integer.MIN_VALUE;
        for(int num : nums){
            currSum=Math.max(num,currSum+num);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}

