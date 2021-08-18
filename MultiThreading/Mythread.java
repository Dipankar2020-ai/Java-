class My extends Thread
{
    
    public void run()
    {
        int x=1;
        while(true)
        {
            System.out.println("Hello"+x);
            x++;
        }
        
    }
}


public class Mythread {

    
    public static void main(String[] args) {
        My m=new My();
        m.start();
        int i=1;
        while(true)
        {
            System.out.println("World"+i);
            i++;
        }
        
    }
    
}
