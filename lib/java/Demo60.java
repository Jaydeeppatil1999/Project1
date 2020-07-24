class Demo60
{
	public static void main(String ar[])
	{	
		int i,j,k;
		for(i=1; i<=4; i++)
		{	
			int m=1;
			for(j=i; j<=4; j++)
			{
				System.out.print(" "+m++);
			}
			for(k=i; k>=1; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}