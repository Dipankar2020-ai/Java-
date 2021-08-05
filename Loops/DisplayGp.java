package displaygp;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class DisplayGp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int cr=sc.nextInt();
        int n=sc.nextInt();
        for(int i=first,j=0;j<n;i=i*cr,j++)
        {
            System.out.print(i+" ");
        }
    }
    
}
