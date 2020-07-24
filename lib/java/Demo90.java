class Demo90
{
	int x=11;
	int p;
	int s=0;
	while(x!=0)
	{
		p=x%2;
		x=x/10;
		s=s*10+p;
	}
	while(s!=0)
	{
		int a=s%10;
		s=s/10;
		int t=t*10+a;
	}
	System.out.print(t);
}