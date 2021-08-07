
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
        System.out.println("Size of array:");
        int size=sc.nextInt();
        int A[]=new int[size];
     
       
        for(int i=0;i<size;i++)
        {
             A[i]=sc.nextInt();
        }
        int totalsize=2*size;
    
      int B[]=new int[totalsize];
        
       
        for(int j=0;j<size;j++)
         {
               B[j]=A[j];
           }
        for(int i=size;i<totalsize;i++)
        {
            B[i]=0;
        }
       
          for(int i=0;i<totalsize;i++)
           {
             System.out.print(B[i]+" ");  
           }
    
        
    }
    
}
