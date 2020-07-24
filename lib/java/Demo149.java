import java.util.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel l,l1,l2,l3;
	JTextField tx1,tx2,tx3;
	//JPasswordField tx2;
	FDemo()
	{
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,22);
		setFont(f);
		
		l=new JLabel("Admin-Page");
		l.setSize(310,44);
		l.setLocation(400,70);
		l.setFont(f);
		add(l);
		
		l1=new JLabel("Question");
		l1.setSize(100,33);
		l1.setLocation(240,160);
		l1.setFont(f);
		add(l1);
		
		tx1=new JTextField();
		tx1.setSize(330,30);
		tx1.setLocation(390,160);
		tx1.setFont(f);
		add(tx1);
		

		l2=new JLabel("Ques1");
		l2.setSize(150,33);
		l2.setLocation(240,235);
		l2.setFont(f);
		add(l2);
		
		tx2=new JTextField();
		tx2.setSize(230,30);
		tx2.setLocation(390,235);
		tx2.setFont(f);
		add(tx2);
		
		l3=new JLabel("Ques2");
		l3.setSize(150,33);
		l3.setLocation(240,310);
		l3.setFont(f);
		add(l3);
		
		tx3=new JTextField();
		tx3.setSize(230,30);
		tx3.setLocation(390,310);
		tx3.setFont(f);
		add(tx3);
		
		b1=new JButton("Insert");
		b1.setSize(120,40);
		b1.setLocation(410,380);
		b1.setFont(f);
		add(b1);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			String s1=tx1.getText();
			String s2=tx2.getText();
			String s3=tx3.getText();

			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay?useSSL=false","root","root");
			
				Statement st=con.createStatement();
			
				String q="insert into raja(Question,Option1,Option2)values('"+s1+"','"+s2+"','"+s3+"')";
				st.executeUpdate(q);
			
				System.out.println("Question insert...");
			
				con.close();
			}
			catch(Exception e1) 
			{
				System.out.println(e1);
			}
		}
	}
}

class Demo149
{
	// public static void main(String ar[])throws IOException
	// {
		// //Scanner sc=new Scanner(System.in);
		// InputStreamReader i=new InputStreamReader(System.in);
		// BufferedReader br=new BufferedReader(i);
		
		
		// System.out.println("Enter Question");
		// String s1=br.readLine();
		
		// System.out.println("Option1");
		// String s2=br.readLine();
		
		// System.out.println("Option2");
		// String s3=br.readLine();
		
		// // System.out.println("Enter pass");
		// // String s2=sc.next();
		
		// // System.out.println("Enter Name");
		// // String s1=sc.next();
		
		// // System.out.println("Enter pass");
		// // String s2=sc.next();
	
		// try
		// {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			
			// String db_url="jdbc:mysql://localhost:3306/jay?useSSL=false";
			// String db_uname="root";
			// String db_upass="root";
			
			// Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
			// Statement st=con.createStatement();
			
			// String q="insert into raja(Question,Option1,Option2)values('"+s1+"','"+s2+"','"+s3+"')";
			// st.executeUpdate(q);
			
			// System.out.println("Question insert...");
			
			// con.close();
		// }
		// catch(Exception e) 
		// {
			// System.out.println(e);
		// }
	//}
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(900,900);
		f.setLocation(30,30);
	}
}