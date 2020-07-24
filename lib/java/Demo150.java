import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class FDemo extends JFrame// implements ActionListener
{
	JTextField tx1,tx2;
	JButton b1;
	Toolkit t;
	FDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		tx1=new JTextField(15);
		add(tx1);
		
		tx2=new JTextField(15);
		add(tx2);
		
		b1=new JButton("Insert");
		add(b1);
		
		b1.addActionListener(this);
	}
	// public void paint(Graphics g)
	// {
		// t=Toolkit.getDefaultToolkit();
		// Image i=t.getImage("jay1.jpg");
		// g.drawImage(i,100,100,this);
	// }
	// public void paintComponent(Graphics g)
	// {	
		// i =new ImageIcon();
		// Image im=i.getImage("jay1.jpg");
		// g.drawImage(im,333,500,this);		
		// //setBackground(Color.cyan);
	
	// }
	public void actionPerformed(ActionEvent e)
	{
		String s1=tx1.getText();
		String s2=tx2.getText();
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
			tx2.setText("");
			System.out.println("Data Insert");
			
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
} 
class Demo150
{
	public static void main(String ar[])
	{
		FDemo f= new FDemo();
		f.setVisible(true);
		f.setSize(400,500);
		f.setLocation(100,10);
		
	}
}