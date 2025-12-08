 package DAY_8;

import java.util.Scanner;

public class codeforces1843B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i=0; i< t; i++){
            long sum =0;
            int count =0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j=0; j< n; j++){
                arr[j] = sc.nextInt();
                sum += Math.abs((long)arr[j]);
            }
            
            boolean negative = false;
            for (int j=0; j< n; j++){
                if (arr[j] < 0){
                    if (!negative){
                        count++;
                    negative = true;
                }
                } else if (arr[j] > 0){
                    negative = false;
                } else  {}

            }
            System.out.println(sum + " " + count);
        }
    }
}
