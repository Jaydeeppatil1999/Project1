class Demo132
{
	public static void main(String ar[])
	{
		int i,j,k;
		for(i=1; i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			for(k=i;j<=5;j++)
			{
				System.out.print(" *");
			}
		System.out.println();
		}
	}
}