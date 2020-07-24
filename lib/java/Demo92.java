class Demo92
{
	public static void main(String ar[])
	{
		int a=-1;
		int b=1;
		int c;
		int i=1;
		
		while(i<=10)
		{
			c=a+b;
			System.out.println(c);
			a = b;
			b = c;
			i++;
		}
	}
}