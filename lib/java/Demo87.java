class Demo87
{
	public static void main(String ar[])
	{
		int i,j,k;
		for(i=1; i<=11; i++)
		{
			for(k=1; k<i; k++)
			{
				System.out.print(" ");//1 space
			}
			for(j=i; j<=11; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//System.out.println();
	}
}