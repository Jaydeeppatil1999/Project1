import java.awt.*;
import javax.swing.*;
class FDemo extends JFrame
{
	FDemo() 
	{
		setLayout(new FlowLayout());
		Font f=new Font("Calibri (Body)",Font.BOLD,15);
		setFont(f);
		
		JLabel n=new JLabel("Enter Name");
		n.setFont(f);
		add(n);
		
		JTextField t1=new JTextField(10);
		t1.setFont(f);
		add(t1);
		
		JLabel n2=new JLabel("Enter Pass");
		n2.setFont(f);
		add(n2);
		
		JPasswordField p=new JPasswordField(10);
		p.setFont(f);
		add(p);
				
		JButton b1 = new JButton("Login");
		b1.setFont(f);
		add(b1);
		
	}
}
class loginpage
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(300,300);
		f.setLocation(300,300);
	} 
}