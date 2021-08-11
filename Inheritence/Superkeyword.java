package superkeyword;
class Rectangle
{
    public int length,breadth;
    public int x=10;
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}
class Cuboid extends Rectangle
{
    private int height;
    int x=20;
    public Cuboid(int length,int breadth,int height)
    {
        super(length,breadth);
        this.height=height;
    }
    public int volume()
    {
        return length*breadth*height;
    }
    public void display()
    {
        System.out.println("It is in rectangle class : "+super.x);
        System.out.println("It is in Cuboid class : "+x);
        
    }
}
public class Superkeyword {

    
    public static void main(String[] args) {
        Cuboid c=new Cuboid(10,15,20);
        System.out.println("The volume is "+c.volume());
        c.display();
    }
    
}
