import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyDemo extends JPanel
{
	JTabbedPane tb;
	Insert i;
	Search s;
	MyDemo()
	{
		setLayout(new BorderLayout());
		
		tb=new JTabbedPane();
		i=new Insert();
		s=new Search();
		
		tb.add("Insert",i);
		tb.add("Search",s);
		
		add(tb);
	}
}

class Insert extends JPanel
{
	Insert()
	{
		
	}
}

class Search extends JPanel
{
	Search()
	{
		
	}
}