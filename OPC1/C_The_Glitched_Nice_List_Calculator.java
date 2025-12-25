import java.util.Scanner;

public class C_The_Glitched_Nice_List_Calculator {

     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String a = sc.next();
   String b = sc.next();
      int[] A = new int[1001];
      int[] B = new int[1001];
      
      for(int i=0;i<a.length();i++){
        A[i] = a.charAt(a.length()-1-i) -'0';
      }
       
      for(int i=0;i<b.length();i++){
        B[i] = b.charAt(b.length()-1-i) -'0';
      }
      StringBuilder sb = new StringBuilder();

      int temp = Math.max(a.length(), b.length());
     
      for(int i= temp -1;i>=0;i--){
        sb.append(A[i]+B[i]);
      }
      System.out.println(sb.toString());
    }
    }