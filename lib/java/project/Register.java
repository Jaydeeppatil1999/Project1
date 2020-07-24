 import java.sql.*;
import javax .swing.*;
import java.awt.event.*;
class Register extends JPanel implements ActionListener
{
	JButton b1;
	JTextField tx1,tx2;
	JLabel l1,l2;
	Register()
	{
		l1=new JLabel("Name");
		add(l1);
		tx1=new JTextField(10);
		add(tx1);
		
		l2=new JLabel("Pass");
		add(l2);
		tx2=new JTextField(10);
		add(tx2);
		
		b1=new JButton("register");
		add(b1);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tx1.getText();
		String s2=tx2.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay?useSSL=false","root","root");
			
			Statement st=con.createStatement();
			
			//String q="insert into login(Uname,Upass)values('"+s1+"','"+s2+"')";
			String q="insert into patil(Uname,Upass)values('"+s1+"','"+s2+"')";
			
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