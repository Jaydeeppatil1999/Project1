import java.io.*;
class Demo127
{
	public static void main(String ar[])throws IOException
	{
		int ch;
		FileInputStream fo = new FileInputStream("abc.txt");
		ch= fo.read();
		System.out.println((char)ch);
		fo.close();
	}
}