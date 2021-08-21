package builtinannotation;

@interface Myanno
{
    String name();
    String project();
    String date();
    double version();
}

@Myanno(name="Dipankar",project="Bank",date="1/1/2000",version=4.5)
public class BuiltinAnnotation {

    
    public static void main(String[] args) {
        System.out.println("hello World");
    }
    
}
