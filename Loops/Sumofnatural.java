package sumofnatural;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Sumofnatural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of natural number is :"+sum);
    }
    
}
