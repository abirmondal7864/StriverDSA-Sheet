package arrays.easy;

public class ReverseArray {
    public void reverseArray(int arr[]) {
        //two pointers
        int start =0;
        int end =arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            //move both pointers to the centre
            start++;
            end--;
        }
    }
}
