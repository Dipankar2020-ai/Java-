class Outer
{
    static int x=10;
    static class Inner
    {
        void show()
        {
            System.out.println(x);
        }
    }
    
}


public class Staticinnerclass {

    
    public static void main(String[] args) {
       Outer.Inner oi=new Outer.Inner();    
       oi.show();
    }
    
}
