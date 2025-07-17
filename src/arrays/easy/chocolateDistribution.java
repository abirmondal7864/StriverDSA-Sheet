package arrays.easy;


// //First approach
//import java.util.Arrays;
//public class chocolateDistribution {
//    public int findMinDiff(ArrayList<Integer> arr, int m) {
//        Integer[] array= arr.toArray(new Integer[0]);
//        Arrays.sort(array);
//
//        int minDiff=Integer.MAX_VALUE;
//        int n= array.length;
//
//        int i=0;
//        while(i+m-1<n){
//            if(array[i+m-1]-array[i]<minDiff)
//                minDiff=array[i+m-1]-array[i];
//            i++;
//        }
//        return minDiff;
//    }
//}


//Submitted approach
import java.util.ArrayList;
import java.util.Collections;
class chocolateDistribution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<=arr.size()-m;i++){
            int diff=arr.get(i+m-1)-arr.get(i);
            minDiff= Math.min(diff,minDiff);
        }
        return minDiff;
    }
}
