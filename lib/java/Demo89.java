class Demo89
{
	public static void main(String ar[])
	{
		int i,j,k;
		
		for(i=1; i<=11; i++)
		{
			for(k=1; k<i; k++)
			{
				System.out.print(" ");
			}
			for(j=i; j<=11; j++)
			{
				if(j==i||j==11|| i==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}