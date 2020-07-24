import java.io.*;
class Demo6
{
	public static void main(String ar[])throws IOException
	{
		try(FileWriter f=new FileWriter("xyz.txt"))
		{
				f.write("Soft");
		}
	}
}