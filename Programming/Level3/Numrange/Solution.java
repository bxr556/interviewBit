public class Solution {
     
    public int numRange(int[] A, int B, int C) {

        int count =0;
        int total =0;
        int array_length = A.length;

        for ( int i =0; i<array_length;i++){
            count=0;

            for ( int j=i;j<array_length;j++){

                count += A[j];

                    if ((count>=B) && (count<=C)){
                        total++;
                    }else if (count>=C){
                        break ;
                    }
            }
        }

        return total;
    }
}

