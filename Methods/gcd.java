package methodpractice;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Methodpractice {
     
    int findgcd(int a,int b)
    {
       int max,gcd=1;
       if(a>b)
       {
           max=a;
       }
       else
       {
           max=b;
       }
       for(int i=1;i<=max;i++)
       {
           if(a%i==0 && b%i==0)
           {
                 gcd=i;               
           }
       }
       return gcd;
        
    }
    
    
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     Methodpractice m=new Methodpractice();
     int  ans=m.findgcd(a,b);
     System.out.println(ans);
    
      
    }
    
}
