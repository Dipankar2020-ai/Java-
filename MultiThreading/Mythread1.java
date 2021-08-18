class My extends Thread
{
    My(String name)
    {
        super(name);
    }
    
    public void run()
    {
        int x=1;
        while(true)
        {
            System.out.println("Hello "+x);
             try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            x++;
        }
    }
}

public class Mythread1 {

    
    public static void main(String[] args) {
        
        My m=new My("raju");
        m.start();
       
 
        
    }
    
}
