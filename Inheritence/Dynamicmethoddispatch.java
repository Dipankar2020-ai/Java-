class Super
{
    public void method1()
    {
       System.out.println("Method 1 is called");
    }
    public void method2()
    {
        System.out.println("The method2 of super class is called ");
    }
}
class Sub extends Super
{
    @Override
    public void method2()
    {
        System.out.println("The method 2 of sub class is called");
    }
    public void method3()
    {
        System.out.println("Method 3 is called");
    }
}

public class Dynamicmethoddispatch {

  
    public static void main(String[] args) {
       
        Super sb=new Sub();
        sb.method2();
        
    }
    
}