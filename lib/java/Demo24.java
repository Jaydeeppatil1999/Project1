class Demo24
{
	public static void main(String ar[])
	{
		int x=2;
		int y=5;
		
		y=x-- + ++x +y++ + --x + ++y;
		
		System.out.println(x);
		System.out.println(y);
	}
}