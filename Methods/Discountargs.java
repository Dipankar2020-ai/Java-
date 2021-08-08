package sumvar;

/**
 *
 * @author DIPANKAR
 */
public class Sumvar {

    double sum(double ...A)
    {
        double ans=0;
        for(int i=0;i<A.length;i++)
        {
            ans=ans+A[i];
        }
        if(ans>200)
        {
            return 20;
        }
        if(ans>190)
        {
            return 10;
        }
        return 0;
        
    }
    
    public static void main(String[] args) {
        Sumvar s=new Sumvar();
        double total=s.sum(10.25,35.90,20.78,30.45,40.23,55.67);
        System.out.println("The discount amount is : "+total+"%");
        double total1=s.sum(10.25,35.90,20.78,30.45,40.23,75.67);
        System.out.println("The discount amount is : "+total1+"%");
    }
    
}
