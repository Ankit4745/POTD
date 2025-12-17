package DAY_16;

public class leetcode238 {
    class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] ans = new int[n];
        for (int i=0;i<n;i++){
            ans[i] = 1;
        }
        int pre= 1;
        for (int i=1;i<n;i++){
            pre *= nums[i-1];
            ans[i] *= pre;
        }
        int suf =1;
        for (int i=n-2;i>=0;i--){
            suf *= nums[i+1];
            ans[i] *= suf;
        }

        
        return ans;
    }
}
}
