import java.io.*;
class Demo128
{
	public static void main(String ar[])throws IOException
	{
		int ch;
		FileInputStream fo=new FileInputStream("abc.txt");
		
		ch=fo.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=fo.read();
		}
		fo.close();
	}
}