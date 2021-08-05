package multiplicationtable;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Multiplicationtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+"*"+i+" = "+a*i);
        }
        
    }
    
}
