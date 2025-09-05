package arrays.easy;
public class MinMaxArray {
    public int[] getMinMax(int[] arr) {
        if(arr==null||arr.length==0) {
            return null;
        }

        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++)
            if(arr[i]>max){
                max=arr[i];
            } else if(arr[i]<min){
                min=arr[i];
            }
        return new int[]{min,max};
    }
}
