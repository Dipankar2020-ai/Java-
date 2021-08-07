import java.util.*;

/**
 *
 * @author DIPANKAR
 */
public class MethodPractice {

  static int max(int a,int b)
   {
       if(a>b)
       {
           return a;
       }
       else
       {
           return b;
       }
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=max(a,b);
        System.out.println(c);
        
    }
    
}
