package DAY_5;
/* Codeforces problem number 282A
Name = Kushawaha Ankitkumar Vinodkumar
Res. No. = 2025CA054
Date = 5/12/2025  */

import java.util.Scanner;

public class codeforces282A {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     sc.nextLine(); 
    String a = " ";
    int x = 0;
    for (int i=0; i<n; i++){
     a = sc.nextLine();
    
    if (a.equals("++x") || a.equals("x++")|| a.equals("++X") || a.equals("X++")){
      x++;
    }
    if (a.equals("x--") || a.equals("--x") || a.equals("X--") || a.equals("--X")){
      x--;
    }


}
    System.out.println(x);
}
}
