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
        int B[][]=new int[m][n];
        System.out.println("Enter the 1st matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 A[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter the 2nd matrix");
             for(int i=0;i<m;i++)
             {
                for(int j=0;j<n;j++)
                { 
                      B[i][j]=sc.nextInt();
                
                }
            }
            for(int i=0;i<m;i++)
             {
                for(int j=0;j<n;j++)
                { 
                      A[i][j]=A[i][j]+B[i][j];
                
                }
            }
        System.out.println(" Resultant  matrix");
            for(int i=0;i<m;i++)
             {
                for(int j=0;j<n;j++)
                { 
                      System.out.print(A[i][j]+" ");
                
                }
                System.out.println();
            }
        
    }
    
}
