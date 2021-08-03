
public class Stringmethods3 {

   
    public static void main(String[] args) {
        
        String str1="JAVA";
        String str2="java";
        String str3="python";
        String str4="python";
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));
        System.out.println(str1.compareTo(str2));
        String str5="java";
        String str6=new String("java");
        System.out.println(str2.equals(str5));
        System.out.println(str2.equals(str6));
        System.out.println(str2==str6);
        
        
    }
    
}