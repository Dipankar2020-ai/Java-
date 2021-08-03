import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Removeextraspace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int b=sc.nextInt();
        String str=sc.nextLine();
        System.out.println(str.replaceAll("\\s+",""));
    }
    
}