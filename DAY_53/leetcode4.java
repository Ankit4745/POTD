package DAY_53;

import java.util.Arrays;

public class leetcode4 {
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length]; 
         double M;
        for (int i=0; i<nums1.length; i++){
            array[i]= nums1[i];
        }
         for (int i=0; i<nums2.length; i++){
            array[nums1.length + i]= nums2[i];
        }
        Arrays.sort(array);
        if (array.length % 2 == 0){
            int mid = array.length / 2;
             M = (array[mid] + array[mid-1]) / 2.0;
        }
        else {
            int mid = array.length / 2;
             M = array[mid];
        }
        return M;
    }
}
}
