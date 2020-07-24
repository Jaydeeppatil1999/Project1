import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.*;
class FDemo extends JFrame
{
	JTable table;
	DefaultTableModel model;
	FDemo()
	{
		model=new DefaultTableModel(0,2);
		table=new JTable(model);
		
		String [] header={"Uname","Ubranch"};
		model.setColumnIdentifiers(header);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/question?useSSL=false","root","root");
			
			String q="Select * from patil";
			
			Statement st=con.createStatement();
			
			
			ResultSet rs= st.executeQuery(q);
			
			while(rs.next())
			{
				String s1=rs.getString(1);
				String s2=rs.getString(2);
			
				model.addRow(new Object[]{s1,s2});
			}
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}
class Demo152
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLocation(20,20);
	}
}