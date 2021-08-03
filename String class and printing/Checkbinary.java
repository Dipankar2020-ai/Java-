import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Checkbinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        String str=b+"";
        System.out.println(str.matches("[01]*"));
    }
    
}