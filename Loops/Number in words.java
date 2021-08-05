package numberinwords;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Numberinwords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String rev="";
        while(a!=0)
        {
            int rem=a%10;
            rev=rev+rem;
            a=a/10;
        }
         
        for(int i=rev.length()-1;i>=0;i--)
        {
            
            switch(rev.charAt(i))
            {
                case  '0': System.out.print("Zero ");
                      break;
                case '1': System.out.print("One ");
                      break;    
                case '2': System.out.print("Two ");
                      break;   
                case '3': System.out.print("Three ");
                      break;
                case '4': System.out.print("Four ");
                      break;  
                case '5': System.out.print("Five ");
                      break; 
                case '6': System.out.print("Six ");
                      break;
                case '7': System.out.print("Seven ");
                      break;
                case '8': System.out.print("Eight ");
                      break;
                case '9': System.out.print("Nine ");
                      break;       
                      
            }
           
            
        }
    }
    
}
