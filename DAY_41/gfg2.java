package DAY_41;

import java.util.HashSet;

public class gfg2 {
    
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        HashSet<Integer> count = new HashSet<>();
            
            
            for(int i=0;i<arr.length;i++){
            int temp = target- arr[i];
            
            if(count.contains(temp)){
                return true;
            }
            count.add(arr[i]);
            }
        
        return false;
    }
}

}
