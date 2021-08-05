package displaydigits;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Displaydigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0)
        {
            int rem=a%10;
            System.out.println(rem);
            a=a/10;
        }
    }
    
}
