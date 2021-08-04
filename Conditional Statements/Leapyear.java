
package leapyear;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Leapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("it is not a leap year");
        }
    }
    
}
