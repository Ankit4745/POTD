/* Codeforces problem number 546A
Name = Kushawaha Ankitkumar Vinodkumar
Res. No. = 2025CA054
Date = 1/12/2025  */



import java.util.Scanner;

public class post1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,w,n,borr;
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        int  sum = 0;
        for (int i=1; i<=w; i++){
            int a = i*k;
             sum += a;
        }
        if (sum > n){
            borr = sum - n;
        }else{
            borr = 0;
        }
        System.out.println(borr);
    }   
}
