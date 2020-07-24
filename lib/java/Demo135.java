class A
{
	void show1()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("class B");
	}
}
class Demo135
{
	public static void main(String ar[])
	{
		A a= new A();
		a.show1();
		a.show2();
	}
}
