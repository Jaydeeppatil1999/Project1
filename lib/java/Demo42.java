import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Demo42
{
	public static void main(String ar[])throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		System.out.println("Enter any character");
		
		int x=br.read();
		
		System.out.println("character in ="+x);
	}
}