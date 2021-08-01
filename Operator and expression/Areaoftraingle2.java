import java.util.Scanner;
import java.lang.Math;
public class Areaoftraingle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
     
        float s=(float)(a+b+c)/2;
        System.out.println("The perimeter is :"+s);
        double ans=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(ans);
        System.out.println("The area of traingle is:"+area);
        
           
        
        
    }
    
}