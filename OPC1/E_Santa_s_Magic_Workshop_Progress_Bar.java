import java.util.Scanner;

public class E_Santa_s_Magic_Workshop_Progress_Bar {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   int n= sc.nextInt();
   int k= sc.nextInt();
   int t= sc.nextInt();

   int[] arr = new int[n];
   
   int temp = (n*k*t) /100;

   for(int i=0;i<t;i++){
    if (temp >0){
    if (temp > k) arr[i] = k;
    else arr[i] =temp;
    temp -=k;}
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    } System.out.println();

   

 }
}
