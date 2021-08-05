package menubar;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Menubar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("********Menu*******");
        System.out.print(" 1.ADD\n 2.SUB \n 3.MUL \n 4.DIV\n");
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your choose");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                int sum=a+b;
                System.out.println("The Adition is "+ sum);
                break;
            case 2:
                int sub=a-b;
                System.out.println("The Substraction is "+ sub);
                break;
            case 3: 
                int mul=a*b;
                 System.out.println("The Multiplication is "+ mul);
                 break;
            case 4:
                int div=a/b;
                System.out.println("The Division is "+ div);
                break;
            default:
                System.out.println("Invalid operation");
                
            
        }
       
                
    }
    
}
