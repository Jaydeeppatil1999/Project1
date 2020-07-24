import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Student extends JPanel
{
	JButton b1,b2,b3;
	JLabel l;
	Student(FDemo n)
	{
		setBackground(Color.gray);
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,25);
		setFont(f);
		
		l=new JLabel("Student - Page");
		l.setSize(310,44);
		l.setLocation(380,50);
		l.setFont(f);
		add(l);
		
		b1=new JButton("Login");
		b1.setSize(110,40);
		b1.setLocation(250,240);
		b1.setFont(f);
		add(b1);
		
		b2=new JButton("Register");
		b2.setSize(140,40);
		b2.setLocation(500,240);
		b2.setFont(f);
		add(b2);
		
		b3=new JButton("Back");
		b3.setSize(64,20);
		b3.setLocation(0,0);
		add(b3);
		
		b1.addActionListener(n);
		b2.addActionListener(n);
		b3.addActionListener(n);
	}
}