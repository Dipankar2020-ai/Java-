class ATM
{
   synchronized  public void checkbalance(String name)
    {
        
        System.out.print(name+" checking");
          try
           {
           Thread.sleep(100);
            } 
         catch(Exception e)
            {
           }
          System.out.println(" Balance");
    }
  synchronized  public void withdraw(String name ,int amount)
    {
        System.out.print(name+" withdrawing");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            
        }
        System.out.println(amount);
    }
  
}
class Customer extends Thread
{
     String name;
     ATM atm;
     int amount;
     Customer(String n,ATM a,int amn )
     {
         name=n;
         atm=a;
         amount=amn;
     }
     public void useatm()
     {
         atm.checkbalance(name);
         atm.withdraw(name, amount);
     }
     public void run()
     {
         useatm();
     }
}



public class Scthread1 {

    
    public static void main(String[] args) {
       ATM atm=new ATM();
       Customer c1=new Customer("Dipankar",atm,1000);
       Customer c2=new Customer("Raju",atm,2000);
       c1.start();
       c2.start();
    }
    
}
