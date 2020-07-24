import java.awt.*;
import java.awt.Frame;
class FDemo2 extends Frame
{
	FDemo2()
	{}
	public void paint(Graphics g)
	{
		
		Color c5=new Color(85,0,0);
		g.setColor(c5);
		g.fillRect(240,42,6,400);
		g.fillRoundRect(200,442,80,12,8,8);
		g.fillRoundRect(180,455,120,15,8,8);
		g.fillRoundRect(160,471,160,18,9,9);
		
		Color c1=new Color(255,128,0);
		g.setColor(c1);
		g.fillRect(245,50,156,34);
		Color c2=new Color(255,255,255);
		g.setColor(c2);
		g.fillRect(245,80,156,34);
		Color c3=new Color(0,128,0);
		g.setColor(c3);
		g.fillRect(245,110,156,34);
		
		Color c4=new Color(0,0,160);
		g.setColor(c4);
		g.drawOval(310,82,25,25);
		//g.drawOval(320,94,3,3);
		
		
		int x=310;
		int y=82;
		int w=25;
		int h=25;
		int sa=0;
		int ma=5;
		for(int i=0; i<=24; i++)
		{
			g.setColor(c4);
			g.fillArc(x,y,w,h,sa,ma);
			sa=sa+15;
		}
		
	}
}
class Demo73
{
	public static void main(String args[])
	{
		FDemo2 f = new FDemo2();
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(300,60);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}