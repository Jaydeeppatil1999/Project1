import java.io.*;
class Demo125
{
	public static void main(String ar[])throws IOException
	{
		FileOutputStream fo = new FileOutputStream("abc.txt");
		String s1 ="Softwaves";
		
		for(int i=0; i<s1.length();i++)
		{
			fo.write(s1.charAt(i));
		}
		fo.close();
	}
}