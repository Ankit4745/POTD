import java.util.Stack;

public class gfg2 {
    class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> str = new Stack<>();
        
        for(String temp : arr){
            if(Character.isDigit(temp.charAt(0)) || (temp.length() > 1 && temp.charAt(0) =='-')){
                str.push(Integer.parseInt(temp));
            }
            else {
                int count = str.pop();
                int count1 = str.pop();
                
                if(temp.equals("+")) str.push(count + count1);
                else  if(temp.equals("-")) str.push(count1 - count);
                else  if(temp.equals("*")) str.push(count * count1);
                else if(temp.equals("^")) str.push((int)Math.pow(count1 , count));
                else  if(temp.equals("/")){
                    if (count1 * count <0 && count1 % count != 0) str.push((count1/count)-1);
                    else str.push(count1 / count);
                }
            }
        }
        
        return str.pop();
    }
}
}
