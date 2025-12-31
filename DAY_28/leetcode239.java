public class leetcode239 {
    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length-k+1];
        int j=0;
        ArrayDeque<Integer> qu = new ArrayDeque();

        for(int i=0;i<nums.length;i++){
            while (!qu.isEmpty() && nums[qu.getLast()] < nums[i]){
                qu.removeLast();
            }
            qu.addLast(i);
            if (qu.getFirst() + k == i){
                qu.removeFirst();
            }
            if ( i >= k-1){
                arr[j++] = nums[qu.getFirst()];
            }
        }
        return arr;
        
    }
}
}
