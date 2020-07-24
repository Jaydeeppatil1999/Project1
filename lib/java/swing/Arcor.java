import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	boolean x=false,y=false,z=false;
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f= new Font("Calibri (Body)",Font.ITALIC,30);
	
		b1 = new JButton("ARC");
		add(b1);
		
		b2 = new JButton("OVAL");
		add(b2);
		
		b3 = new JButton("RECT");
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
	public void paint(Graphics g)
	{
		Color c = new Color(255,255,255);
		g.setColor(c);
		
		if(x)
		{
			g.fillArc(200,200,100,100,90,270);
		}
		if(y)
		{
			g.fillOval(200,200,100,100);
		}
		if(z)
		{
			g.fillRect(200,200,100,100);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			x=true;
			y=false;
			z=false;
		}
		if(e.getSource()==b2)
		{
			x=false;
			y=true;
			z=false;
		}
		if(e.getSource()==b3)
		{
			x=false;
			y=false;
			z=true;
		}
		repaint();
	}
}
class Arcor
{
	public static void main(String args[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(450,450);
		f.setLocation(200,200);
		// Color c2=new Color(255,255,255);
		// f.setBackground(c2);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}