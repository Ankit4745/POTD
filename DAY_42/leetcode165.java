package DAY_42;

public class leetcode165 {
    class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr = version1.split("\\.");
        String[] brr = version2.split("\\.");

        int max = Math.max(arr.length,brr.length);
        int temp1 = 0;
        int temp2 = 0;
        for (int i=0; i< max ; i++){
            if (i<arr.length){
                  temp1 = Integer.parseInt(arr[i]);
                 }
            else {
                 temp1 = 0;}
            if (i<brr.length){
          temp2 =Integer.parseInt(brr[i]);}
            else{ 
                 temp2 = 0;}
            if (temp1 < temp2) return -1;
            else if (temp1 > temp2) return 1;
        }

        return 0;
    }
}
}
