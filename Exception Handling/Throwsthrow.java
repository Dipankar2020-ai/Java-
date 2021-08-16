import java.util.*;

public class Throwsthrow {
  
    Scanner sc=new Scanner(System.in);
    static int fun1()
    {
       return 10/0;
        
    }
    
  static void  fun2()
    {
         fun1();
    }
    
    static void  fun3()
    {
         fun2();
    }
  
    public static void main(String[] args) {
        try
        {
            fun3();
        }
        catch(Exception e)
        {
            System.out.println("Divisible by zero");
        }
    }   
    
}