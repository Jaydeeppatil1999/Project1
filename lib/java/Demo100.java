class Demo100
{
	public static void main(String ar[])
	{
		int n=10;
		int p=1;
		int s=0;
		int r;
		while(n>0)
		{
			r=n%2;
			s=s+r*p;
			p=p*10;
			n=n/2;
		}
		System.out.println(s);
	}
}