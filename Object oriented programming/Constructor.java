class Rectangle
{
    private int length;
    private int breadth;
    
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    public Rectangle(int l,int r)
    {
        length=l;
        breadth=r;
    }

    public int area()
    {
      return length*breadth;   
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }     
}


public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,15);
    
        System.out.println("The area of rectangle is "+r.area());
        System.out.println("The perimeter of rectangle is "+r.perimeter());
        Rectangle r1=new Rectangle();
         System.out.println("The area of rectangle of object 2 is "+r1.area());
    }
    
}
