class A
{
	int x,y;
	void get(int a,int b)
	{
		x=a;
		y=b;
	}
	void sum()
	{
		System.out.println("Sum="+(x+y));
	}
}
class B extends A
{
	void sub()
	{
		System.out.println("Sub="+(x-y));
	}
}
class Demo121
{
	public static void main(String ar[])
	{
		A a=new A();
		a.get(15,6);
		a.sum();
		
		B b=new B();
		b.get(15,6);
		b.sub();
	}
}