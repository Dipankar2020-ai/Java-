class Formatspecifier
{
	public static void main(String args[])
	{
		int a=10;
		System.out.printf("%05d\n",a);//here 0 is a flag
	    a=-10;
		System.out.printf("%(5d\n",a);
		System.out.printf("%+5d\n",a);
		float b=123.45f;
        System.out.printf("%6.2f\n",b);
        String str="java";
        System.out.printf("%20s\n",str);
        System.out.printf("%-20s\n",str);
	}
}