
public class ExceptionDemo1 {

   
    public static void main(String[] args) {
        
        try
        {
        int A[]={10,0,30,40,50};
          try
          {
             System.out.println(A[1]);

          }
          catch(ArrayIndexOutOfBoundsException e)
          {
             System.out.println("Index is out of range");
           }
        int c=A[2]/A[1];
       
        System.out.println("The value of is "+c);
          
       }
        catch(ArithmeticException e)
           {
                 System.out.println("Denominator should not be zero");
            }
         
    System.out.println("Bye");
    
}


}
