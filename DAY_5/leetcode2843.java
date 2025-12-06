package DAY_5;

public class leetcode2843 {

    class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count =0;
        for(int i=low; i<= high; i++){
           String S = String.valueOf(i);
           int size = S.length();
            if ( size % 2 != 0){
               continue;
            }
            int mid = size / 2 ;
            int first = 0;
            int last = 0;

            for (int j=0; j<mid; j++){
                first += S.charAt(j) - '0'; 
            }
             for (int j=mid; j<size; j++){
                last += S.charAt(j) - '0'; 
             }
             if (first == last){
                count++;
             }
        }
        
       
        return count;
        
    }
}
}