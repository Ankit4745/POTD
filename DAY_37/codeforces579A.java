package DAY_37;
 import java.util.Scanner;
public class codeforces579A {
        public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
    String s = Integer.toBinaryString(test);
    int count = 0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) == '1') count++;
    }
    System.out.println(count);
     }
}
