import java.io.*;
class A
{
	static void show2()
	{
		System.out.println("show2");
		A a=new A();
		a.show1();
	}
	void show1()
	{
		System.out.println("show1");
	}
}
class Demo119
{
	public static void main(String ar[])
	{
		A.show2();
		System.out.println("indore");2
	}
}