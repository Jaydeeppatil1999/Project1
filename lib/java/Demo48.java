class Demo48
	{
		public static void main(String ar[])
		{
			int i,j;
			X:
			for(i=1; i<=10; i++)
			{
				for(j=1; j<=10; j++)
				{
					if(i==5)break X ;
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		
	}