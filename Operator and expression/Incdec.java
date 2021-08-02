/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incdec;

/**
 *
 * @author DIPANKAR
 */
public class Incdec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5;
        int y=x++;
        System.out.println("x is "+x+" "+"y is "+y);
        int z=++x;
        System.out.println("x is "+x+" "+"z is "+z);
        char _x='A';
        _x++;
        System.out.println(_x);
    }
    
}
