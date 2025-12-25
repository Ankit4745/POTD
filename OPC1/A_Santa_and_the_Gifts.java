import java.util.Scanner;

public class A_Santa_and_the_Gifts {

     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
  
        int n= sc.nextInt();
        int temp = n+1;

        boolean a = true;
        while (temp>1) {
            if(temp % 2 != 0){
                a = false;
                break;
            }
            temp = temp/2;
        }
        if(a) System.out.println("YES");
        else System.out.println("NO");
    }

}