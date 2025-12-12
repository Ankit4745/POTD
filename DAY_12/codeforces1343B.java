package DAY_12;

import java.util.Scanner;

public class codeforces1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 4 ==0){
                System.out.println("YES");
                int[] arr = new int[n];
                int even = 2;
                int odd = 1;
                int Ecount =0;
                int Ocount =0;
                for (int i = 0; i < n/2; i++) {
                    arr[i] = even;
                    Ecount += even;
                    even += 2; 
                }
                for (int i = n/2; i < n - 1; i++) {
                    arr[i] = odd;
                    Ocount += odd;
                    odd += 2; 
                }
                arr[n - 1] = Ecount - Ocount;
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();



            }else{
                System.out.println("NO");
            }
        }
    }
}
