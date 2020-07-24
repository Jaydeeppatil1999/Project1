import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FDemo extends JFrame implements KeyListener
{
	JTextField tx1;
	JPasswordField tx2;
	FDemo()
	{
		Font f = new Font("Arial Black",Font.ITALIC,20);
		setLayout(null);
		setFont(f);
		
		JLabel n1 = new JLabel("Enter Name");
		n1.setFont(f);
		n1.setSize(300,30);
		n1.setLocation(30,60);
		add(n1);
		
		tx1= new JTextField("Enter Name",10);
		tx1.setFont(f);
		tx1.setSize(230,30);
		tx1.setLocation(200,60);
		tx1.setFont(f);
		add(tx1);
		
		tx1.addKeyListener(this);
		tx1.setForeground(Color.gray);
		
		JLabel n2 = new JLabel("Enter Pass");
		n2.setSize(300,30);
		n2.setLocation(30,120);
		n2.setFont(f);
		add(n2);
		
		tx2=  new JPasswordField("Enter Password",10);
		tx2.setFont(f);
		tx2.setSize(230,30);
		tx2.setLocation(200,120);
		tx2.setEchoChar((char)0);
		add(tx2);
		
		tx2.addKeyListener(this);
		tx2.setForeground(Color.gray);
		
		JButton b1 = new JButton("Login");
		b1.setFont(f);
		b1.setSize(130,35);
		b1.setLocation(200,210);
		add(b1);
		
		setResizable(false);
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
			String s1=tx2.getText().trim();
			if(s1.equals(""))
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
				tx1.setForeground(Color.pink);
				tx1.setText("");
			}
		}
		if(tx2.isFocusOwner())
		{
			String s1=tx2.getText();
			if(s1.equals("Enter Password"))
			{
				tx2.setForeground(Color.pink);
				tx2.setText("");
				tx2.setEchoChar('*');
			}
		}
	}
	public void keyTyped(KeyEvent e){}
}
class  placeholderlp
{
	public static void main(String args[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(350,150);
		f.setBackground(Color.red);
		f.setForeground(Color.white);
	}
}