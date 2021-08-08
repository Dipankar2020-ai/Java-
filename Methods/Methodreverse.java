package methodreverse;
/**
 *
 * @author DIPANKAR
 */
public class Methodreverse {
  
    int reverse(int n)
    {
        int rev=0,rem;
        while(n!=0)
        {
             rem=n%10;
             rev=rev*10+rem;
             n=n/10;
        }
        return rev;
    }
    void reverse(int A[],int n)
    {
       int i=0;
       int j=n-1;
       while(i<j)
       {
           int temp=A[i];
           A[i]=A[j];
           A[j]=temp;
           i++;
           j--;
       }
    }
   
    public static void main(String[] args) {
        int n=125;
        int A[]={2,3,4,5,6};
        Methodreverse m=new Methodreverse();
        System.out.println("The reverse of a number : "+m.reverse(n));
         m.reverse(A,A.length);
         System.out.println("the reverse array is : ");
         for(int i=0;i<A.length;i++)
         {
             System.out.print(A[i]+" ");
         }
        
    }
    
}
