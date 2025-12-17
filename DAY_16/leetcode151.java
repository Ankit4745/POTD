package DAY_16;

public class leetcode151 {
    class Solution {
    public String reverseWords(String s) {
     String[] sb = s.split(" +");
     StringBuilder sbi = new StringBuilder();
     for (int i=sb.length-1;i>= 0;i--){
        sbi.append(sb[i]);
        sbi.append(" ");
     }
      return sbi.toString().trim();
    }
   
}
}
