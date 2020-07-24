import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JFDemo extends JPanel
{
	TextField tx1,tx2,tx3,tx4;
	JButton b1,b2;
	JLabel l1,l2,l3,l4;
	JFDemo()
	{
		//setTitle("Home");
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l1=new JLabel("Name");
		l1.setSize(60,30);
		l1.setFont(f);
		l1.setLocation(70,60);
		add(l1);
		
		tx1=new TextField(10);
		tx1.setSize(150,30);
		tx1.setLocation(200,60);
		add(tx1);
		
		
		l2=new JLabel("Branch");
		l2.setSize(75,30);
		l2.setFont(f);
		l2.setLocation(70,110);
		add(l2);
		
		tx2=new TextField(10);
		tx2.setSize(150,30);
		tx2.setLocation(200,110);
		add(tx2);
		
		l3=new JLabel("E-mail");
		l3.setSize(60,30);
		l3.setFont(f);
		l3.setLocation(70,160);
		add(l3);
		
		tx3=new TextField(10);
		tx3.setSize(150,30);
		tx3.setLocation(200,160);
		add(tx3);
		
		l4=new JLabel("Password");
		l4.setSize(90,30);
		l4.setFont(f);
		l4.setLocation(70,210);
		add(l4);
		
		tx4=new TextField(10);
		tx4.setSize(150,30);
		tx4.setLocation(200,210);
		add(tx4);
		
		b1=new JButton("Submit");
		b1.setSize(80,40);
		b1.setLocation(200,280);
		add(b1);
		
		b2=new JButton("Cancel");
		b2.setSize(80,40);
		b2.setLocation(290,280);
		add(b2);
		
	}
	// public void paint(Graphics g)
	// {
		// g.drawString("Register",100,100);
	// }
}
// class Register
// {
	// public static void main(String ar[])
	// {
		// FDemo f=new FDemo();
		// f.setVisible(true);
		// f.setSize(500,500);
		// f.setLocation(60,60);
		// f.setBackground(Color.blue);
		// //f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	// }
// }