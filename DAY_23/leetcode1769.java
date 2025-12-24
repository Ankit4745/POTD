package DAY_23;

public class leetcode1769 {
    class Solution {
    public int[] minOperations(String boxes) {
        int n= boxes.length();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
                    int count =0;
            for(int j =0;j<n;j++){
                char c  = boxes.charAt(j);
                if (c == '1'){
                    count += Math.abs(j-i);
                }
            }
                                arr[i] = count;

        }
        return arr;
    }
}
}
