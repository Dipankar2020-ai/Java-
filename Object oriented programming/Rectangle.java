package rectanglemain;

class Rectangle
{
    public double length;
    public double breadth;
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean issquare()
    {
        if(length==breadth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class Rectanglemain {

  //  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        r1.length=10;
        r1.breadth=10;
        r2.length=10;
        r2.breadth=10;
       System.out.println("The area of rectangle is :"+ r1.area());
       System.out.println("The perimeter of rectangle is "+r1.perimeter());
       System.out.println(r1.issquare());
       System.out.println("For second rectangle object :");
       System.out.println(r2.issquare());
    }
    
}
