package arrays.medium;

public class RepeatAndMissing {

        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
            long n=A.size();
            long sumOfN =n*(n+1)/2;
            long sumOfSquare =n*(n+1)*(2*n+1)/6; //Imp**

            long actualSum=0;
            long actualSquareSum=0;

            for(int num:A){
                actualSum+=(long) num;
                actualSquareSum+=(long) num*(long)num;
            }

            long diff=actualSum-sumOfN; //A-B
            long squareDiff=actualSquareSum-sumOfSquare; //A^2-B^2

            long sumAB=squareDiff/diff; //A+B

            long A_val= (diff+sumAB)/2; //A
            long B_val= sumAB-A_val; //B_val

            ArrayList<Integer> result= new ArrayList<>();
            result.add((int)A_val);
            result.add((int)B_val);

            return result;

        }


}
