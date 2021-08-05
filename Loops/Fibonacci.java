package fibonacci;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1,c;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        
    }
    
}
