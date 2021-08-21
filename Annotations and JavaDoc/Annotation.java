
class Parent
{
    public void show()
    {
        System.out.println("hello");
    }
}
class Child extends Parent
{
    @Override
    public void show()
    {
        System.out.println("Dipankar");
    }
    @Deprecated
    public void display()
    {
        System.out.println("Hi");
    }
}

public class Annotation {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child c=new Child();
        
    }
    
}
