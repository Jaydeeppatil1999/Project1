class A
{
	void show1()
	{
		System.out.println("classA");
	}
}
class B extends A
{
	@Override
	void show1()
	{
		System.out.println("Class B");
	}
}
class Demo123
{
	public static void main(String ar[])
	{
		B b=new B();
		b.show1();
	}
}