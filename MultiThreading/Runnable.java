
class My implements Runnable
{
    public void run()
    {
        int x=1;
        while(true)
        {
            System.out.println("Hello "+x);
            x++;
        }
    }
}


public class MyRunnable {

    
    public static void main(String[] args) {
        My m=new My();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println("World "+i);
            i++;
        }
    }
    
}
