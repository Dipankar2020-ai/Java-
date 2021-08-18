
class My extends Thread
{
    My(String name)
    {
        super(name);
    }
}

public class Mythread1 {

    
    public static void main(String[] args) {
        
        My m=new My("raju");
        m.start();
        System.out.println("Name "+m.getName());
        System.out.println("Priority "+m.getPriority());
        System.out.println("ID "+m.getId());
        System.err.println("State "+m.getState());
        System.out.println("is Alive "+m.isAlive());
        
    }
    
}
