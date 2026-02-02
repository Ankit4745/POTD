public class leetcode509 {
    class Solution {
    public int fib(int n) {
        int s = 0;
        int e = 1;
        if (n == 0){
            return 0;
        }
         if (n == 1){
            return 1;
        }
        for (int i=2; i<=n; i++){
            int fina = s + e;
            s = e;
            e = fina;
        }
        return e;
    }
}
}
