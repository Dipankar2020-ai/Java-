public class FloatclassDemo {

   
    public static void main(String[] args) {
        float f=12.3f;
        Float b=12.5f;
        System.out.println(b.equals(f));
        Float c=12.4f/0;
        System.out.println(c.isInfinite());
        Float d=(float)Math.sqrt(-1);
        System.out.println(d.isNaN());
        
    }
    
}
