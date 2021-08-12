class Outer
{
	int x=10;
	class Inner
	{
		int y=15;
		void display()
		{
			System.out.println(x+" "+y);
		}
	}
	void display1()
	{
		Inner i =new Inner();
		i.display();
		System.out.println(x+" "+i.y);
	}
}


public class Innerclass {

  
	public static void main(String[] args) {
		
		Outer o=new Outer();
		o.display1();
		Outer.Inner m=new Outer().new Inner();
		System.out.println(m.y);
	}
	
}
