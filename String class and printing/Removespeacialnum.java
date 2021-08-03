import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Removespeacialnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int b=sc.nextInt();
        String str=sc.nextLine();
        System.out.println(str.replaceAll("[^a-z A-Z 0-9]",""));
    }
    
}