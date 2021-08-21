package mylambda2;
//@FunctionalInterface
interface Adition
{
    public int add(int a,int b);
}


public class MyLambda2 {

    public static void main(String[] args) {
        Adition m=(a,b)->a+b;
        System.out.println(m.add(10,20));
        
        
    }
    
}
