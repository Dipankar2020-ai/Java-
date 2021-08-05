package reversenumber;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Reversenumber {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0;
        while(a!=0)
        {
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        System.out.println("the reverse is :"+rev);
    }
    
}
