
import java.util.*;
class Bitwise
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("a is "+a+" "+"b is "+b);
		a=a^b;
        b=a^b;
        a=a^b;
       System.out.println("a is "+a+" "+"b is "+b);
	}
}