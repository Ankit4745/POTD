package DAY_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class gfgStock {

    class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        
        int n= arr.length;
        ArrayList<Integer> stock = new ArrayList<>(Collections.nCopies(n,0));
        Stack<Integer> str = new Stack<>(); 
        
        for(int i=0;i<n;i++){
            while (!str.isEmpty() && arr[str.peek()] <= arr[i]){
                str.pop();
            }
            if (str.isEmpty()) {
                stock.set(i,(i+1));}
                else{
                stock.set(i, (i-str.peek()));
            }
            str.push(i);
        }
        return stock;
    }
}
}