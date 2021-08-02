class Bitwisedemo
{
	public static void main(String args[])
	{
	int x=0b1011;
	int y=0b0101;
	int z=x&y;
	int s=x|y;
	int t=x^y;
	System.out.println(z);
	System.out.println(s);
	System.out.println(t);
	int a=x>>1;
	int b=y<<1;
	System.out.println(a);
	System.out.println(b);

	int g=-10;
	int _x=g>>1;
	System.out.println(_x);
	System.out.println(String.format("%32S",Integer.toBinaryString(_x)));
	_x=g>>>1;
	System.out.println(_x);



     }

}