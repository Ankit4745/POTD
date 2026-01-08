package DAY_36;

import java.util.Arrays;
import java.util.HashMap;

public class gfg1 {
class Solution {
    public int[] singleNum(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int k = 0;
        for(int i=0;i<n;i++){
            int freq = map.get(arr[i]);
            if(freq==1) ans[k++]=arr[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}

    
}
