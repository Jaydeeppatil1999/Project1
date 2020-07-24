import java.io.*;
import java.util.*;
class Demo118
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		System.out.println("Enter 2 no.");
		String s1=br.readLine();
		
		StringTokenizer st= new StringTokenizer(s1);
		String a =st.nextToken();
		String b =st.nextToken();
		
		int x= Integer.parseInt(a);
		int y= Integer.parseInt(b);

		System.out.println("Sum="+(x+y));
	}
}