class Demo104
{
	public static void main(String ar[])
	{
		int i,j;
		for(i=1; i<=11; i++)
		{
			for(j=1; j<=i; j++)
			{
				if(i%2==1)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}