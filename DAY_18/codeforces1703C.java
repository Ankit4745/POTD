package DAY_18;

import java.util.Scanner;

public class codeforces1703C {
    
    
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
    while (test-- > 0) {
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        
        }
        for(int i=0;i<n;i++){
            int b = sc.nextInt();
            String s = sc.next();

            int now = arr[i];
            for (int j=0;j<b;j++){
                if (s.charAt(j)  == 'D'){
               now = ((now+1) % 10);     

                } else {
                    now = ((now+9) % 10);
                }
         
            }
                   arr[i] = now;

        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        } System.out.println();

    }
}
}

