import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Numberofwords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int b=sc.nextInt();
        String str=sc.nextLine();
        str=str.trim();
       // str=str.replaceAll("\\s+","");
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
    
}