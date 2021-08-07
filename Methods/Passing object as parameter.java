package practisingarray;

/**
 *
 * @author DIPANKAR
 */
public class PractisingArray {
   
    void update1(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            A[i]=A[i]+1;
            
        }
    }
    
    public static void main(String[] args) {
        int A[]={2,3,4,5,6};
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");  
        }
        System.out.println();
        PractisingArray m=new PractisingArray();
        m.update1(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
            
        }
        
    }
    
}
