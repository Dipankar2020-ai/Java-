package classcircle;
import java.util.*;
class Circle
{

     public double area(double radius)
     {
         return 3.14*radius*radius;
     }
     public double perimeter(double radius)
     {
         return 2*3.14*radius;
     }
     public double circumference(double radius)
     {
         return 3.14*radius*radius+2*3.14*radius;
     }
     
     
        
}
public class Classcircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      double radius=sc.nextDouble();
        Circle c=new Circle();
        System.out.println("The area of the circle is "+c.area(radius));
        System.out.println("The area of the circle is "+c.perimeter(radius));
        System.out.println("The area of the circle is "+c.circumference(radius));
    }
    
}
