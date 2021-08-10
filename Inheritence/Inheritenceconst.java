class Parent
{
    public Parent()
    {
        System.out.println("I am in parent class");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("I am in child class");
    }
}
class Grandchild extends Child
{
    public Grandchild()
    {
        System.out.println("I am in Grandchild class");
    }
}


public class Inheritenceconst {

  
    public static void main(String[] args) {
        Grandchild g=new Grandchild();
        
        
    }
    
}
