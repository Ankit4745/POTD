package DAY_50;

public class leetcode60 {
    class Solution {
    public int mySqrt(int x) {
        
        int t =0;
    
        for(long i=0;i<=x;i++){
            if(i*i <= x) {
               t = (int)i;
               
            } else {
                break;
            }
        }
        
        return t;
    }
}
}
