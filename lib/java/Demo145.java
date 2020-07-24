class Demo145
{
	int x=100;
	void show()
	{
		System.out.println("sir");
	}
	class A
	{
		void show1()
		{
			System.out.println("class A");
		}
	}
	public static void main(String ar[])
	{
		Demo145 d=new Demo145();
		System.out.println(d.x);
		d.show();
		
		A a=d.new A();
		a.show1();
	}
}