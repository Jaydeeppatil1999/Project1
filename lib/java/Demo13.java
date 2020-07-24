class Demo13
	{
		public static void main(String ar[])
		{
			int x=10;
			int y=20;
			int z=15;
			
			if(x>y)
			{
				if(x>z)
				{
					System.out.println("x is largest");
				}
			}
			if(y>x)
			{
				if(y>z)
				{
					System.out.println("y is largest");
				}
			}
			if(z>x)
			{
				if(z>y)
				{
					System.out.println("z is largest");
				}
			}
		}
	}