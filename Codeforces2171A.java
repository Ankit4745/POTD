/* Codeforces problem number 2171A
Name = Kushawaha Ankitkumar Vinodkumar
Res. No. = 2025CA054
Date = 2/12/2025  */

import java.util.Scanner;

public class Codeforces2171A {
    public static void main(String[] args) {
        int test,n;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();

        for (int i=1; i<=test; i++){
            n = sc.nextInt();
            if (n%2 == 0){
                System.out.println((n/4) + 1);
            } else {
                System.out.println(0);
            }
        }
    }
    
}
