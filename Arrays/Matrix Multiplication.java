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
         System.out.println("Enter the size of row of 2nd:");
        int m1=sc.nextInt();
        System.out.println("Enter the size of col 2nd:");
        int n1=sc.nextInt();
       
       
        
         if(n!=m1)
         {
             System.out.println("The multiplication operation is not possible");
            System.exit(0);
         }
        int A[][]=new int [m][n];
        int B[][]=new int[m1][n1];
        System.out.println("Enter the 1st matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 A[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter the 2nd matrix");
             for(int i=0;i<m1;i++)
             {
                for(int j=0;j<n1;j++)
                { 
                      B[i][j]=sc.nextInt();
                
                }
            }
         int C[][]=new int[m][n1];
             
            for(int i=0;i<m;i++)
             {
                for(int j=0;j<n1;j++)
                {     int sum=0;
                      for(int k=0;k<n;k++)
                      {
                          sum+=A[i][k]*B[k][j];
                          C[i][j]=sum;
                      }
                
                }
            }
         
        
        System.out.println(" Resultant  matrix");
            for(int i=0;i<m;i++)
             {
                for(int j=0;j<n;j++)
                { 
                      System.out.print(C[i][j]+" ");
                
                }
                System.out.println();
            }
        
    }
    
}
