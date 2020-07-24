class A
{
	int x,y;
	void get(int x,int y)
	{
		this.x=x;
		this.y=y;
		A a=new A();
		a.show();
	}
	void show()
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
class Demo133
{
	public static void main(String ar[])
	{
		A a=new A();
		a.get(10,11);
		a.show();
	}
}