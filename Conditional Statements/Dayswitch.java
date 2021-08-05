package dayswitch;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Dayswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a)
        {
            case 1:System.out.println("Mon");
                   break;
            case 2:System.out.println("Tue");
                  break;
            case 3 :System.out.println("Wed");
                 break;
            case 4: System.out.println("Thu");
                 break;    
            case 5:System.out.println("Fri");
                break;
            case 6:System.out.println("Sat");
                break;
            case 7:System.out.println("Sun");
                break;
            default: System.out.println("Not a valid day");    
                
        }
    }
    
}
