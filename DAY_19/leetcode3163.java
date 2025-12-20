public class leetcode3163 {
    class Solution {
    public String compressedString(String word) {
        StringBuilder newstr = new StringBuilder();
        for (int i=0;i<word.length();i++){
            Integer count =1;
            while (i<word.length()-1 && word.charAt(i) == word.charAt(i+1) && count<9){
                count++;
                i++;
            }
            
            newstr.append(count);

            newstr.append(word.charAt(i));
         
        }
       
        return newstr.toString();
    }
}
        
    
}
