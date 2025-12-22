package DAY_21;

public class leetcode223 {
    class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int first = (ax2-ax1)*(ay2-ay1);
        int second = (bx2-bx1)*(by2-by1);

        int diffx= Math.min(ax2,bx2) - Math.max(ax1,bx1);
        int diffy =Math.min(ay2,by2) - Math.max(ay1,by1);
         int diffA =0;
        if (diffx > 0 && diffy > 0){
           diffA = diffx*diffy;
        }
        return first+second-diffA;
    }
}
}
