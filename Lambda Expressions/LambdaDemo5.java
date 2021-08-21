interface MyLambda
{
    public void display(String str);
}

public class LambdaDemo5 {
    public LambdaDemo5(String s)
    {
        System.out.println(s.toUpperCase());
    }

    public static void reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        
    }
   
    public static void main(String[] args) {
       MyLambda ml=System.out::println;
       ml.display("Hello");
       MyLambda ml2=LambdaDemo5::reverse;
       ml2.display("Hello");
       MyLambda ml3=LambdaDemo5::new;
       ml3.display("Hello");
        
    }
    
}
