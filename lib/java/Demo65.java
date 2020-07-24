class Demo65
{
	public static void main(String ar[])
	{	
		int i,j,k=1;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)
			{
				if(k<=10)
				{
					System.out.print(" "+k);
					k++;
				}
			}
			System.out.println();
		}		
	}
}