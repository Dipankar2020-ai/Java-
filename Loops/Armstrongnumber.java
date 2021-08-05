package armstrongnumber;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Armstrongnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a,sum=0;
        while(a!=0)
        {
            int rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
            
        }
        if(sum==temp)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not a Armstrong");
        }
    }
    
}
