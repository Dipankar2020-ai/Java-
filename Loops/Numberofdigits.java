package counntdigitnum;

import java.util.Scanner;

/**
 *
 * @author DIPANKAR
 */
public class Counntdigitnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        if(a==0)
        {
            count=1;
        }
        while(a!=0)
        {
            int rem=a%10;
            count++;
           
            a=a/10;
        }
        System.out.println("The number of digits :"+count);
    }
    
}
