class Outer
{
    void display()
    {
        class Inner
        {
           
            void display1()
            {
               System.out.println("Hello"); 
            }
        }
         Inner i=new Inner();
         i.display1();
    }
   
    
}


public class Localclass {

    
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
    
}
