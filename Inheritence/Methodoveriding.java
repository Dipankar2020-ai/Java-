class Super
{
    public void show()
    {
        System.out.println("Welcome");
    }
}
class Sub extends Super
{
    public void show()
    {
        System.out.println("Welocome to the subclass");
    }
}
public class Methodoverriding {

   
    public static void main(String[] args) {
        Super s=new Super();
        s.show();
        Sub su=new Sub();
        su.show();
        Super sc=new Sub(); //A super class reference holding the objecvt of sub class and overridden method is called , then method 
                            //of objecvt is called ,not the method of refernce ->Dynamic method dispatch
        sc.show();
        
    }
    
}
