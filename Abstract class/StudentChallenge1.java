abstract class Shape
{
    abstract double  perimter();
    abstract double area();
    
}
class Circle extends Shape
{
    public int radius;
    public Circle(int radius)
    {
        this.radius=radius;
    }
    @Override
    public double perimter()
    {
        return 2*3.14*radius;
        
    }
     @Override
    public double area()
    {
        
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape
{
    int length,breadth;
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
      @Override
    public double perimter()
    {
        return 2*(length+breadth);
        
    }
     @Override
    public double area()
    {
        
        return length*breadth;
    }
    
    
    
    
}

public class StudentChallenge1 {

   
    public static void main(String[] args) {
        Shape s1=new Circle(10);
        System.out.println("The area of circle is "+s1.area());
        System.out.println("The perimeter of circle is "+s1.perimter());
        Shape s2=new Rectangle(10,15);
        System.out.println("The area of Rectangle  is "+s2.area());
        System.out.println("The perimeter of Rectangle is "+s2.perimter());
        
    }
    
