import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginDemo extends JPanel implements ActionListener
{
	JLabel l1,l2;
	JTextField tx1;
	JPasswordField tx2;
	JButton b1;
	
	LoginDemo(FDemo d)
	{
		
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l1=new JLabel("Name");
		l1.setSize(60,30);
		l1.setFont(f);
		l1.setLocation(65,80);
		add(l1);
		
		tx1=new JTextField(10);
		tx1.setSize(150,30);
		tx1.setLocation(170,80);
		add(tx1);
		
		l2=new JLabel("Password");
		l2.setSize(100,30);
		l2.setFont(f);
		l2.setLocation(65,130);
		add(l2);
		
		tx2=new JPasswordField(10);
		tx2.setSize(150,30);
		tx2.setLocation(170,130);
		add(tx2);
		
		b1=new JButton("Login");
		b1.setSize(120,40);
		b1.setFont(f);
		b1.setLocation(180,210);
		add(b1);
	
		b1.addActionListener(d);
	}
	public void actionPerformed(ActionEvent e)
	{
		 System.out.println("ram");
	 }
}
