package DAY_26;

import java.util.LinkedList;
import java.util.Queue;

public class gfg {
    class Solution {
    public String firstNonRepeating(String s) {
        // code here
        
        StringBuilder str = new StringBuilder();
        Queue<Character> qu = new LinkedList<>();
        int arr[] = new int[26];
        for( char ch : s.toCharArray()){
            arr[ch -'a']++;
            if(arr[ch -'a'] <= 1){
                qu.add(ch);
            }
            else {
                qu.remove(ch);
            }
            if (qu.isEmpty()){
                str.append("#");
            }
            else {
                str.append(qu.peek());
            }
        }
        return str.toString();
        
    }
}
}
