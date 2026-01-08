package DAY_37;

import java.util.Arrays;

public class gfg1 {
    class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        
        if (n == 1 || n==2){
            return true;
        } else if (n>2){
        if ( n % 2 == 0){
            String s = Integer.toBinaryString(n);
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            if (arr[arr.length-2] == '1'){
                return false;
            }
            else return true;
            

        } else {
            return false;
        }
        } else return false;
    }
}
}
