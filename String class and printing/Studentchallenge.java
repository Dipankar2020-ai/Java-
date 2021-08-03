import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Studentchallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // String str="programmer@gmail.com";
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        int index=str.indexOf("@");
        int index1=str.indexOf(".");
        String sub1=str.substring(0, index);
        System.out.println(sub1);
        String sub2=str.substring(index+1,index1);
        System.out.println(sub2);
        String sub3="gmail";
        boolean  ans=sub2.equals(sub3);
      
         if(ans)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
       
    }
    
}