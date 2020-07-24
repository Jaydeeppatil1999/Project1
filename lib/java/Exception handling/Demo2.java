import java.io.*;
class Demo2
{
	static void show2()throws FileNotFoundException
	{
		PrintWriter pw= new PrintWriter("xyz.txt");
	}
	static void show1()throws FileNotFoundException
	{
		show2();
	}
	public static void main(String ar[])throws FileNotFoundException
	{
		show1();
		System.out.println("jay");
	}
}