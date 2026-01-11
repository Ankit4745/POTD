import java.util.Scanner;

public class C_New_Year_Bitwise_Bash {

     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
   
   boolean a = true;
   int count =0;

   for (int i=0;i<test;i++){
   int temp = sc.nextInt();
   count ^= temp;
   if (temp != 0){
    a = false;
   }
   
}
if (a ){
    System.out.println("-1");
}else if (count == 0){
    System.out.println("1");

}   else {
    System.out.println("0");
}

   
  
     }
    }