import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.sql.*;
class AMenu extends JPanel //implements KeyListener
{
	JTabbedPane tb;
	CardLayout card; 
	Myaccount my;
	addQuestion aq;
	ARegister ar;
	DeleteeDemo de;
	LogoutDemo1 lg;
	//Student st;
	AMenu(FDemo f1)
	{  
		
		setLayout(new BorderLayout());
		tb=new JTabbedPane();
		aq=new addQuestion();
		ar=new ARegister();
		//st=new Student();
		de=new DeleteeDemo();
		my=new Myaccount();
		lg=new LogoutDemo1();
	
		tb.add("Add Question",aq);
		tb.add("Register",ar);
		tb.add("Delete",de);
		tb.add("My Account",my);
		tb.add("Logout",lg);
		//tb.add("Student",st);
		add(tb);
		lg.btn1.addActionListener(f1);
		//setBackground(Color.white);
	}
}


class addQuestion extends JPanel implements ActionListener
{
	JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2;
	String s[]={"Java","C","C++"};
	JComboBox cb1;
	int x;
	addQuestion()
	{
		setBackground(Color.gray);
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,22);
		setFont(f);
		
		l1=new JLabel("Exam Name");
		l1.setSize(150,30);
		l1.setLocation(160,80);
		l1.setFont(f);
		add(l1);
		
		cb1=new JComboBox(s);
		// cb1.addItem("java");
		// cb1.addItem("c");
		//cb1.setVisibleRowCount(3);
		add(new JScrollPane(cb1));
		cb1.setSize(130,30);
		cb1.setLocation(340,80);
		cb1.setFont(f);
		add(cb1);
		
		//tx1=new JTextField();
		// add(tx1);
		
		
		l2=new JLabel("Question Name");
		l2.setSize(180,30);
		l2.setLocation(160,130);
		l2.setFont(f);
		add(l2);
		
		tx2=new JTextField();
		tx2.setSize(430,30);
		tx2.setLocation(340,130);
		tx2.setFont(f);
		add(tx2);
		
		l3=new JLabel("Option1");
		l3.setSize(150,30);
		l3.setLocation(160,180);
		l3.setFont(f);
		add(l3);
		
		tx3=new JTextField();
		tx3.setSize(330,30);
		tx3.setLocation(340,180);
		tx3.setFont(f);
		add(tx3);
		
		l4=new JLabel("Option2");
		l4.setSize(150,30);
		l4.setLocation(160,230);
		l4.setFont(f);
		add(l4);
		
		tx4=new JTextField();
		tx4.setSize(330,30);
		tx4.setLocation(340,230);
		tx4.setFont(f);
		add(tx4);
		
		l5=new JLabel("Option3");
		l5.setSize(150,30);
		l5.setLocation(160,280);
		l5.setFont(f);
		add(l5);
		
		tx5=new JTextField();
		tx5.setSize(330,30);
		tx5.setLocation(340,280);
		tx5.setFont(f);
		add(tx5);
		
		l6=new JLabel("Option4");
		l6.setSize(150,30);
		l6.setLocation(160,330);
		l6.setFont(f);
		add(l6);
		
		tx6=new JTextField();
		tx6.setSize(330,30);
		tx6.setLocation(340,330);
		tx6.setFont(f);
		add(tx6);
		
		l7=new JLabel("Correct Ans");
		l7.setSize(150,30);
		l7.setLocation(160,380);
		l7.setFont(f);
		add(l7);
		
		tx7=new JTextField();
		tx7.setSize(330,30);
		tx7.setLocation(340,380);
		tx7.setFont(f);
		add(tx7);
		
		b1=new JButton("Save");
		b1.setSize(110,40);
		b1.setLocation(340,450);
		b1.setFont(f);
		add(b1);
		
