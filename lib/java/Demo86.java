class Demo86
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
			for(j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//System.out.println();
	}
}