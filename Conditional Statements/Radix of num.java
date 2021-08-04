package radixofnum;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Radixofnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.matches("[01]*"))
        {
            System.out.println("Binary");
        }
       else if(str.matches("[0-7]*"))
        {
             System.out.println("Octal");
        }
       else if(str.matches("[0-9 A-F]*"))
        {
            System.out.println("Hexadecimal");
        }
       else if(str.matches("[0-9]*"))
        {
            System.out.println("Decimal");
        }
        else
       {
           System.out.println("Not a number");
       }
    }
    
}
