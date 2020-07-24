import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener
{
	Container c=getContentPane();
	CardLayout card;
	HomeDemo2 hdd;
	Login2 ld;
	Register rr;
	MyDemo menu;
	FDemo()
	{
		card=new CardLayout();
		setLayout(card);
		
		hdd=new HomeDemo2(this);
		ld=new Login2(this);
		rr=new Register();
		menu=new MyDemo();
		add("home",hdd);
		add("login",ld);
		add("regis",rr);
		add("Menu",menu);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==hdd.b1)
		{
			card.show(c,"login");
		}
		if(e.getSource()==hdd.b2)
		{
			card.show(c,"regis");
		}
		if(e.getSource()==ld.b1)
		{
			String s1=ld.tx1.getText();
			String s2=ld.tx2.getText();
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay?useSSL=false","root","root");
				
				Statement st=con.createStatement();
				
				String q="Select * from patil where Uname='"+s1+"' AND Upass='"+s2+"'";
				
				ResultSet rs=st.executeQuery(q);
				
				if(rs.next())
				{
					card.show(c,"Menu");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid");
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
class Demojay
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(50,50);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	
		
	}
}