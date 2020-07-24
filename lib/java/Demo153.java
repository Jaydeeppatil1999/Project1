import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class FDemo extends JFrame implements ActionListener
{
	JTextField tx1,tx2,tx3,tx4;
	JButton b1;
	FDemo()
	{
		setLayout(null);
		
		
		b1=new JButton("Search");
		b1.setSize(80,35);
		b1.setLocation(150,40);
		add(b1);
		
		tx1=new JTextField(10);
		tx1.setSize(80,35);
		tx1.setLocation(70,40);
		add(tx1);
		
		tx2=new JTextField(10);
		tx2.setSize(80,35);
		tx2.setLocation(140,80);
		add(tx2);
		
		tx3=new JTextField(10);
		tx3.setSize(80,35);
		tx3.setLocation(210,80);
		add(tx3);
		
		tx4=new JTextField(10);
		tx4.setSize(80,35);
		tx4.setLocation(280,80);
		add(tx4);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tx1.getText();
		
		String s2=tx2.getText();
		String s3=tx3.getText();
		String s4=tx4.getText();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Examination?useSSL=false","root","root");
			Statement st=con.createStatement();
			String q="Select * from SRegister where Uname='"+s1+"'";
			ResultSet rs=st.executeQuery(q);
			
			while(rs.next())
			{
				s2=rs.getString(2);
				s3=rs.getString(3);
				s4=rs.getString(4);
			}
			
			tx2.setText(""+s2);
			tx3.setText(""+s3);
			tx4.setText(""+s4);
			
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}
class Demo153
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(30,30);
	}
}