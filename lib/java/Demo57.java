class Demo57
{
	public static void main(String ar[])
	{	
		int i,j;
		for(i=1; i<=5; i++)
		{	
			int k=5;
			for(j=i; j<=5; j++ )
			{
				System.out.print(" "+k--);
			}
			System.out.println();
		}		
	}
}