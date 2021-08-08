package methodpractice;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Methodpractice {
     
    int findgcd(int a,int b)
    {
       while(a!=b)
       {
           if(a>b)
           {
               a=a-b;
           }
           else
           {
               b=b-a;
           }
       }
       return a;
        
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
