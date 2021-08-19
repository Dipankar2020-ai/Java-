class  Mythread extends Thread
{
    @Override
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println("Mythread "+count++);
        }
    }
}


public class Mythread3 {

  
    public static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();
        int count=1;
        while(true)
        {
            System.out.println(count++ +"Main");
            Thread.yield();
        }
    }
    
}
