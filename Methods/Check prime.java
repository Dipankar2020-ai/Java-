package methodpractice;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Methodpractice {
     
    int checkprime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
     return 1;        
        
    }
    
    
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     Methodpractice m=new Methodpractice();
     int  ans=m.checkprime(n);
     if(ans==1)
     {
         System.out.println("The number is a prime number");
     }
     else
     {
         System.out.println("The number is not a prime number");
     }
      
    }
    
}
