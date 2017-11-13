

public class Solution {
    public int[] plusOne(int[] A) {
        
        //handle 0 0 0 0 situation.
        
        
        int firstNonZero=0;
        
        while(true){
            if (A[firstNonZero]!=0){
                break;
            }
            firstNonZero++;
            
            if (firstNonZero >= A.length){
                return new int[]{1};
            }
            
            
        }
        
        
    for (int i = A.length - 1; i >= 0; --i) {
        A[i]++;
        if (A[i] < 10) {
            int[] result = new int[A.length -firstNonZero];
            System.arraycopy(A, firstNonZero, result, 0, result.length);
            return result;
        }
        A[i] = 0;
    }
    int[] result = new int[A.length-firstNonZero + 1];
    System.arraycopy(A, firstNonZero, result, 1, A.length);
    result[0] = 1;
    return result;
}
}
