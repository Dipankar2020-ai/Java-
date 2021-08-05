package pattern1;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Pattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        { 
             int k=i+1;
             for(int j=1;j<=n;j++)
             {   
               System.out.print(k+" ");
               k++;
                 
             }
            System.out.println();
        }
    }
