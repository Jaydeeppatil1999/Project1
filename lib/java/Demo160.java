import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
	JTextField tx1;
	JTextField tx2,tx3,tx4,tx5;
	FDemo()
	{
		setLayout(null);
		b1=new JButton("Search");
		b1.setSize(80,35);
		b1.setLocation(160,50);
		add(b1);
	
		b2=new JButton("Ubrnach");
		b2.setSize(100,30);
		b2.setLocation(40,150);
		add(b2);
        
		b3=new JButton("Uemail");
		b3.setSize(100,30);
		b3.setLocation(140,150);
		add(b3);
        
		b4=new JButton("Upassword");
		b4.setSize(110,30);
		b4.setLocation(240,150);
		add(b4);
		
		tx1=new JTextField(10);
		tx1.setSize(100,30);
		tx1.setLocation(40,50);
		add(tx1);
        
		tx2=new JTextField(10);
		tx2.setSize(100,30);
		tx2.setLocation(40,190);
		add(tx2);
        
		tx3=new JTextField(10);
		tx3.setSize(100,30);
		tx3.setLocation(140,190);
		add(tx3);
        
		tx4=new JTextField(10);
		tx4.setSize(110,30);
		tx4.setLocation(240,190);
		add(tx4);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		// if(e.getSource()==b1)
		// {
		String s2=tx2.getText();
		String s3=tx3.getText();
		String s4=tx4.getText();
		
		String s1=tx1.getText();
	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/Examination?useSSL=false","root","root");

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
class Demo160
{
	public  static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,400);
		f.setLocation(30,30);
		
	}
}