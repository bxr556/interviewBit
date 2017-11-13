import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {

        HashMap<Integer,Integer> aHM = new HashMap<>();

        for (int i =0;i<A.length;i++){
            if (aHM.containsKey(A[i])){
                continue;
            }

            aHM.put(A[i],1);


            int t1 = A[i];
            int t2 = A[i];

            while(aHM.containsKey(t1)){
                t1--;
            }
            t1++;

            while(aHM.containsKey(t2)){
                t2++;
            }
            t2--;

            int tt = 1;

            if (t1<A[i] && t2>A[i]){
                tt=aHM.get(t1)+aHM.get(t2)+1;
                aHM.put(t1,tt);
                aHM.put(t2,tt);
            }else if (t1<A[i]){
                tt=aHM.get(t1)+1;
                aHM.put(t1,tt);
                aHM.put(A[i],tt);

            } else if (t2 > A[i]) {
                tt=aHM.get(t2)+1;
                aHM.put(t2,tt);
                aHM.put(A[i],tt);
            }

        }
        int max =0;
        int[] a;


        Iterator it = aHM.entrySet().iterator();
       while(it.hasNext()){
           Map.Entry pair = (Map.Entry)it.next();
           if ( (int)pair.getValue()>max){
               max =(int)pair.getValue();
           }
        }


        return max;
    }

    public static void main(String[] args){
        //int[] a = {100,4,200,1,3,2};
        //int[] a ={6,4,5,2,3};
        int[] a ={ 50, 51, 15, 101, 23, 66, 69, 24, 75, 40, 30, 10, 61, 73, 95, 119, 106, 60, 26, 111, 54, 79, 18, 28, 72, 110, 37, 63, 5, 102, 53, 42, 49, -4, -2, 64, 93, 117, 103, 115, -5, 87, 47, 12, 48, 1, 9, 91, 85, -3, 68, 76, 59, 38, 35, 45, 0, 78, 62, 70, 46, 90, 52, 3, 83, 43, 11, 89, 21, 80, 77, 33, 17, 92, 113 };
        Solution s = new Solution();
        System.out.println(s.longestConsecutive(a));
    }
}

