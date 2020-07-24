import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Demo43
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		System.out.println("Enter any character");
		
		char x=(char)br.read();
		
		System.out.println("Character in="+x);
		
	}
}