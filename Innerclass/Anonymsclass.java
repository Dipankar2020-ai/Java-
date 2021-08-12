abstract class My
{
    abstract void show();
}
class Outer
{
    public void display()
    {
        My m=new My()
        {
         
           public void show()
           {
               System.out.println("Hello");
           }
        };
        m.show();
    }
}

public class Anonymsclass {

   
    public static void main(String[] args) {
      
        Outer o=new Outer();
        o.display();
    }
    
}
