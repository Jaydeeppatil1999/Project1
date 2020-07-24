import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
class FDemo extends JFrame implements ActionListener
{
	Container cn=getContentPane();
	CardLayout card;
	LoginDemo ld;
	RegisDemo rd;
	HomeDemo hd;
	MenuDemoo md;
	FDemo()
	{
		
		
		card=new CardLayout();
		setLayout(card);
		
		hd=new HomeDemo(this);
		rd=new RegisDemo(this);
		ld=new LoginDemo(this);
		md=new MenuDemoo();
		
		add("home",hd);
		add("regis",rd);
		add("login",ld);
		add("menu",md);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==hd.b1)
		{
			card.show(cn,"login");
		}
		if(e.getSource()==hd.b2)
		{
			card.show(cn,"regis");
		}
		if(e.getSource()==ld.b1)
		{
			//String x=" ";
			
			String s1=ld.tx1.getText();
			String s2=ld.tx2.getText();
			// if(s1==x)
			// {
				// JOptionPane.showMessageDialog(null,"plz DATA INSERT");
			// }
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay?useSSl=false","root","root");
				
				Statement st=con.createStatement();
				
				String q="Select * from login where Uname='"+s1+"' AND Upass='"+s2+"'";
				
				ResultSet rs=st.executeQuery(q);
				if(rs.next())
				{
					card.show(cn,"menu");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid");
				}
				ld.tx1.setText("");
				ld.tx2.setText("");
				
				con.close();
			}
 			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
			if(e.getSource()==ld.b2)
			{
				card.show(cn,"home");
			}
			if(e.getSource()==rd.b3)
			{
				card.show(cn,"home");
			}
	}
}
class Demo152
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(540,385);
		f.setLocation(60,50);
		// f.setBackground(Color.white);
		// f.setForeground(Color.white);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}