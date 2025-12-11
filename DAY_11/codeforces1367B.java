package DAY_11;

import java.util.Scanner;

public class codeforces1367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int Ecount =0;
            int Ocount =0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j=0; j<n; j++){
                arr[j] = sc.nextInt();
                if (arr[j] % 2 ==0 && j % 2 !=0){
                    Ocount++;
                } else if (arr[j] % 2 !=0 && j % 2 ==0){
                    Ecount++;
            }
            
           
        }
            if (Ecount == Ocount){
                System.out.println(Ecount);
            } else {
                System.out.println(-1);
            }
        }
    }
}
