import java.util.Stack;

public class gfg1 {
    class Solution {
    
    
    static int pre(char c){
        if (c == '^') return 3;
        else if (c == '/' || c == '*') return 2;
        else if (c == '-' || c == '+') return 1;
        else return -1;
        
    }
    
    static boolean rigth(char c){
        return c == '^';
    }
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> str = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                sb.append(c);
            }else if(c == '('){
                str.push('(');
            } else if (c == ')'){
                while (!str.isEmpty() && str.peek() != '('){
                    sb.append(str.pop());
                }
                str.pop();
            }
            else {
                while (!str.isEmpty() && str.peek() != '(' && (pre(str.peek()) > pre(c) || (pre(str.peek()) == pre(c) && !rigth(c)))){
                    sb.append(str.pop());
                }
                str.push(c);
            }
        }
        
        while (!str.isEmpty()){
            sb.append(str.pop());
        }
        return sb.toString();
    }
}
}
