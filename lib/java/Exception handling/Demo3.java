import java.io.*;
class Demo3
{
	static void show2()
	{
		try
		{
			PrintWriter pw=new PrintWriter("xyz.txt");
		}
		catch(FileNotFoundException e)
		{
		}
	}
	static void show1()
	{
		show2();
	}
	public static void main(String ar[])
	{
		show1();
		System.out.println("patil");
	}
}