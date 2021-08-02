import java.util.*;
class Cuboid
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int height=sc.nextInt();
		int breadth=sc.nextInt();
		float frontarea=length*height;
		float backarea=frontarea;
		float rightarea=breadth*height;
		float leftarea=rightarea;
		float bottomarea=length*breadth;
		float toparea=bottomarea;
		float totalarea=2*frontarea+2*rightarea+2*bottomarea;
		System.out.println("Totalarea of cuboid is:"+totalarea);
		float volume=length*breadth*height;
		System.out.println("Volume of cuboid is :"+volume);
	}

}