package sumvar;

/**
 *
 * @author DIPANKAR
 */
public class Sumvar {

    int sum(int ...A)
    {
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            ans=ans+A[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Sumvar s=new Sumvar();
        int total=s.sum(10,20,30,40,55);
        System.out.println(total);
    }
    
}
