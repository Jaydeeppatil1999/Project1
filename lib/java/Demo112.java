import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3;
	boolean x=false,y=false,z=false;
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font("Calibri (Body)",Font.ITALIC,30);
		setFont(f);
		
		b1=new Button("ARC");
		add(b1);
		b2=new Button("OVAL");
		add(b2);
		b3=new Button("React");
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this); 
	}
	public void paint(Graphics g)
	{	
		Color c=new Color(72,86,215);
		g.setColor(c);
		if(x)
		{	
			g.setColor(c);
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
class Demo112
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,400);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
}
