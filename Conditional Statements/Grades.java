package grades;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int total=a+b+c;
        int avg=total/3;
        if(avg>70)
        {
            System.out.println('A');
        }
        if(avg>=60 && avg<70)
        {
            System.out.println('B');
        }
          if(avg>=50 && avg<60)
          {
            System.out.println('B');
          }
           if(avg>=50 && avg<60)
          {
            System.out.println('C');
          }
           if(avg>=40 && avg<50)
           {
            System.out.println('D');
          }
           if(avg<40)
           {
            System.out.println('F');
          }
    }
    
}
