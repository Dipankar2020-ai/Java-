package maxiumnumberusingvarargs;

/**
 *
 * @author DIPANKAR
 */
public class Maxiumnumberusingvarargs {
   
    int maxiumvar(int ...x)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<x.length;i++)
        {
                 if(x[i]>max)
                 {
                     max=x[i];
                 }
        }
        return max;
    }
   
    public static void main(String[] args) {
       Maxiumnumberusingvarargs m=new Maxiumnumberusingvarargs();
       int ans=m.maxiumvar(10,34,20,76,35);
       System.out.println(ans);
        
    }
    
}
