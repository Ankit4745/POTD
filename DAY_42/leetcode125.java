package DAY_42;

public class leetcode125 {
    class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String str = "";
            for (int i=0; i<n; i++){
                char ch = Character.toLowerCase(s.charAt(i));
                  if((ch >= 'a' && ch <= 'z') ||(ch >= '0' && ch <= '9') ){
                      str += ch;
                  } 
            }
        int k = str.length();
        for(int i=0; i< k/2; i++){
    if(str.charAt(i) != str.charAt(k-i-1)){
                return false;
            
            }
        }





          return true;  
    }
}
}
