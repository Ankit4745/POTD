package DAY_15;
import java.util.Scanner;

public class codeforces514A {
      public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        String s = sc.next();
       char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int digit = arr[i] -'0';
            int temp = 9-digit;
            if (i==0 && temp == 0) {
                continue;
            }
            if (temp < digit){
                arr[i] = (char)(temp + '0');
            }
        }
        System.out.println(new String(arr));

    }
        }

