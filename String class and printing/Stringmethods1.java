class Stringmethods1
{
	public static void main(String args[])
	{
		String str="www.google.com";
		boolean ans=str.startsWith("www");
		System.out.println(ans);
		boolean ans1=str.endsWith("cop");
		System.out.println(ans1);
		int index=str.indexOf(".");
		System.out.println(index);
		char ch=str.charAt(5);
		System.out.println(ch);
		int index2=str.indexOf(".",4);
		System.out.println(index2);
		int ans2=str.indexOf("!");
		System.out.println(ans2);
		int ans3=str.lastIndexOf("o");
		System.out.println(ans3);
		int ans4=str.lastIndexOf("g",5);
		System.out.println(ans4);
	}
}