package DAY_7;

import java.util.Arrays;

public class gfgminiplatfrom {
    class Solution {
    public int minPlatform(int arr[], int dep[]) {
        
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0;
        int l=1;
        int i=0;
        int j=0;
        while (i< arr.length && j < dep.length){
            if(arr[i] <= dep[j]){
                count++;
                i++;
            } else {
                j++;
                count--;
            }
            l= Math.max(l,count);
        }
        return l;
    }
}
    
}
