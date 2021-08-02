class Printf1
{
	public static void main(String args[])
	{
		int x=10;
		float y=0.012f;
		char z='A';
		String str="java";
		System.out.printf("%1$d %1$d %1$d\n",x);
		System.out.printf("%1$d %2$f %1$d\n",x,y);
		System.out.printf("%3$c %2$f %1$d\n",x,y,z);
		System.out.printf(str);
	}
}