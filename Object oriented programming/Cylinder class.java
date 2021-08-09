package cylindermain;
import java.lang.Math;
class Cylinder
{
    public double radius;
    public double height;
    public double lidarea()
    {
        return Math.PI*radius*radius;
    }
    public double totalsurfacearea()
    {
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
    public double volume()
    {
        return 3.14*radius*radius*height;
    }
}
public class Cylindermain {

    
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=15;
        c.height=20;
        System.out.println("the lid area of cylinder is "+c.lidarea());
        System.out.println("the total surface area of cylinder is "+c.totalsurfacearea());
        System.out.println("The total volume of cylinder is "+c.volume());
    }
    
}
