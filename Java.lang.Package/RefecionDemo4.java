package refeciondemo4;
import java.lang.reflect.*;
class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    public My()
    {
        
    }
    public My(int x,int y)
    {
        
    }
    public void display(String s1,String s2)
    {
        
    }
    public int show(int x,int y)
    {
        return 0;
    }
}

public class RefecionDemo4 {

   
    public static void main(String[] args) {
       My m=new My();
       Class c=m.getClass();
       System.out.println(c.getName());
       Field field[]=c.getDeclaredFields();
       for(Field f:field)
       {
           System.out.println(f);
       }
       Constructor con[]=c.getConstructors();
       for(Constructor c1:con)
       {
            System.out.println(c1);
       }
       Method meth[]=c.getMethods();
       for(Method m1:meth)
       {
           System.out.println(m1);
       }
       Parameter param[]=meth[0].getParameters();
       for(Parameter p:param)
       {
           System.out.println(p);
       }
       
       
       
    }
    
}
