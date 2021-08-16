class NegativeDimensionException extends Exception
{
    @Override
    public String toString()
    {
        return "Dimention can't be negative";
    }
    
}

public class ThrowThrowsDemo {
   static int areaof(int l,int b) throws NegativeDimensionException
   {
       if(l<0 || b<0)
       {
           throw new  NegativeDimensionException();
       }
       return l*b;
   }
    
    static void  fun3() throws NegativeDimensionException
    {
        int area;
        area=areaof(10,-15);
        System.out.println("Area of rectangle "+area);
        
    }
    
    public static void main(String[] args) throws NegativeDimensionException 
    {
        try
        {
            fun3();
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
       
        
    }
    
}
