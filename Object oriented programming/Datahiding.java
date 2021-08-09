class Rectangle
{
    private int length;
    private int breadth;
    public void  set(int len,int bre)
    {
        if(len>0 && bre>0)
        {  
        length=len;
        breadth=bre;
        }
        else
        {
            length=0;
            breadth=0;
        }
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


public class Datahiding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.set(10, 15);
        System.out.println("The area of rectangle is "+r.area());
        System.out.println("The perimeter of rectangle is "+r.perimeter());
    }
    
}
