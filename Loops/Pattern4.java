package pattern4;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Pattern4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int k=1;
        for(int i=1;i<=n;i++)
        { 
            
             for(int j=1;j<=n;j++)
             {   
               System.out.print(k+" ");
               k++;
                 
             }
            System.out.println();
        }
    }
    
}
