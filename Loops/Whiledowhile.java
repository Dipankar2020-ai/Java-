 */
package whileanddowhile;

/**
 *
 * @author DIPANKAR
 */
public class Whileanddowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1,n=100,j=1;
        while(i<n)
        {
            System.out.print(i+" ");
            i=i*2;
        }
        System.out.println();
        
        do{
            
            System.out.print(j+" ");
            j=j*2;
        }
        while(j<n);
    }
    
}
