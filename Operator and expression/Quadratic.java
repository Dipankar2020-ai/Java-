import java.lang.*;
import java.util.*;
class Quadratic
{
	public static void main(String args[])
	{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	double ans=Math.sqrt(b*b-4*a*c);
	double root1=(-b+ans)/2;
	double root2=(-b-ans)/2;
	System.out.println("The roots of equations are :");
	System.out.println("Root 1 :"+root1);
	System.out.println("Root 2:"+root2);
    }

}