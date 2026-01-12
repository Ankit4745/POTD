package DAY_41;

public class gfg1 {
    class Solution {
    public void sort012(int[] arr) {
        // code here
        int z=0,o=0,t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0 ) z++;
            else if(arr[i] == 1) o++;
            else t++;
        }
        for(int i=0;i<arr.length;i++){
            if(z > 0){
                arr[i]= 0;
                z--;
            }else if (o > 0){
                arr[i] = 1;
                o--;
            } else arr[i] =2;
        }
    }
}
}
