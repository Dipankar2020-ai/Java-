package methodarea;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Methodarea {

    int area(int l,int b)
    {
        int ans=l*b;
        return ans;
    }
    double area(int r)
    {
        double ans=3.14*r*r;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int r=sc.nextInt();
        Methodarea m=new Methodarea();
        System.out.println("The area of rectangle : "+m.area(l,b));
        System.out.println("The area of circle :"+m.area(r));
    }
    
}
