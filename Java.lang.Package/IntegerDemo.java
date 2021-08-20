public class IntegerDemo {


    public static void main(String[] args) {
        Integer m2=Integer.valueOf("123");
        Integer m3=Integer.valueOf("1010", 2);
         System.out.println(Integer.toBinaryString(m3));
        //Integer m4=Integer.decode("oxA7");
        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(40));
    }
    
}
