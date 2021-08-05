package webswitch;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Webswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int index=str.indexOf(".");
        String sub1=str.substring(index+1, str.length());
        switch(sub1)
        {
            case "org":System.out.println("Organisational");
                        break;
            case "com":System.out.println("Commercial");
                        break;
            case "gov": System.out.println("Government");
                        break;
            case "net":   System.out.println("Network");
                        break; 
            default: System.out.println("It is beyond this");           
            
        }
        
    }
    
}
