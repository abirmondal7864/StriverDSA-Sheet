package arrays.medium;

public class NextPermutation {
        public void nextPermutation(int[] nums) {
            int i=nums.length-2;
        //nums[i + 1] will throw ArrayIndexOutOfBounds when i == nums.length - 1

            while(i>=0 && nums[i]>=nums[i+1]){
                i--;
            }

            if(i>=0){ //Imp***
                for(int j=nums.length-1;j>i;j--){//Imp***
                    if(nums[j]>nums[i]){

                        //swap nums[i] & nums[j]
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break; //Imp*** //It prevents over-swapping
                    }
                }

            }

//Reverse from i+1 to end
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int tmp=nums[left];
                nums[left]=nums[right];
                nums[right]=tmp;
                left++;
                right--;
            }
            System.out.println(nums);
        }
    }

