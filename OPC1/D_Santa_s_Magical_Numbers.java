import java.util.Scanner;

public class D_Santa_s_Magical_Numbers {

    public static boolean Prime(int number){
        if (number <2) return false;
        boolean a = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                a = false; 
            }
        }
        return a;
    }

   
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
    while (test-- > 0) {
        int n= sc.nextInt();
        boolean b = false;
        boolean c = false;

        if(n <= 5){
            System.out.println("NO");
        } else if (n % 2 == 0){
            System.out.println("YES");
        } else{
            int temp = n-2;
            if (Prime(temp)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

     


    }
}
    
}