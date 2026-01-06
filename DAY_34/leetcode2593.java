public class leetcode2593 {
    class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<int[]> pri = new PriorityQueue<>((a,b) ->{
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            pri.add(new int[]{nums[i], i});
        }
        boolean[] marked = new boolean[n];
        long ans =0;

        while(!pri.isEmpty()){
            int[] curr = pri.poll();
            int currNum = curr[0];
            int currIdx = curr[1];

            if (marked[currIdx]){
                continue;
            }
            ans += currNum;
            marked[currIdx] = true;
            if (currIdx + 1 < n){
                marked[currIdx + 1] = true;
            }
            if (currIdx -1 >= 0){
                marked[currIdx -1] = true;
            }
            
        }
         
           return ans;
    }
}
}
