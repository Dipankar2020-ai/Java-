package practisngarray;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class PractisngArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int B[]={6,7,8,9,10};
        for(int i=0;i<A.length;i++)
        {
             A[i]=sc.nextInt();
        }
         for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
         System.out.println();
         //for each loop
         for(int x:B)
         {
             System.out.print(x+" ");
         }
        
    }
    
}
