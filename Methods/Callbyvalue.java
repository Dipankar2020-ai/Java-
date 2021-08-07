 */
package callbyvalue;

/**
 *
 * @author DIPANKAR
 */
public class Callbyvalue {

    static void inc(int x)
    {
        x++;
        System.out.println("In fuction");
        System.out.println(x);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        inc(x);
        System.out.println("In Main");
        System.out.println(x);
    }
    
}
