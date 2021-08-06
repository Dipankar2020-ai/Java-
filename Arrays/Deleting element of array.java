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
          System.out.println("Number  of  element:");
        int n=sc.nextInt();
       
        for(int i=0;i<n;i++)
        {
             A[i]=sc.nextInt();
        }
    
         System.out.println("Enter the position where you want delete:");
          int pos=sc.nextInt();
        
           
       
           for(int i=pos;i<n;i++)
           {
               A[i]=A[i+1];
           }
          n--;
          for(int i=0;i<n;i++)
           {
             System.out.print(A[i]+" ");  
           }
    
        
    }
    
}
