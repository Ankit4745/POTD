package DAY_62;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       list.add(new ArrayList());
       for(int i=0;i<nums.length;i++){
        int k = list.size();
        for(int j=0;j<k;j++){
            List<Integer> temp = new ArrayList(list.get(j));
            temp.add(nums[i]);
            list.add(temp);
        }
      
       }

        return list;
    }
}
}
