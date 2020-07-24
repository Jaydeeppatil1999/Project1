class Demo144
{
	class A
	{
		void show1()
		{
			System.out.println("sir");
		}
	}
	public static void main(String ar[])
	{
		Demo144 d=new Demo144();
		A a=d.new A();
		a.show1();
	}
}