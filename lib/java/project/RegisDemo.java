import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
class RegisDemo extends JPanel implements ActionListener
{
	
	JTextField tx1,tx2,tx3;
	JButton b1,b2,b3;
	JPasswordField tx4;
	JLabel l1,l2,l3,l4;
	ImageIcon img2;
	Image im;
	RegisDemo(FDemo c)
	{
		
		setLayout(null);
		//Font f=new Font("BOLD",Font.ITALIC,22);
		//setFont(f);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		img2=new ImageIcon("jay5.jpg");
		im=img2.getImage();
		
		l1=new JLabel("Name");
		l1.setSize(70,30);
		//l1.setForeground(Color.white);
		l1.setFont(f);
		l1.setLocation(40,55);
		add(l1);
		
		tx1=new JTextField(10);
		tx1.setSize(170,30);
		tx1.setFont(f);
		tx1.setLocation(160,55);
		add(tx1);
		
		l2=new JLabel("Branch");
		l2.setSize(75,30);
		l2.setFont(f);
		l2.setLocation(40,105);
		add(l2);
		
		tx2=new JTextField(10);
		tx2.setSize(170,30);
		tx2.setFont(f);
		tx2.setLocation(160,105);
		add(tx2);
		
		l3=new JLabel("E-mail");
		l3.setSize(70,30);
		l3.setFont(f);
		l3.setLocation(40,155);
		add(l3);
		
		tx3=new JTextField(10);
		tx3.setSize(170,30);
		tx3.setFont(f);
		tx3.setLocation(160,155);
		add(tx3);
		
		l4=new JLabel("Password");
		l4.setSize(110,30);
		l4.setFont(f);
		l4.setLocation(40,205);
		add(l4);
		
		tx4=new JPasswordField(10);
		tx4.setSize(170,30);
		tx4.setFont(f);
		tx4.setLocation(160,210);
		add(tx4);
		
		b1=new JButton("Register");
		b1.setSize(110,40);
		b1.setFont(f);
		//b1.setBackground(Color.cyan);
		b1.setLocation(60,280);
		add(b1);
		
		b2=new JButton("Cancel");
		b2.setSize(100,40);
		b2.setFont(f);
		//b2.setBackground(Color.cyan);
		b2.setLocation(200,280);
		add(b2);
		
		b3=new JButton("Back");
		b3.setSize(64,20);
		//b2.setFont(f1);
		b3.setLocation(0,0);
		add(b3);
		
		b1.addActionListener(this);
		b3.addActionListener(c);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(im,0,0,540,359,this);
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
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay?useSSL=false","root","root");
			
			Statement st=con.createStatement();
			
			String q="insert into login(Uname,Ubranch,Uemail,Upass)values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
			
			st.executeUpdate(q);
			
			tx1.setText("");//form fill hone k bad automatic clear ho jata he
			tx2.setText("");
			tx3.setText("");
			tx4.setText("");
			
			con.close();
			
			JOptionPane.showMessageDialog(null,"DATA INSERT");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}