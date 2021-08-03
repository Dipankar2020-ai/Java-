



public class Stringpractice {

   
    public static void main(String[] args) {
        // TODO code application logic here
        String str="Hello";
        String str1=new String("Java");
        System.out.println(str);
        System.out.println(str1);
        char c[]={'D','i','p','a','n','k','a','r'};
        String str2=new String(c,1,4);
        System.out.println(str2);
        byte b[]={65,66,67,68};
        String str3=new String(b,1,3);
        System.out.println(str3);
        String str4="TCS";
        String str5="TCS";
        String str6=new String("TCS");
        System.out.println(str4==str5);
         System.out.println(str6==str5);

    }
    
}