class Demo107
{
	public static void main(String ar[])
	{
		int k=1;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(k<=15)
				{
					System.out.print(k);
					k++;
				}
			}
			System.out.println();
		}
	}
}