import java.io.*;
class Demo4
{
	public static void main(String ar[])
	{
		System.out.println("patil");
		int age = Integer.parseInt(ar[0]);
		if(age<18)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Welcome");
		}
		System.out.println("patil2");
	}
}