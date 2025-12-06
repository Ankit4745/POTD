 package DAY_6;

import java.util.Arrays;
import java.util.Scanner;

public class codeforces1832A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc .nextInt();
        sc.nextLine();
      
        for (int i=0; i<t; i++){
            String s = sc.nextLine();
              String a = "no";
              if (s.length() >1){
            for (int j = 1; j< s.length()/2; j++){
                if (s.charAt(j) != s.charAt(0)){
                    a = "yes";
                    break;
                } 
            }
        }
           System.out.println(a);
        }
    }
} 
