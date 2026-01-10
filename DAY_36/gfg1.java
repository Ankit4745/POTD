package DAY_36;

import java.util.*;

public class gfg1 {
class Solution {
    public int[] singleNum(int[] arr) {
       HashSet<Integer> list = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i]))
                list.add(arr[i]);
                 else {
                list.remove(arr[i]);
            }
            }
           
              int[] result = new int[list.size()];
        int idx = 0;
        for (int x : list) {
            result[idx++] = x;
        }
        Arrays.sort(result);
    return result;
    
    }
}
}

    