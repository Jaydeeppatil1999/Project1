class Demo62
{
	public static void main(String ar[])
	{	
		int i,j;
		for(i=1; i<=11; i++)
		{
			if(i%2==0)
			{
				System.out.print("  ");
			}
			for(j=1; j<=11; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}