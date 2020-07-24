import java.io.*;
class Demo126
{
	public static void main(String ar[])throws IOException
	{
		FileOutputStream fo =new FileOutputStream("abc.txt",true);
		String s1=" jay patil";
		
		for(int i=0; i<s1.length(); i++)
		{
			fo.write(s1.charAt(i));
		}
		fo.close();
	}
}