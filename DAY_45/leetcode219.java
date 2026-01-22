package DAY_45;

public class leetcode219 {
    import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> list = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!list.containsKey(nums[i])){
                list.put(nums[i],i);
            }else
            {
                int index = list.get(nums[i]);
                if(Math.abs(index-i) <= k){
                    return true;
                }else
                {
                    list.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
}
