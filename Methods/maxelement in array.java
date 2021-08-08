package maxelementmethod;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Maxelementmethod {

    int maxelement(int A[],int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
            
        }
        Maxelementmethod m=new Maxelementmethod();
       int ans= m.maxelement(A,n);
       System.out.println(ans);
        
        
    }
    
}
