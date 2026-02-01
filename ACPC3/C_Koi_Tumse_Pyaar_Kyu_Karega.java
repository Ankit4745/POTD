import java.util.Scanner;

public class C_Koi_Tumse_Pyaar_Kyu_Karega {

     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int test = sc.nextInt();
   
    while (test-- > 0) {
       String s = sc.next();
       String k = sc.next();
      
        if(s.length() > k.length()){
            System.out.println("NO");
            continue;
        }else{
             int i=0,j=0;
            int count=0;
            while(j<k.length() && i<s.length()){
                if(s.charAt(i) == k.charAt(j)){
                    count++;
                    j++;
                    i++;
                }else{
                    j++;
                }
            }
            if(count== s.length()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
       
        
       }

       

     
    }
}
