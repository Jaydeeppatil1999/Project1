import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class SRegister extends JPanel implements ActionListener,KeyListener
{
	JButton b1,b2;
	JLabel l,l1,l2,l3,l4;
	JTextField tx1,tx2,tx3;
	JPasswordField tx4;
	String blank="";
	SRegister(FDemo m)
	{
		setBackground(Color.gray);
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l=new JLabel("Student-Register-Page");
		l.setSize(310,44);
		l.setLocation(400,40);
		l.setFont(f);
		add(l);
		
		l1=new JLabel("Name");
		l1.setSize(100,33);
		//l1.setForeground(Color.white);
		l1.setFont(f);
		l1.setLocation(250,130);
		add(l1);
		
		tx1=new JTextField("Enter Name",10);
		tx1.setSize(230,30);
		tx1.setFont(f);
		tx1.setLocation(390,130);
		add(tx1);
		tx1.addKeyListener(this);
		tx1.setForeground(Color.gray);
		
		l2=new JLabel("Branch");
		l2.setSize(110,33);
		l2.setFont(f);
		l2.setLocation(250,190);
		add(l2);
		
		tx2=new JTextField("Enter Branch",10);
		tx2.setSize(230,30);
		tx2.setFont(f);
		tx2.setLocation(390,190);
		add(tx2);
		tx2.addKeyListener(this);
		tx2.setForeground(Color.gray);
		
		l3=new JLabel("Email");
		l3.setSize(110,33);
		l3.setFont(f);
		l3.setLocation(250,250);
		add(l3);
		
		tx3=new JTextField("Enter Email",10);
		tx3.setSize(230,30);
		tx3.setFont(f);
		tx3.setLocation(390,250);
		add(tx3);
		tx3.addKeyListener(this);
		tx3.setForeground(Color.gray);
		
		l4=new JLabel("Password");
		l4.setSize(230,33);
		l4.setFont(f);
		l4.setLocation(250,310);
		add(l4);
		
		tx4=new JPasswordField("Enter Password",10);
		tx4.setSize(230,30);
		tx4.setFont(f);
		tx4.setLocation(390,310);
		add(tx4);
		tx4.setEchoChar((char)0);
		tx4.addKeyListener(this);
		tx4.setForeground(Color.gray);
		
		b1=new JButton("Register");
		b1.setSize(110,40);
		b1.setFont(f);
		//b1.setBackground(Color.cyan);
		b1.setLocation(430,420);
		add(b1);
		
		b2=new JButton("Back");
		b2.setSize(64,20);
		b2.setLocation(0,0);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(m);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s5=""; 
		String s6=""; 
		
		String s1=tx1.getText();
		String s2=tx2.getText();
		String s3=tx3.getText();
		String s4=tx4.getText();
	
		if(s1.equals("Enter Name") && s2.equals("Enter Branch"));
			else
			{
				s5=s1;
				s6=s2;
			}
				
			if(s5.equals(blank) && s6.equals(blank))
					JOptionPane.showMessageDialog(null,"please enter data");
				else{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Examination?useSSL=false","root","root");
	
			Statement st=con.createStatement();
			
			String q="insert into SRegister(Uname,Ubranch,Uemail,Upass)values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
			
			st.executeUpdate(q);
			
			tx1.setText("");
			tx2.setText("");
			tx3.setText("");
			tx4.setText("");
			
			con.close();
			
			JOptionPane.showMessageDialog(null,"DATA INSERT");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
				}
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
				tx2.setText("Enter Branch");
				tx2.setForeground(Color.gray);
			}
		}
		if(tx3.isFocusOwner())
		{
			String s3=tx3.getText().trim();
			if(s3.equals(""))
			{
				tx3.setText("Enter Email");
				tx3.setForeground(Color.gray);
			}
		}
		if(tx4.isFocusOwner())
		{
			String s4=tx4.getText().trim();
			if(s4.equals(""))
			{
				tx4.setText("Enter Password");
				tx4.setForeground(Color.gray);
				tx4.setEchoChar((char)0);
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
			if(s2.equals("Enter Branch"))
			{
				tx2.setText("");
				tx2.setForeground(Color.gray);
			}
		}
		if(tx3.isFocusOwner())
		{
			String s3=tx3.getText();
			if(s3.equals("Enter Email"))
			{
				tx3.setText("");
				tx3.setForeground(Color.gray);
			}
		}
		if(tx4.isFocusOwner())
		{
			String s4=tx4.getText().trim();
			if(s4.equals("Enter Password"))
			{
				tx4.setText("");
				tx4.setForeground(Color.gray);
				tx4.setEchoChar('*');
			}
		}
	}
	public void keyTyped(KeyEvent e){}
}