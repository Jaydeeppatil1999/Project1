abstract class A
{
	abstract int cube(int x);
}
class Demo147
{
	public void main(String ar[])
	{
		int x=new A()
		{
			int cube(int x)
			{
				return(x*x*x);
			}
		};
		System.out.println(x);
	}
}