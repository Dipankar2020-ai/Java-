abstract class Super
{
    public Super()
    {
        System.out.println("I am in Super");
    }
    public void math1()
    {
        System.out.println("Super Math1");
    }
     abstract public void math2();

}
class Sub extends Super
{
    @Override
    public void math2()
    {
        System.out.println("sub math2");
    }
}


public class Abstractexample {

    
    public static void main(String[] args) {
        Super s=new Sub();
        s.math2();
        s.math1();
    }
    
}
