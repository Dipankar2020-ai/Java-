package testinheritence;

class Circle
{
      public int  radius;
     
     
      public double area()
      {
          return 3.14*radius*radius;
      }
      public double perimeter()
      {
          return 2*3.14*radius;
      }
}
class Cylinder extends Circle
{
    private final int height;
  
    public Cylinder(int height)
    {
       this.height=height;
    }
    public double volume()
    {
       return 3.14*radius*radius*height; 
    }
    
    
}
public class Testinheritence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Cylinder cy=new Cylinder(6);
            cy.radius=7;
       
       
        System.out.println("For cylinder :");
       
         System.out.println(cy.area());
         System.out.println(cy.perimeter());
         System.out.println(cy.volume());
        
    }
    
}
