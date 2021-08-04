package javaapplication20;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int index=str.indexOf(":");
        String sub1=str.substring(0, index);
        int index2=str.lastIndexOf(".");
        String sub2=str.substring(index2+1,str.length());
        System.out.println(sub1);
        System.out.println(sub2);
        if(sub1.equals("https"))
        {
            System.out.println("Hypertext Transfer Protocol");
        }
        if(sub1.equals("ftp"))
        {
            System.out.println("File transfer Protocol");
        }
        if(sub2.equals("com"))
        {
            System.out.println("Commercial");
        }
        if(sub2.equals("org"))
        {
            System.out.println("organisational");
        }
        if(sub2.equals("net"))
        {
            System.out.println("Network");
        }
        
    }
    
}
