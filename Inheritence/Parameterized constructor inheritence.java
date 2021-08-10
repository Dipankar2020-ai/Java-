class Rectangle
{
   public int length,breadth;
   public Rectangle()
   {
       length=1;
       breadth=1;
   }
  public Rectangle(int x,int y)
   {
       length=x;
       breadth=y;
   }
   
}
class Cuboid extends Rectangle
{
    private int height;
    public Cuboid()
    {
        height=1;
    }
    public Cuboid(int z)
    {
        height=z;
    }
    public Cuboid(int x,int y,int z)
    {
        super(x,y);
        height=z;
    }
    public int volume()
    {
        return length*breadth*height;
    }
}

public class Rectangleinheri {

    
    public static void main(String[] args) {
      Cuboid c=new Cuboid(10,12,15);
      Cuboid c1=new Cuboid(10);
        Cuboid c2=new Cuboid(1);
      
      System.out.println("The volume is "+c.volume());
      System.out.println("The volume is "+c1.volume());
       System.out.println("The volume is "+c2.volume());
    }
    
}
