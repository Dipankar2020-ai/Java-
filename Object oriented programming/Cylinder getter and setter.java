package cylinder1;
class Cylinder
{
    private int radius;
    private int height;
    public void setmethod(int r,int h)
    {
        if(r>0 && h>0)
        {
            radius=r;
            height=h;
        }
        else
        {
            radius=1;
            height=1;
        }
    }
    public int getradius()
    {
        return radius;
    }
    public int getheight()
    {
        return height;
    }
    
}       

public class Cylinder1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setmethod(10,22);
        System.out.println("The radius is "+c.getradius());
        System.out.println("The height is "+c.getheight());
        
    }
    
}
