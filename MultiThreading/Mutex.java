class My
{
    public void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
             System.out.println(str.charAt(i));
        }
       
    }
}
class Mythread1 extends Thread
{
    My d;
    Mythread1(My dat)
    {
        d=dat;
    }
    @Override
    public void run()
    {
        d.display("Hello world");
    }
}
class Mythread2 extends Thread
{
    My d;
    Mythread2(My data)
    {
        d=data;
    }
    @Override
    public void run()
    {
        d.display("Wlocome");
    }
}


public class TestJava {

    
    public static void main(String[] args) {
        My m1=new My();
        Mythread1 t1=new Mythread1(m1);
        Mythread2 t2=new Mythread2(m1);
        t1.start();
        t2.start();
        
        
        
    }
    
}
