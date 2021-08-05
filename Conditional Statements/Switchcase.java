import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a)
        {
            case 1: System.out.println("The number is 1");
                   break;
            case 2:System.out.println("the number is 2");
                 break;
            case 3:System.out.println("The number is 3");
                 break;
            default: System.out.println("The number is beyond of range");    
        }
    }
    
}