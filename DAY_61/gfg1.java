public class gfg1 {
    class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if (n == 0){
            return 0 ;
        }
        int count1 = towerOfHanoi(n-1, from, aux, to);

          int count2 =towerOfHanoi( (n-1),  aux, from ,  to );
        
        return 1+ count1+ count2;
    }
}

}
