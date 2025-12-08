package DAY_8;

public class leetcode53 {

    public static void main(String[] args) {
        class Solution {
    public int maxSubArray(int[] nums) {
          int c = Integer.MIN_VALUE;
          int b =0;
          int i=0;
          while (i < nums.length){
            b += nums[i];
            c = Math.max(c,b);

            if (b < 0) {
                b = 0;
            }
            i++;
          }
          return c;
          }
}
    }
}