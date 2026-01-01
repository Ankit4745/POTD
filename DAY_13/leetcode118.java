package DAY_13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode118 {
    class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new LinkedList<>();
        if (numRows < 1){
            return list;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        list.add(temp);

        for(int i=1;i<numRows;i++){
            List<Integer> ans = new LinkedList<>();
            ans.add(1);
            for(int j=1; j< i;j++){
                int count = temp.get(j) + temp.get(j - 1);
                ans.add(count);
            }
            ans.add(1);
            list.add(ans);
            temp = ans;
        }
        return list;
    }
}
}
