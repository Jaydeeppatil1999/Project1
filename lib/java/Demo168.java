class Demo168
{
	public static void main(String ar[])
	{
		int x[]={10,20,30,40,50};
		int y[]=new int [5];
		int j=4;
		
		
		for(int i=0; i<=4; i++,j--)
		{
			System.out.println(x[i]);
			y[i]=x[j];
		}
		System.out.println();
		for(int i=0; i<=4; i++)
		{
			System.out.println(y[i]);
		}
	}
}