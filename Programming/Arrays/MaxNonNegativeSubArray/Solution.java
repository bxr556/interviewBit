

import java.math.BigInteger;

public class Solution {

    public int[] maxset(int[] A) {

        //all negative
        //p n p n n
        //
        int resultIndex = 0;
        BigInteger resultMax = BigInteger.ZERO;
        int resultLength = 0;

        int currentIndex = 0;
        BigInteger currentMax = BigInteger.valueOf(0);
        int currentLength = 0;

        for (int i = 0; i <= A.length-1; i++) {
            if (A[i] < 0) {

                currentMax = BigInteger.ZERO;
                currentIndex = i + 1;
                currentLength = 0;
            } else {
                currentMax = currentMax.add(BigInteger.valueOf(A[i]));
                currentLength++;
                if (currentMax.compareTo(resultMax)>0) {
                    resultMax = currentMax;
                    resultLength=currentLength;
                    resultIndex = currentIndex;
                } else if (((currentMax == resultMax)) &&(currentLength > resultLength)) {
                    resultLength = currentLength;
                    resultIndex = currentIndex;
                }
            }
        }

        int[] resultArray = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            resultArray[i] = A[resultIndex + i];
        }

        return resultArray;
    }

    public static void main (String[] args){
        int[] a = new int[]{ 1967513926, 1540383426, -1303455736, -521595368
};
        Solution s = new Solution();
        int[] b = s.maxset(a);
        for (int i =0;i< b.length;i++){
            System.out.println(b[i]);
        }
    }
}

