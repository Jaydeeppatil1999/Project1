//1. import package
import java.sql.*;
class Demo148
{
	public static void main(String ar[])
	{
		try
		{
			//2. load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//3. opening database connection to mysql server
			String db_url="jdbc:mysql://localhost:3306/jay";
			//?useSSl=false";
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
			//4. getting Statement object to exceute query
			Statement st=con.createStatement();
			
			//5. executing query
			String q="insert into jay(uname,upass)values('swt','258')";
			st.executeUpdate(q);
			
			System.out.println("Data Insert");
			
			//6. connection close
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}