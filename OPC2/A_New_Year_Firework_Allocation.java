import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A_New_Year_Firework_Allocation {

     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   long n = sc.nextLong();
   long x = sc.nextLong();
   PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

   for(int i=0;i<n;i++){
    int temp = sc.nextInt();
    pq.add(temp);
   }
   long total=0;
   for(int i=0;i<x;i++){
    total += pq.peek();
    int lo = pq.poll();
   
    pq.add(lo/2);
   }

   System.out.println(total);


     }
}