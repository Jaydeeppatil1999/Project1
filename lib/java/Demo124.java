import java.io.*;
class Demo124
{
	public static void  main(String ar[])throws IOException
	{
		FileOutputStream fo = new FileOutputStream("abc.txt");
		fo.write('a');
		fo.close();
	}
}