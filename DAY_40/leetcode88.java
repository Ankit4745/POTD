package DAY_40;

import java.util.Arrays;

public class leetcode88 {
    class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        while(i<n){
            nums1[m] = nums2[i];
            m++;
            i++;
        }
        Arrays.sort(nums1);
    }
}
}