		b2=new JButton("Reset");
		b2.setSize(110,40);
		b2.setLocation(500,450);
		b2.setFont(f);
		add(b2);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{    
		if(e.getSource()==b1)
		{    
			//String s1=tx1.getText();
			String s2=tx2.getText();
			String s3=tx3.getText();
			String s4=tx4.getText();
			String s5=tx5.getText();
			String s6=tx6.getText();
			String s7=tx7.getText();
            try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/question?useSSL=false","root","root");
			
				Statement st=con.createStatement();
			
				String q="select MAX(qno) from Qno";
				ResultSet rs=st.executeQuery(q);
				if(rs.next())
				{
					x=Integer.parseInt(rs.getString(1));
				}
				con.close();
				System.out.println(x);
		     	}
				catch(Exception e1)
				{
				System.out.println(e1);
				}
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/question?useSSL=false","root","root");
			
				Statement st=con.createStatement();
			    ++x;
				String q="insert into Qno values('"+(""+x)+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
				st.executeUpdate(q);
			
				con.close();
				
				JOptionPane.showMessageDialog(null,"DATA INSERT");
			}
			catch(Exception e1) 
			{
				System.out.println(e1);
			}
		}
	}
}

class ARegister extends JPanel implements ActionListener,KeyListener
{
	JButton b1,b2;
	JLabel l,l1,l2,l3,l4;
	JTextField tx1,tx2,tx3;
	JPasswordField tx4;
	String blank ="";
	ARegister()
	{
		setBackground(Color.gray);
		setLayout(null);
		//Font f=new Font("BOLD",Font.ITALIC,22);
		//setFont(f);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l=new JLabel("Admin-Register-Page");
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
		
		l2=new JLabel("Contact");
		l2.setSize(110,33);
		l2.setFont(f);
		l2.setLocation(250,190);
		add(l2);
		
		tx2=new JTextField("Enter Contact",10);
		tx2.setSize(230,30);
		tx2.setFont(f);
		tx2.setLocation(390,190);
		add(tx2);
		tx2.addKeyListener(this);
		tx2.setForeground(Color.gray);
		
		l3=new JLabel("E-mail");
		l3.setSize(110,33);
		l3.setFont(f);
		l3.setLocation(250,250);
		add(l3);
		
		tx3=new JTextField("Enter E-mail",10);
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
		
		// b2=new JButton("Back");
		// b2.setSize(64,20);
		// b2.setLocation(0,0);
		// add(b2);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String s5="";
		String s6="";
		String s1=tx1.getText();
		String s2=tx2.getText();
		String s3=tx3.getText();
		String s4=tx4.getText();
			
			if(s1.equals("Enter Name") && s2.equals("Enter Contact"));
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
				String q="insert into ARegister(Name,Contact,Email,Password)values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
				st.executeUpdate(q);
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
				tx2.setText("Enter Contact");
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
			if(s2.equals("Enter Contact"))
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
class DeleteeDemo extends JPanel
{
	DeleteeDemo()
	{
		
	}
}
class Myaccount extends JPanel implements KeyListener
{
	JTextField tx1,tx2,tx3;
	JButton b1;
	JPasswordField tx4;
	JLabel l,l1,l2,l3,l4;
	Myaccount()
	{
		setBackground(Color.gray);
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l=new JLabel("My Profile");
		l.setSize(310,44);
		l.setLocation(410,40);
		l.setFont(f);
		add(l);
		
		l1=new JLabel("Name");
		l1.setSize(100,33);
		//l1.setForeground(Color.white);
		l1.setFont(f);
		l1.setLocation(250,130);
		add(l1);
		
		tx1=new JTextField("Enter Name");
		tx1.setSize(230,30);
		tx1.setFont(f);
		tx1.setLocation(390,130);
		add(tx1);
		tx1.addKeyListener(this);
		tx1.setForeground(Color.gray);
		
		l2=new JLabel("Contact");
		l2.setSize(110,33);
		l2.setFont(f);
		l2.setLocation(250,190);
		add(l2);
		
		tx2=new JTextField("Enter Contact",10);
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
		
		b1=new JButton("Save");
		b1.setSize(110,40);
		b1.setFont(f);
		//b1.setBackground(Color.cyan);
		b1.setLocation(430,420);
		add(b1);
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
				tx2.setText("Enter Contact");
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
			if(s2.equals("Enter Contact"))
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

// class DeleteeDemo extends JPanel
// {
	// DeleteeDemo()
	// {
		
	// }
// }

class LogoutDemo1 extends JPanel //implements ActionListener
{
	JButton btn1;
	LogoutDemo1()
	{
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		btn1=new JButton("Logout");
		btn1.setSize(110,40);
		btn1.setLocation(340,250);
		btn1.setFont(f);
		add(btn1);

	}
}