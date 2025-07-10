package arrays;

public class searchRotatedSortedArr {
    public int search(int[] nums, int target) {
        int  left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            //target found
            if(nums[mid]==target)   return mid;

            //check which subarray  is sorted
            if(nums[left]<=nums[mid]){
                //left subarray sorted
                if(nums[left]<=target && target < nums[mid]){
                    right=mid-1; //found in left
                }else{
                    left=mid+1;//found in right
                }
            }else{
                //right subarray sorted
                if(nums[mid]< target && target<=nums[right]){
                    left= mid+1; //found in right
                }else{
                    right=mid-1; //found in left
                }
            }
        }
        return -1; //not found
    }
}
