 abstract class Hospital
    {
        
        abstract void emergency();
        abstract void appointment();
        abstract void admit();
        abstract void biling();
    }
    class Myhospital extends Hospital
    {
        @Override
       public void emergency()
       {
          System.out.println("Emergency happen");
       }
       @Override
       public void appointment()
       {
           System.out.println("There is an appointment");
       }
        @Override
       public void admit()
       {
           System.out.println("Admit a patient");
       }
        @Override
       public void biling()
       {
            System.out.println("Tell me the bill amount"); 
       }
    
    }  

public class Abstractexample2 {

       
    public static void main(String[] args) {
       Hospital h=new Myhospital();
       h.admit();
       h.appointment();
       h.biling();
       h.emergency();
       
    }
    
}
