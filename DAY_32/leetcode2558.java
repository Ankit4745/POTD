package DAY_32;

import java.util.PriorityQueue;

public class leetcode2558 {

    class Solution {
    public long pickGifts(int[] gifts, int k) {
        long count =0;
        PriorityQueue<Integer> pri = new PriorityQueue<Integer>((a,b) -> Integer.compare(b ,a));
        for(int  sum : gifts){
            count += sum;
            pri.add(sum);
        }
        while(k-- >0){
            int big = pri.poll();
            count -= big;
            int sqrt = (int) Math.sqrt(big);
            pri.add(sqrt);
            count += sqrt;

        }
        return count;
    }
}
}