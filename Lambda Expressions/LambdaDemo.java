interface MyLambda
{
    public void show();
}


public class LambdaDemo {

    
    public static void main(String[] args) {
       
       MyLambda m=()->{System.err.println("Hello world");};
       m.show();
    }
    
}
