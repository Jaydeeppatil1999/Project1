import java.awt.*;
import javax.swing.*;
class FDemo extends JFrame
{
	FDemo()
	{
		setLayout(null);
		Font f = new Font("Calibri (Body)",Font.ITALIC,30);
		setFont(f);
		
		JLabel n1 = new JLabel("Enter Name");
		n1.setFont(f);
		n1.setSize(300,30);
		n1.setLocation(30,60);
		add(n1);
		
		JTextField t1= new JTextField(10);
		t1.setFont(f);
		t1.setSize(230,30);
		t1.setLocation(200,60);
		add(t1);
		
		JLabel n2 = new JLabel("Enter Pass");
		n2.setFont(f);
		n2.setSize(300,30);
		n2.setLocation(30,120);
		add(n2);
		
		JPasswordField p =  new JPasswordField (10);
		p.setFont(f);
		p.setSize(230,30);
		p.setLocation(200,120);
		add(p);
		
		JButton b1 = new JButton("Login");
		//b1.setFont(f);
		b1.setSize(90,35);
		b1.setLocation(200,210);
		add(b1);
	}
}
class  loginp2
{
	public static void main(String args[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(500,400);
		f.setLocation(250,250);
		f.setBackground(Color.red);
		f.setForeground(Color.white);
	}
}