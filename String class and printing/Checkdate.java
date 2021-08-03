import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Checkdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int b=sc.nextInt();
        String str=sc.nextLine();
        System.out.println(str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
    
}
