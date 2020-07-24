import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class Register1 extends JPanel implements ActionListener
{
	JLabel l1,l2;
	JTextField tx1,tx2;
	JButton b1;
	Register1()
	{
		l1=new JLabel("Name");
		add(l1);
		tx1=new JTextField(10);
		add(tx1);
		
		l2=new JLabel("pass");
		add(l2);
		tx2=new JTextField(10);
		add(tx2);

		b1=new JButton("Register1");
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
			
			String q="insert into patil(Uname,Upass)values('"+s1+"','"+s2+"')";
		
			st.executeUpdate(q);
			con.close();
			
			JOptionPane.showMessageDialog(null,"data insert");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}