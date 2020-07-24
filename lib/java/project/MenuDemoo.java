import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuDemoo extends JPanel
{
	JTabbedPane tb;
	InsDemo ins;
	SearchDemo src;
	UpdateDemo up;
	ShowallDemo sw;
	DeleteeDemo de;
	//LogoutDemo lg;
	MenuDemoo()
	{ 
		setLayout(new BorderLayout());
		tb=new JTabbedPane();
		ins=new InsDemo();
		src=new SearchDemo();
		up=new UpdateDemo();
		sw=new ShowallDemo();
		de=new DeleteeDemo();
		//lg=new LogoutDemo();
	
		tb.add("Insret",ins);
		tb.add("Search",src);
		tb.add("Update",up);
		tb.add("Show all",sw);
		tb.add("Delete",de);
		//tb.add("Logout",lg);
		add(tb);
		
		//setBackground(Color.white);
	}
}

class InsDemo extends JPanel
{
	TextField tx1,tx2,tx3,tx4;
	JButton b1;
	JLabel l1,l2,l3,l4;
	InsDemo()
	{
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l1=new JLabel("Name");
		l1.setSize(70,30);
		l1.setFont(f);
		l1.setLocation(40,60);
		add(l1);
		
		tx1=new TextField(10);
		tx1.setSize(140,30);
		tx1.setLocation(140,60);
		add(tx1);
		
		l2=new JLabel("Branch");
		l2.setSize(75,30);
		l2.setFont(f);
		l2.setLocation(40,110);
		add(l2);
		
		tx2=new TextField(10);
		tx2.setSize(140,30);
		tx2.setLocation(140,110);
		add(tx2);
		
		l3=new JLabel("E-mail");
		l3.setSize(60,30);
		l3.setFont(f);
		l3.setLocation(40,160);
		add(l3);
		
		tx3=new TextField(10);
		tx3.setSize(140,30);
		tx3.setLocation(140,160);
		add(tx3);
		
		l4=new JLabel("Password");
		l4.setSize(90,30);
		l4.setFont(f);
		l4.setLocation(40,210);
		add(l4);
		
		tx4=new TextField(10);
		tx4.setSize(140,30);
		tx4.setLocation(140,210);
		add(tx4);
		
		b1=new JButton("Insert");
		b1.setSize(100,30);
		b1.setFont(f);
		b1.setLocation(160,280);
		add(b1);
	}
}

class SearchDemo extends JPanel
{
	JButton b1;
	JTextField t1;
	SearchDemo()
	{
		t1=new JTextField(10);
		add(t1);
		
		b1=new JButton("Search");
		add(b1);
		
		// JButton b1=new JButton("Insret");
		// add(b1);
	}
}
class UpdateDemo extends JPanel
{
	TextField tx1,tx2,tx3,tx4;
	JButton b1;
	JLabel l1,l2,l3,l4;
	UpdateDemo()
	{
		
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l1=new JLabel("Name");
		l1.setSize(60,30);
		l1.setFont(f);
		l1.setLocation(70,60);
		add(l1);
		
		tx1=new TextField(10);
		tx1.setSize(150,30);
		tx1.setLocation(180,60);
		add(tx1);
		
		l2=new JLabel("Branch");
		l2.setSize(75,30);
		l2.setFont(f);
		l2.setLocation(70,110);
		add(l2);
		
		tx2=new TextField(10);
		tx2.setSize(150,30);
		tx2.setLocation(180,110);
		add(tx2);
		
		l3=new JLabel("E-mail");
		l3.setSize(60,30);
		l3.setFont(f);
		l3.setLocation(70,160);
		add(l3);
		
		tx3=new TextField(10);
		tx3.setSize(150,30);
		tx3.setLocation(180,160);
		add(tx3);
		
		l4=new JLabel("Password");
		l4.setSize(90,30);
		l4.setFont(f);
		l4.setLocation(70,210);
		add(l4);
		
		tx4=new TextField(10);
		tx4.setSize(150,30);
		tx4.setLocation(180,210);
		add(tx4);
		
		b1=new JButton("Update");
		b1.setSize(110,40);
		b1.setFont(f);
		b1.setLocation(210,280);
		add(b1);
	}
}

class ShowallDemo extends JPanel
{
	JButton b1;
	JTextField t1;
	ShowallDemo()
	{
		t1=new JTextField(10);
		add(t1);
		
		b1=new JButton("Show all");
		add(b1);
		
		// JButton b1=new JButton("Insret");
		// add(b1);
	}
}

class DeleteeDemo extends JPanel
{
	DeleteeDemo()
	{
		
	}
}

// class LogoutDemo extends JPanel
// {
	// LogoutDemo()
	// {
		// JTextField t1=new JTextField(10);
		// add(t1);
		
		// JLabel l1=new JLabel("Name");
		// add(l1);
		
		// b1=new JButton("");
		// add(b1);
	// }
// }