import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginDemo extends JPanel 
{
	JLabel l1,l2;
	JTextField tx1;
	JPasswordField tx2;
	JButton b1;
	LoginDemo()
	{
		l1=new JLabel("Name");
		add(l1);
		
		tx1=new JTextField(10);
		add(tx1);
		
		l2=new JLabel("pass");
		add(l2);
		
		tx2=new JPasswordField(10);
		add(tx2);
		
		b1=new JButton("Login");
		add(b1);
		
		//b1.addActionListener(this);
	}
	// public void actionPerformed(ActionEvent e)
	// {
		// card.next(c);
	// }
}
class LoginDemo
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(450,450);
		f.setLocation(40,50);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}