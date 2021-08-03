class Regularexp
{
	public static void main(String args[])
	{
		String str="a";
		System.out.println(str.matches("."));
		System.out.println(str.matches("[abc]"));
		String str1="%";
		System.out.println(str1.matches("[a-z][0-9]"));
		String str2="k8";
		System.out.println(str2.matches("[a-z][0-9]"));
		String str3="a";
		System.out.println(str3.matches("a|b"));
	}
}