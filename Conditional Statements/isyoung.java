 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeven;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class Oddeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=14 && a<=55)
        {
            System.out.println("The man is young");
        }
        else
        {
            System.out.println("The man is not young");
        }
        
    }
    
}
