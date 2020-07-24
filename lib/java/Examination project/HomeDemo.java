import javax.swing.*;
import java.awt.*;
class HomeDemo extends JPanel
{
	JButton b1,b2;
	JLabel l;
	HomeDemo(FDemo c)
	{
		setBackground(Color.gray);
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,22);
		setFont(f);
		
		l=new JLabel("Home Page");
		l.setSize(310,44);
		l.setLocation(380,50);
		l.setFont(f);
		add(l);
		
		b1=new JButton("Admin");
		b1.setSize(110,40);
		b1.setLocation(250,240);
		b1.setFont(f);
		add(b1);
		
		b2=new JButton("Student");
		b2.setSize(130,40);
		b2.setLocation(500,240);
		b2.setFont(f);
		add(b2);
		
		b1.addActionListener(c);
		b2.addActionListener(c);
	}
}