import java.io.*;
class Demo1
{
	static void show1()throws FileNotFoundException
	{
		PrintWriter pw=new PrintWriter("xyz.txt");
	}
	public static void main(String ar[])throws FileNotFoundException
	{
		show1();
		System.out.println("Soft4");
	}
}