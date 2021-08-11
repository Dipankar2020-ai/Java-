package thisclass;

class Rectangle
{
   private int length,breadth;
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int area()
    {
        return length*breadth;
    }
}
public class Thisclass {

   
    public static void main(String[] args) {
       Rectangle r1=new Rectangle(10,15);
       System.out.println("The arae is "+r1.area());
         Rectangle r2=new Rectangle(15,20);
       System.out.println("The area is "+r2.area());
       
    }
    
}
