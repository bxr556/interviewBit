public class Solution {
    public int[][] prettyPrint(int A) {
        
        int[][] returnArray = new int[A*2-1][A*2-1];
        
        for (int i=0;i<A*2-1;i++){
            for (int j=0;j<A*2-1;j++){
                returnArray[i][j]=A-Math.min(Math.min(i,j), Math.min(Math.abs(A*2-2-i), Math.abs(A*2-2-j)));
            }
        }
        
        return returnArray;
    }
}

