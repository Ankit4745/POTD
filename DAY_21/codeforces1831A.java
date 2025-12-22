
import java.util.Scanner;

public class codeforces1831A {
      public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
    while (test-- > 0) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(((n-1)+arr[i])+ " ");
        }
        System.out.println();
    }
}
}
