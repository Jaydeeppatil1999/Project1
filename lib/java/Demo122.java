class A
{
	A()
	{
		System.out.println("1");
	}
}
class B extends A 
{
	B()
	{
		System.out.println("2");
	}
}
class C extends B
{
	C()
	{
		System.out.println("3");
	}
}
class Demo122
{
	public static void main(String ar[])
	{
		C c = new C();
	}
}