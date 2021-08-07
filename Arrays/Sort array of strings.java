package sortstrings;

/**
 *
 * @author DIPANKAR
 */
public class Sortstrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Arr[]={"mango","banana","apple","jackfruit","coconut"};
        java.util.Arrays.sort(Arr);
        for(String x:Arr)
            System.out.print(x+" ");
    }
    
}
