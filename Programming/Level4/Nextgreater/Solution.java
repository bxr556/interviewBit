public class Solution {
    public int[] nextGreater(int[] A) {
         int[] returnArray = new int[A.length];

        for ( int i=0;i<A.length;i++){
            returnArray[i]=-1;
        }

        for ( int i=0;i<A.length-1;i++){
            for ( int j=i+1;j<A.length;j++){
                if (A[i]<A[j]){
                    returnArray[i]=A[j];
                    break;
                }
            }
        }



        return returnArray;
    }

    public static void main(String[] args){
        Solution a = new Solution();
        int[] b = {4,5,2,10};
        int[] c = a.nextGreater(b);

        for ( int i=0;i<b.length;i++){
            System.out.println(c[i]);
        }
        return;
    }
}
