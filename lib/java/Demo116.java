import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font("Times New Roman",Font.BOLD,40);
		setFont(f);
		
		// Label l=new Label("jay");
		// add(l);
	}
	public void paint(Graphics g)
	{
		g.fillRoundRect(75,75,250,250,30,30);
		try
		{
			Thread.sleep(500);
		}catch(Exception e){}
		Color c=new Color(255,255,0);
		g.setColor(c);
		g.fillRoundRect(100,100,200,200,30,30);
		try
		{
			Thread.sleep(500);
		}catch(Exception e){}
		Color c2=new Color(0,128,0);
		g.setColor(c2);
		g.fillRoundRect(125,125,150,150,30,30);
		try
		{
			Thread.sleep(500);
		}catch(Exception e){}
		Color c3=new Color(255,0,0);
		g.setColor(c3);
		g.fillRoundRect(150,150,100,100,30,30);
		try
		{
			Thread.sleep(500);
		}catch(Exception e){}
		Color c4=new Color(0,0,255);
		g.setColor(c4);
		g.fillRoundRect(175,175,50,50,30,30);
		try
		{
			Thread.sleep(500);
		}catch(Exception e){}
		Color c5=new Color(0,0,0);
		g.setColor(c5);
		g.fillArc(185,185,25,25,90,370);
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
class Demo116
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(550,550);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
}