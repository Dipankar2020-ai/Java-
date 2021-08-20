

public class StringDemo {

    
    public static void main(String[] args) {
        String s1="Hello";
        StringBuffer s2=new StringBuffer("Hello");
        StringBuilder s3=new StringBuilder("Hello");
        String s5=s1.concat("World");
        System.out.println(s1.concat("World"));
        System.out.println(s2.append("World"));
       
        System.out.println(s1.equals(s5));
        
        
        
    }
    
}
