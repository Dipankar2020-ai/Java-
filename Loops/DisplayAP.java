package displayap;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class DisplayAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int cd=sc.nextInt();
        int n=sc.nextInt();
        for(int i=first,j=0;j<n;i=i+cd,j++)
        {
            System.out.print(i+" ");
        }
    }
    
}
