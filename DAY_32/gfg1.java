package DAY_32;

import java.util.PriorityQueue;

public class gfg1 {
    class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pri = new PriorityQueue<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
          pri.add(arr[i]);
        }
        int count =0;
        
        while (pri.size() > 1){
            int temp = pri.poll();
            int temp1 = pri.poll();
            
            count += temp+temp1;
            pri.add(temp+temp1);
        }
        
        return count;
    }
}
}
