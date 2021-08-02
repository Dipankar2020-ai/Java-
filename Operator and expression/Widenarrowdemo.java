/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widenarrowdemo;

/**
 *
 * @author DIPANKAR
 */
public class Widenarrowdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b=10;
        short s=5;
        int i=6;
        long l=15;
        float f=12.34f;
        s=b;//Widening or implicit
   
       b=(byte)s;//Narrowing or explicit
       i=(int)f;
         System.out.println(s);
       System.out.println(i);
       System.out.println(b);
    }
    
}
