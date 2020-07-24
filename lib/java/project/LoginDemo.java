import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginDemo extends JPanel implements KeyListener
{
	JLabel l1,l2;
	JTextField tx1;
	JPasswordField tx2;
	JButton b1,b2;
	ImageIcon img1;
	Image abhi;
	LoginDemo(FDemo m)
	{
		
		
		setLayout(null);
		Font f1=new Font("BOLD",Font.ITALIC,19);
		setFont(f1);
		img1=new ImageIcon("jay8.jpg");
		abhi=img1.getImage();

		l1=new JLabel("Name");
		l1.setSize(80,30);
		l1.setFont(f1);
		l1.setForeground(Color.white);
		l1.setLocation(110,90);
		add(l1);
		
		tx1=new JTextField();
		tx1.setSize(170,30);
		tx1.setFont(f1);
		tx1.setLocation(245,90);
		add(tx1);
		tx1.addKeyListener(this);
		tx1.setForeground(Color.gray);
		
		l2=new JLabel("Password");
		l2.setSize(120,30);
		l2.setFont(f1);
		l2.setForeground(Color.white);
		l2.setLocation(110,155);
		add(l2);
		
		tx2=new JPasswordField();
		tx2.setSize(170,30);
		tx2.setFont(f1);
		tx2.setLocation(245,155);
		add(tx2);
		tx2.addKeyListener(this);
		tx2.setForeground(Color.gray);
		
		b1=new JButton("Login");
		b1.setSize(90,35);
		b1.setFont(f1);
		b1.setLocation(240,250);
		add(b1);
		
		b2=new JButton("Back");
		b2.setSize(64,20);
		//b2.setFont(f1);
		b2.setLocation(0,0);
		add(b2);
		
		b1.addActionListener(m);		
		b2.addActionListener(m);
		// setBackground(Color.cyan);
	}
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		g.drawImage(abhi,0,0,540,358,this);		
		
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
				tx1.setText("");
				tx1.setForeground(Color.black);
			}
		}
		if(tx2.isFocusOwner())
		{
			String s1=tx2.getText();
			if(s1.equals("Enter Password"))
			{
				tx2.setText("");
				tx2.setForeground(Color.black);
			}
		}
	}
	public void keyTyped(KeyEvent e){}
}