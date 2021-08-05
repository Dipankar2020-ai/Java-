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
        int rev=0,temp=a;
        while(a!=0)
        {
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if(temp==rev)
        {
             System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }  
       
    }
    
}
