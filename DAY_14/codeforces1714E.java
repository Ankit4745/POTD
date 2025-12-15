import java.util.Scanner;

public class codeforces1714E {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
    while (test-- > 0) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean he = false;
        boolean te = false;

        for (int i=0; i<n; i++){
            if (arr[i] % 10 == 0 || arr[i] % 10 == 5){
                he = true;
            } else {
                te = true;
            }
        }

        if (he && te){
             System.out.println("No"); 
             continue;
        }
         boolean f = true;

        if (he){
            for (int i=0; i<n; i++){
                if (arr[i] % 10 == 5){
                     arr[i] = arr[i] + 5;
                    }
            } 
            for (int i=1; i<n;i++){
                if (arr[i] != arr[0]){
                    f = false;
                    break;
                 } 
                
            }
        } else {
            for (int i=0;i<n;i++){
                while (arr[i] % 10 != 2) {
                    arr[i] += (arr[i] %10);
                }
            }
             for (int i=1;i<n;i++){
                if (arr[i] % 20 != arr[0] % 20){
                    f = false;
                    break;
                } 
             }
            
        }
                if (f) System.out.println("Yes");
                else System.out.println("No");

    }
}
    
}
