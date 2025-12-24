import java.util.Scanner;

public class B_Luntik_and_Subsequences {

     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
    while (test-- > 0) {
        int n= sc.nextInt();
        long one =0;
        long zero = 0;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if (temp == 1) one++;
            else if (temp == 0 ) zero++;
        }
        long ans =one *(1L << zero);
        System.out.println(ans);
    }
}
}