import java.io.*;
class Demo44
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		System.out.println("Enter any character");
		
		String x=br.readLine();
		
		System.out.println("character in="+x);
	}
}