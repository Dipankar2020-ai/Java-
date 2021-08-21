
interface Mylambda
{
    public void show();
}
class Uselambda
{
    public void method1(Mylambda ml)
    {
        ml.show();
    }
}
class Demo
{
    public void method2()
    {
        Uselambda ul=new Uselambda();
        ul.method1(()->{System.err.println("Hello");});
        
    }
}


public class JavaApplication121 {

   
    public static void main(String[] args) {
       
        Demo d=new Demo();
        d.method2();
    }
    
}
