package practisngarray;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class PractisngArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int A[]=new int[size];
       
        for(int i=0;i<A.length;i++)
        {
             A[i]=sc.nextInt();
        }
        System.out.println("Enter the element which you wamt to find");
        int b=sc.nextInt();
        int flag=0,pos=-1;
        for(int i=0;i<A.length;i++)
        {
            if(b==A[i])
            {
                flag=1;
                pos=i;
                
            }
        }
        if(flag==1)
            System.out.println("The element is present at index "+pos);
        else
            System.out.println("the element is not present in the array");
        
    }
    
}
