package methodvalidate;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Methodvalidate {
   
    boolean validate(String name)
    {
        return name.matches("[a-z A-Z ]+");
    }
    boolean validate(int age)
    {
        return age>=3 && age<=15;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        Methodvalidate m=new Methodvalidate();
        System.out.println(m.validate(name));
        System.out.println(m.validate(age));
        
    }
    
}
