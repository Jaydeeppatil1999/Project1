import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Loginbit extends JPanel// implements ActionListener
{
	JLabel l1,l2;
	JTextField tx1;
	JPasswordField tx2;
	JButton b1,b3;
	CardLayout card;
	MenuDemo m;
	Loginbit(FDemo m)
	{
		
		setLayout(null);
		Font f=new Font("",Font.ITALIC,23);
		setFont(f);
		// m=new MenuDemo();
		// add();
		l1=new JLabel("Name");
		l1.setSize(60,30);
		l1.setFont(f);
		l1.setLocation(50,90);
		add(l1);
		
		tx1=new JTextField(10);
		tx1.setSize(150,30);
		tx1.setLocation(130,90);
		add(tx1);
		
		l2=new JLabel("pass");
		l2.setSize(75,30);
		l2.setFont(f);
		l2.setLocation(50,140);
		add(l2);
		
		tx2=new JPasswordField(10);
		tx2.setSize(150,30);
		tx2.setLocation(130,140);
		add(tx2);
		
		b3=new JButton("Login");
		b3.setSize(70,40);
		b3.setLocation(165,260);
		add(b3);
		
		b3.addActionListener(m);		
		
		//setBackground(Color.cyan);
	}
	//public void actionPerformed(ActionEvent e)
	// {
		// class.forName("com.mysql.jdbc.Driver");
		
		// Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","root");
		
		// Statement st=con.createStatement();
		
		// String q="insert into jay(Uname,Upass)values('aa','11')";
		
		// st.executeUpdate(q);
		
		// System.out.println("Data Insert");
		// con.close();
		// public void actionPerformed(ActionEvent e)
	// {
		
		// String s1=tx1.getText();
		// String s2=tx2.getText();
		
		// if(s1.equals("abc") && s2.equals("123"))
		// {
			// card.show(m,"D");
		// }
		// else
		// {
			// JOptionPane.showMessageDialog(null,"Invalid Message");
		// }
	// }
	//}
	
}
