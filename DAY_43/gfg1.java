package DAY_43;

public class gfg1 {
    class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum =0;
       for(int i=0;i<k;i++){
           sum += arr[i];
       }
       
        int max = sum;
        
        
        for(int i=1;i<=arr.length-k;i++){
            int j = i+k-1;
            sum -= arr[i-1];
            sum += arr[j];
    max = Math.max(max,sum);
    }
    return max;
}
}
}
