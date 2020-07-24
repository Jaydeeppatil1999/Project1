import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Register2 extends JPanel implements ActionListener
{
	TextField tx1,tx2,tx3,tx4;
	JButton b1,b2;
	JLabel l1,l2,l3,l4;
	Register2(FDemo c)
	{
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l1=new JLabel("Name");
		l1.setSize(60,30);
		l1.setFont(f);
		l1.setLocation(30,70);
		add(l1);
		
		tx1=new TextField(10);
		tx1.setSize(150,30);
		tx1.setLocation(150,70);
		add(tx1);
		
		
		// l2=new JLabel("Branch");
		// l2.setSize(75,30);
		// l2.setFont(f);
		// l2.setLocation(30,120);
		// add(l2);
		
		// tx2=new TextField(10);
		// tx2.setSize(150,30);
		// tx2.setLocation(150,120);
		// add(tx2);
		
		// l3=new JLabel("E-mail");
		// l3.setSize(60,30);
		// l3.setFont(f);
		// l3.setLocation(30,170);
		// add(l3);
		
		// tx3=new TextField(10);
		// tx3.setSize(150,30);
		// tx3.setLocation(150,170);
		// add(tx3);
		
		l4=new JLabel("Password");
		l4.setSize(90,30);
		l4.setFont(f);
		l4.setLocation(30,120);
		add(l4);
		
		tx4=new TextField(10);
		tx4.setSize(150,30);
		tx4.setLocation(150,120);
		add(tx4);
		
		b1=new JButton("Submit");
		b1.setSize(80,40);
		b1.setLocation(80,300);
		add(b1);
		
		b2=new JButton("Cancel");
		b2.setSize(80,40);
		b2.setLocation(160,300);
		add(b2);
		
		b1.addActionListener(this);
		
		//setBackground(Color.white);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tx1.getText();
		String s2=tx4.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String db_url="jdbc:mysql://localhost:3306/jay?useSSL=false";
			String db_uname="root";
			String db_upass="root";

			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);

			Statement st=con.createStatement();

			String q="insert into jay(Uname,Upass)values('"+s1+"','"+s2+"')";
			st.executeUpdate(q);
			
			tx1.setText("");
			tx4.setText("");
			System.out.println("Data Insert");
			
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}