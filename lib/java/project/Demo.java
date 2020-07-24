import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FDemo extends JFrame implements ActionListener
{
	Container nc=getContentPane();
	CardLayout card;
	HDemo hd;
	Register1 rd;
	Login ld;
	MDemo md;
	FDemo()
	{
		card=new CardLayout();
		setLayout(card);
		
		hd=new HDemo(this);
		rd=new Register1();
		ld=new Login(this);
		md=new MDemo();
		
		add("home",hd);
		add("login",ld);
		add("regis",rd);
		add("menu",md);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==hd.b1)
		{
			card.show(nc,"login");
		}
		if(e.getSource()==hd.b2)
		{
			card.show(nc,"regis");
		}
		if(e.getSource()==ld.b1)
		{
			String s1=ld.tx1.getText();
			String s2=ld.tx2.getText();
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
														
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay?useSSl=false","root","root");
			
				Statement st=con.createStatement();
				
			
				//String q="Select * form patil where Uname='"+s1+"' AND Upass='"+s2+"'";
				
				String q="Select * from patil where Uname='"+s1+"' AND Upass='"+s2+"'";
				ResultSet rs=st.executeQuery(q);
				
				if(rs.next())
				{
					card.show(nc,"menu");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"INVALID");
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}
}
class Demo
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLocation(30,30);
	}
}
