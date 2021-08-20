


public class WrapperDemo {

   
    public static void main(String[] args) {
                 
        //Integer i=new Integer(10);
        Integer a=Integer.valueOf(10);
        Integer b=10;
        byte c=15;
        Byte d=Byte.valueOf("45");
        Byte e=Byte.valueOf(c);
        Short f=Short.valueOf("23");
        Float g=12.3f;
        Float h=Float.valueOf("123.45");
        Double j=Double.valueOf('A');
        Boolean l=Boolean.valueOf("123.45");
        Float x=h.floatValue();//unboxing
        Float y=h;//Auto unboxing
        int m=10;
        Integer n=m;//Autoboxing
        int p=n.intValue();//unboxing
        System.out.println(f+" "+d);
        
    }
    
}