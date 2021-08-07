package practic2darray;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Practic2Darray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row:");
        int m=sc.nextInt();
        System.out.println("Enter the size of col:");
        int n=sc.nextInt();
        int A[][]=new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 A[i][j]=sc.nextInt();
                
            }
        }
             for(int i=0;i<m;i++)
             {
                for(int j=0;j<n;j++)
                { 
                     System.out.print(A[i][j]+" ");
                
                }
            }
             System.out.println();
        //using for each loop
        for(int x[]:A)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
        }
        
    }
    
}
