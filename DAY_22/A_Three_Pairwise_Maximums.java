
import java.util.Scanner;

public class A_Three_Pairwise_Maximums {

      public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
    while (test-- > 0) {
       int[] arr = new int[3];
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       for (int i=0;i<3;i++){
        arr[i] = sc.nextInt();
        max = Math.max(max,arr[i]);
        min = Math.min(min,arr[i]);
       }
       int count =0;
       for (int i=0;i<3;i++){
        if (max == arr[i]){
            count++;
        }
       }
       if (count >1){ 
        System.out.println("YES");
      
        System.out.println(max + " " +min+ " " +min);


       } else {System.out.println("NO");}

    }

}
      }
    
