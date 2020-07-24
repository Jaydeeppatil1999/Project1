class Demo93
{
	public static void main(String ar[])
	{
		int i,j;
		int c=0;
		
		for(i=1; i<=100; i++)
		{
			c=0;
			for(j=2; j<i; j++)
			{
				if(i%j==0)
				{
					c=1;
				}
			}
			if(c==0)
			{
				System.out.println(i);
			}
		}	
	}
}