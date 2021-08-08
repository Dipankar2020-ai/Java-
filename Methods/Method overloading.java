package methodoverloading;

public class Methodoverloading {

    int max(int a,int b)
    {
        System.out.println("It is in int max() function");
    if(a>b)
       return a;
     else
      return b;
    }
    float max(float a,float b)
    {
        System.out.println("It is in float max() function");
         if(a>b)
            return a;
       else
         return b;
        
    }
    double max(double a,double b)
    {
          System.out.println("It is in double max() function");
         if(a>b)
            return a;
       else
         return b;
        
    }
    
    public static void main(String[] args) {
       
        Methodoverloading m=new Methodoverloading();
        System.out.println(m.max(10,15));
        System.out.println(m.max(10.0f,15.0f));
         System.out.println(m.max(10.0,15.0));
    }
    
}
