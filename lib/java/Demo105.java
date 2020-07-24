class Demo105
{
	public static void main(String ar[])
	{
		char c=65;
		
		for(int i=1; i<=5; i++)
		{
			for(int k=i; k<9; k++)
			{
				System.out.print(" ");//1 space
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+c+" ");
				c++;
			}
			System.out.println();
		}
	}
}