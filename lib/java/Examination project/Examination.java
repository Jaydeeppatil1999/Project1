import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	static Container c;
	static CardLayout card;
	HomeDemo hd;
	Admin ad;
	Student st;
	ALogin al;
	SLogin sl;
	SRegister sr;
	Exam sm;
	AMenu am;
	String blank="";
	FDemo()
	{
		c=getContentPane();
		card=new CardLayout();
		setLayout(card);
	
		hd=new HomeDemo(this);
		ad=new Admin(this);
		st=new Student(this);
		al=new ALogin(this);
		sl=new SLogin(this);
		sr=new SRegister(this);
		sm=new Exam();
		am=new AMenu(this);
		
		add("home",hd);
		add("admin",ad);
		add("student",st);
		add("ALogin",al);
		add("SLogin",sl);
		add("sRegister",sr);
		add("exam",sm);
		add("amenu",am);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==am.lg.btn1)
		{
			
			card.show(c,"home");
		}
		if(e.getSource()==hd.b1)
		{
			card.show(c,"admin");
		}
		if(e.getSource()==hd.b2)
		{
			card.show(c,"student");
		}
		if(e.getSource()==ad.b1)
		{
			card.show(c,"ALogin");
		}
		if(e.getSource()==al.b1)
		{
			String s1="";
			String s2="";
			String s3=al.tx1.getText();
			String s4=al.tx2.getText();
			if(s3.equals("Enter Name") && s4.equals("Enter Password"));
			else
			{
				s1=s3;
				s2=s4;
			}
				
			if(s1.equals(blank) && s2.equals(blank))
					JOptionPane.showMessageDialog(null,"please enter data");
				else{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Examination?useSSL=false","root","root");
				Statement st=con.createStatement();
				String q="Select * from ARegister where Name='"+s1+"' AND Password='"+s2+"'";
				ResultSet rs=st.executeQuery(q);
				if(rs.next())
				{
						card.show(c,"amenu");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid");
				}
				al.tx1.setText("");
				al.tx2.setText("");
				
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
				}
		}
		if(e.getSource()==al.b2)
		{
			card.show(c,"admin");
		}
		
			// if(e.getSource()==ar.b2)
		// {
			// card.show(c,"ALogin");
		// }
		if(e.getSource()==ad.b2)
		{
			card.show(c,"aRegister");
		}
		if(e.getSource()==st.b1)
		{
			card.show(c,"SLogin");
		}
		if(e.getSource()==sl.b1)
		{
			String s5="";
			String s6="";
			
			String s1=sl.tx1.getText();
			String s2=sl.tx2.getText();
			if(s1.equals("Enter Name") && s2.equals("Enter Password"));
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
							
							String q="Select * from SRegister where Uname ='"+s1+"' AND Upass ='"+s2+"'";
							
							ResultSet rs=st.executeQuery(q);
				
							if(rs.next())
							{
								card.show(c,"exam");
								con.close();
									
							}	
							
							else
							{
								JOptionPane.showMessageDialog(null,"invalid");
							}
							sl.tx1.setText("");
							sl.tx2.setText("");
							
						}
						catch(Exception e1)
						{
							System.out.println(e1);
						}
					}
			}
		if(e.getSource()==sl.b2)
		{
			card.show(c,"student");
		}
		if(e.getSource()==st.b2)
		{
			card.show(c,"sRegister");
		}
		if(e.getSource()==sr.b2)
		{
			card.show(c,"SLogin");
		}
		
		// if(e.getSource()==am.lg.btn1)
		// {	
			// card.show(c,"home");
		// }
		// if(e.getSource()==st.sl.sm.b6)
		// {	
			// card.show(c,"home");
		// }
		if(e.getSource()==ad.b3)
		{
			card.show(c,"home");
		}
		if(e.getSource()==st.b3)
		{
			card.show(c,"home");
		}
	}
}
class Examination 
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(1100,650);
		f.setLocation(80,30);
		f.setResizable(false);
		
	}
}