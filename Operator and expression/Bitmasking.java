class Bitmasking
{
	public static void main(String args[])
	{
		int  a=9;
		int  b=12;
		System.out.println(String.format("%32S",Integer.toBinaryString(a)));
		System.out.println(String.format("%32S",Integer.toBinaryString(b)));
		b=b<<4;
		System.out.println(String.format("%32S",Integer.toBinaryString(b)));
		a=a|b;
		
		System.out.println(String.format("%32S",Integer.toBinaryString(a)));
		

		
	}
}