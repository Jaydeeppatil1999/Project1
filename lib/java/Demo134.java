class Demo134
{
	public static void main(String ar[])
	{
		System.out.println("2");
		static 
	{
		System.out.println("s2");
	}
	void static 
	{
		System.out.println("s2");
	}
		try
		{
			int x=Integer.parseInt("10");
			try
			{
			    int y=Integer.parseInt("a");
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("inner catch");
			}
		}
		catch(Exception e)
		{
			System.out.println("outer catch");
		}
	}
}
