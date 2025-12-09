
/* Codeforces problem number 1828B
Name = Kushawaha Ankitkumar Vinodkumar
Res. No. = 2025CA054
Date = 9/12/2025  */
import java.util.Scanner;

public class codeforces1828B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<test; i++){ 

            int n = sc.nextInt();
            int[] array = new int[n+1];
            for (int j=1; j<=n; j++){
                array[j] = sc.nextInt(); 
            }
             int count = 0;

             for (int k= 1; k<=n; k++){
                int diff = Math.abs(k - array[k]);
                 count = gcdLoop(count , diff);
             }
             System.out.println(count);
            
        }
        } 
        static int gcdLoop(int a, int b){
            while  (b != 0){
                int temp = a % b;
                a = b;
                b = temp;
        }
        return a;
    }

    }
