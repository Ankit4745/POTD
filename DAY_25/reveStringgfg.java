package DAY_25;
import java.util.Stack;

public class reveStringgfg {
    
class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<S.length();i++){
            stack.push(S.charAt(i));
        }
        // int j=0;
        String s ="";
        while(!stack.isEmpty()){
            s += stack.pop();
        }
    return s;
    }
}
}
