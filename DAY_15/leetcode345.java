public class leetcode345 {
    class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j= arr.length-1;
        while (i<j){
            char temp = arr[i];
            if ((temp == 'a') || (temp == 'A') || (temp == 'e') || (temp == 'E') || (temp == 'i') || (temp == 'I') || (temp == 'o') ||  (temp == 'O') || (temp == 'u') || (temp == 'U')){
                char tempj = arr[j];
                 if ((tempj == 'a') || (tempj == 'A') || (tempj == 'e') || (tempj == 'E') || (tempj == 'i') || (tempj == 'I') || (tempj == 'o') ||  (tempj == 'O') || (tempj == 'u') || (tempj == 'U')){
                    arr[i] = tempj;
                    arr[j] = temp;
                    i++;
                    j--;
                   
                 }
                 else {
                    j--;
                 }
            } else {
                i++;
            }
        }
        return new String(arr);
    }
}
}
