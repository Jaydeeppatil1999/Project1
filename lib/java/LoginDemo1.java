import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginDemoo extends JPanel// implements ActionListener
{
	JLabel l1,l2;
	JTextField tx1;
	JPasswordField tx2;
	JButton b1,b3;
	
	LoginDemo1()
	{
		
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l1=new JLabel("Name");
		l1.setSize(60,30);
		l1.setFont(f);
		l1.setLocation(70,60);
		add(l1);
		
		tx1=new JTextField(10);
		tx1.setSize(150,30);
		tx1.setLocation(150,60);
		add(tx1);
		
		l2=new JLabel("pass");
		l2.setSize(75,30);
		l2.setFont(f);
		l2.setLocation(70,110);
		add(l2);
		
		tx2=new JPasswordField(10);
		tx2.setSize(150,30);
		tx2.setLocation(150,110);
		add(tx2);
		
		b1=new JButton("Login");
		b1.setSize(70,40);
		b1.setLocation(90,280);
		add(b1);
		
		b3=new JButton("Register");
		b3.setSize(90,40);
		b3.setLocation(160,280);
		add(b3);
		
	//	b1.addActionListener(l);
		// b3.addActionListener(this);
	}
	// public void actionPerformed(ActionEvent e)
	// {
		
		// String s1=login.tx1.getText();
		// String s2=login.tx2.getText();
		
		// if(s1.equals("abc") && s2.equals("123"))
		// {
			// card.next(c);
		// }
		// else
		// {
			// JOptionPane.showMessageDialog(null,"Invalid Message");
		// }
	// }
}
