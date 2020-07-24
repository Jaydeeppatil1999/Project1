import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ALogin extends JPanel implements KeyListener
{
	JButton b1,b2;
	JLabel l,l1,l2;
	JTextField tx1;
	JPasswordField tx2;
	ALogin(FDemo a)
	{
		setBackground(Color.gray);
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,22);
		setFont(f);
		
		l=new JLabel("Admin-Login-Page");
		l.setSize(310,44);
		l.setLocation(400,70);
		l.setFont(f);
		add(l);
		
		l1=new JLabel("Name");
		l1.setSize(100,33);
		l1.setLocation(240,160);
		l1.setFont(f);
		add(l1);
		
		tx1=new JTextField("Enter Name",10);
		tx1.setSize(230,30);
		tx1.setLocation(390,160);
		tx1.setFont(f);
		add(tx1);
		tx1.addKeyListener(this);
		tx1.setForeground(Color.gray);

		l2=new JLabel("Password");
		l2.setSize(150,33);
		l2.setLocation(240,235);
		l2.setFont(f);
		add(l2);
		
		tx2=new JPasswordField("Enter Password",10);
		tx2.setSize(230,30);
		tx2.setLocation(390,235);
		tx2.setFont(f);
		add(tx2);
		tx2.setEchoChar((char)0);
		tx2.addKeyListener(this);
		tx2.setForeground(Color.gray);
		
		b1=new JButton("Login");
		b1.setSize(120,40);
		b1.setLocation(410,330);
		b1.setFont(f);
		add(b1);
		
		b2=new JButton("Back");
		b2.setSize(64,20);
		b2.setLocation(0,0);
		add(b2);
	
		b1.addActionListener(a);
		b2.addActionListener(a);
	}
	public void keyReleased(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
			String s1=tx1.getText().trim();
			if(s1.equals(""))
			{
				tx1.setText("Enter Name");
				tx1.setForeground(Color.gray);
			}
		}
		if(tx2.isFocusOwner())
		{
			String s2=tx2.getText().trim();
			if(s2.equals(""))
			{
				tx2.setText("Enter Password");
				tx2.setForeground(Color.gray);
				tx2.setEchoChar((char)0);
			}
		}
	}
	public void keyPressed(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
			String s1=tx1.getText();
			if(s1.equals("Enter Name"))
			{
				tx1.setForeground(Color.gray);
				tx1.setText("");
			}
		}
		if(tx2.isFocusOwner())
		{
			String s2=tx2.getText();
			if(s2.equals("Enter Password"))
			{
				tx2.setText("");
				tx2.setForeground(Color.gray);
				tx2.setEchoChar('*');
			}
		}
	}
	public void keyTyped(KeyEvent e){}
}