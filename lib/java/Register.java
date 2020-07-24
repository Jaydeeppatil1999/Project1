import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JFDemo extends JPanel
{
	TextField tx1;
	JButton b1;
	JFDemo()
	{
		//setTitle("Home");
		setLayout(null);
		Font f=new Font(" ",Font.BOLD,20);
		setFont(f);
		
		tx1=new TextField(10);
		tx1.setSize(200,30);
		tx1.setLocation(200,40);
		add(tx1);
		
		b1=new JButton("Submit");
		b1.setSize(100,52);
		b1.setLocation(350,80);
		add(b1);
		
	}
}
class Register
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(60,60);
		f.setBackground(Color.blue);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}