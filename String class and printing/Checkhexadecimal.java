import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Checkhexadecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int b=sc.nextInt();
        String str=sc.nextLine();
        System.out.println(str.matches("[0-9 A-F]*"));
    }
    
}
