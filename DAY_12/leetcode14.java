package DAY_12;

public class leetcode14 {
    class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for (int i=1; i<strs.length; i++){
            while (!strs[i].startsWith(first)){
                first = first.substring(0,first.length() - 1);
               
                
            }
        }
      return first;
        
    }
}
    
}
