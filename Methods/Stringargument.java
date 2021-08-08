package stringargument;

/**
 *
 * @author DIPANKAR
 */
public class Stringargument {

     void showlist(int a,String ...s)
     {
         for(int i=0;i<s.length;i++)
         {
             System.out.println(a+" "+s[i]);
             a++;
         }
     }
    
    public static void main(String[] args) {
        
        Stringargument m=new Stringargument();
        m.showlist(0, "apurbo","dipankar","krishanu","chandi","rohon","Tanmoy");
    }
    
}
