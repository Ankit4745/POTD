public class leetcode204 {
    class Solution {
    public int countPrimes(int n) {
         int count =0;
        boolean[] Sieve = new boolean[n];
        if (n<2) count =0;
        else{
            for(int i=2;i*i<n;i++){
                if (!Sieve[i]){
                    for(int j= i*i;j<n;j+=i){
                        Sieve[j] = true;
                    }
                }
            }
           
            for(int i=2;i<n;i++){
                if (!Sieve[i]) count++;
            }
    }
    return count;
        
    }
}
}
