interface Test1
{
    public void math1();
    public void math2();
}
 class My implements Test1
 {
     @Override
     public void math1()
     {
         System.out.println("We are Math1 of My class");
     }
     @Override
      public void math2()
     {
         System.out.println("We are Math2 of My class");
     }
 }

public class InterfaceDemo {

    
    public static void main(String[] args) {
       Test1 t1=new My();
       t1.math1();
       t1.math2();
       
    }
    
}
