import java.io.*;
class Demo5
{
	public static void main(String ar[])
	{
		System.out.println("Soft1");
		
		PrintWriter pw=new PrintWriter("xyz.txt");
		
		System.out.println("Soft2");
		pw.close();
	}
}    