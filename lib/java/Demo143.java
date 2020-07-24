import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener 
{
	CardLayout card;
	Container c=getContentPane();
	Loginbit l;
	Buttons bu;
	Register2 re;
	About ab;
	MenuDemo d;
	FDemo()
	{	
		card =new CardLayout();
		setLayout(card);
		
		bu=new Buttons(this);
		add("B",bu);
	
		l=new Loginbit(this);
		add("C",l);	
		d=new MenuDemo(this);
		add("D",d);
		re=new Register2(this);
		add("E",re);
		
		// ab=new About(this);
		// add("D",ab);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{		
		if(e.getSource()==bu.b1)
		{
			card.show(c,"C");
		}
		if(e.getSource()==bu.b2)
		{
			card.show(c,"E");
		}
		if(e.getSource()==l.b3)
		{
			card.show(c,"D");
		}
		
	}
}
class Demo143
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(400,450);
		f.setLocation(100,60);
		f.setBackground(Color.red);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}