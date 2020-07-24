import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Exam extends JPanel implements ActionListener
{
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2;
	Exam()
	{
		setLayout(null);
		
		t1=new JTextField();
		t1.setBounds(50,50,20,35);
		t1.setEditable(false);
		add(t1);
        t2=new JTextField();
		t2.setBounds(80,50,250,35);
		t2.setEditable(false);
		add(t2);
		
        t3=new JTextField();
		t3.setBounds(50,100,100,35);
		t3.setEditable(false);
		add(t3);
        t4=new JTextField();
		t4.setBounds(160,100,100,35);
		t4.setEditable(false);
		add(t4);
        t5=new JTextField();
		t5.setBounds(50,150,100,35);
		t5.setEditable(false);
		add(t5);
        t6=new JTextField();
		t6.setBounds(160,150,100,35);
		t6.setEditable(false);
		add(t6);
		
		b1=new JButton("Next");
		b1.setBounds(50,220,100,35);
		add(b1);
		b2=new JButton("Previous");
		b2.setBounds(160,220,100,35);
		add(b2);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		try
				{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/question?useSSL=false","root","root");
												
						Statement st=con1.createStatement();
						String q="Select * from Qno";								
						ResultSet rs=st.executeQuery(q);
						if(rs.next())
						{
							t1.setText(rs.getString(1));
							t2.setText(rs.getString(2));
							t3.setText(rs.getString(3));
							t4.setText(rs.getString(4));
							t5.setText(rs.getString(5));
							t6.setText(rs.getString(6));
						}
						con1.close();
					}
					catch(Exception e)
					{
						System.out.println(e);							
					}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/question?useSSL=false","root","root");							
				Statement st1=con1.createStatement();
				int x=Integer.parseInt(t1.getText());
				x++;
				String q1="Select * from Qno where qno='"+x+"' ";								
				ResultSet rs1=st1.executeQuery(q1);
				if(rs1.next())
				{
					t1.setText(rs1.getString(1));
					t2.setText(rs1.getString(2));
					t3.setText(rs1.getString(3));
					t4.setText(rs1.getString(4));
					t5.setText(rs1.getString(5));
					t6.setText(rs1.getString(6));
				}
				con1.close();
			}
			catch(Exception e2)
			{
				System.out.println(e2);							
			}
		}
		if(e.getSource()==b2)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/question?useSSL=false","root","root");							
				Statement st1=con1.createStatement();
				int x=Integer.parseInt(t1.getText());
				x--;
				String q1="Select * from Qno where qno='"+x+"' ";								
				ResultSet rs1=st1.executeQuery(q1);
				if(rs1.next())
				{
					t1.setText(rs1.getString(1));
					t2.setText(rs1.getString(2));
					t3.setText(rs1.getString(3));
					t4.setText(rs1.getString(4));
					t5.setText(rs1.getString(5));
					t6.setText(rs1.getString(6));
				}
				con1.close();
			}
			catch(Exception e2)
			{
				System.out.println(e2);							
			}
		}
	}
}
