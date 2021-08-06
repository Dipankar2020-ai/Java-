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
    
         System.out.println("Enter the position where you want insert:");
          int pos=sc.nextInt();
         System.out.println("Enter the element which you want insert:");
         int ele=sc.nextInt();
           
       
           for(int i=n;i>=pos;i--)
           {
               A[i+1]=A[i];
           }
           A[pos]=ele;
          n++;
          for(int i=0;i<n;i++)
           {
             System.out.print(A[i]+" ");  
           }
    
        
    }
    
}
