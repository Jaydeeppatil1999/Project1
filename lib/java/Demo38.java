class Demo38
	{
		public static void main(String ar[])
		{
			byte x=5;
			byte y=4;
			byte z=6;
			
			x+=y+=z+=10;
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}