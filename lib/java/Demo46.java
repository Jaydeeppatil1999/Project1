class Demo46
{
	public static void main(String ar[])
	{
		int i; 
		int s=0;
		for(i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				s=s+i;
			}
			else
			{
				s=s-i;
			}
		}
		System.out.println(s);
	}
}