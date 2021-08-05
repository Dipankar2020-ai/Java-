package pattern8;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Pattern8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
               
            }
            System.out.println();
        }
    }
    
}
