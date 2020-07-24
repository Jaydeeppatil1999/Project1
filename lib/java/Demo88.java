class Demo88
{
	public static void main(String ar[])
	{
		int i,j,k;
		
		for(i=1; i<=11; i++)
		{
			for(k=i; k<11; k++)
			{
				System.out.print(" ");//1 space
			}
			for(j=1; j<=11; j++)
			{
				if(j==1||i==j||i==11)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");//2space
				}
			}
			System.out.println();
		}
	}
}