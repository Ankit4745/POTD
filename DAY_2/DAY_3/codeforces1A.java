package DAY_3;
/* Codeforces problem number 682
Name = Kushawaha Ankitkumar Vinodkumar
Res. No. = 2025CA054
Date = 3/12/2025  */

import java.util.Scanner;

public class codeforces1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double a = sc.nextDouble();
        
        long r = (long)(Math.ceil(n / a) * (Math.ceil(m / a)));
        System.out.println(r);
    }
    
}
