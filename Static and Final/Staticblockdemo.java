class Test
{
    static 
    {
        System.out.println("Block 3");
    }
    static 
    {
        System.out.println("Block 4");
    }
}

public class Staticblockdemo {

    
    static 
    {
        System.out.println("Block 1");
    }
    static 
    {
        System.out.println("Block 2");
    }
   
    public static void main(String[] args) {
       System.out.println("I am in main class");
        Test t=new Test();
    }
    
}
