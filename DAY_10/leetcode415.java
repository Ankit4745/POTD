/* Leetcode problem number 415
Name = Kushawaha Ankitkumar Vinodkumar
Res. No. = 2025CA054
Date = 2/12/2025  */
package DAY_10; 
public class leetcode415 {
class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder s = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0){
            int a = 0;
            int b = 0;
            if (i >= 0){
                a = num1.charAt(i) - '0';
                i--;
            }
             if (j >= 0){
                b = num2.charAt(j) - '0';
                j--;
            }
            int add = a + b + carry;
            s.append(add % 10);
            carry = add / 10;
        }

     return s.reverse().toString();
}
}
    
}