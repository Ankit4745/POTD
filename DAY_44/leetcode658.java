package DAY_44;

import java.util.ArrayList;
import java.util.List;

public class leetcode658 {
    class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length - k;
        int i=0;
        while(i<n){
            int mid = (i+n)/2;

            if(x-arr[mid] > arr[mid+k]-x){
                i = mid+1;
            }
            else{
                n= mid;
            }
        }
        for(int j = i;j<i+k;j++){
            list.add(arr[j]);
        }
    return list;
    }
}
}
