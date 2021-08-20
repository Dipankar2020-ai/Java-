class Myobject
{
    public String toString()
    {
        return "This is my object";
    }
    public int hashCode()
    {
        return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
        
    }
}


public class LangDemo {

 
    public static void main(String[] args) {
        
        Myobject m1=new Myobject();
        Myobject m2=new Myobject();
        System.out.println(m1.equals(m2));
    }
    
}
