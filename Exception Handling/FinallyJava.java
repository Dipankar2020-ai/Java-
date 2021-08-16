public class FinallyJava {

    
    
     static void meth1()
        {
            int a=10;
            int b=0;
            try
            {
                int c=a/b;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally
              {
                   System.out.println("The program is completed");   
                }
        }
    
    public static void main(String[] args) {
       
       meth1();
    }
    
}
