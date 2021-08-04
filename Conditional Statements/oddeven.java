 */
package oddeven;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Oddeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
        
    }
    
}
