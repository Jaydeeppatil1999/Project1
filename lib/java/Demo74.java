import java.awt.*;
import java.awt.Frame;
class FDemo1 extends Frame
{
	FDemo1()
	{	
		
		Font f=new Font("Arial Rounded MT Bold ",Font.ITALIC,40);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		
		Color c1=new Color(236,187,19);
		g.setColor(c1);
		g.fillArc(60,60,150,150,90,360);//g.drawOval(x,y,w,h);
		Color c=new Color(255,255,255);
		g.setColor(c);
		g.fillArc(90,100,40,40,90,360);
		g.fillArc(140,100,40,40,90,360);
		Color c2=new Color(0,0,0);
		g.setColor(c2);
		g.fillRoundRect(114,170,44,8,8,8);
		
		g.fillOval(105,100,12,12);
		g.fillOval(155,100,12,12);
		
		//g.drawOval(150,100,17,17);
	}	
}
class Demo74
{
	public static void main(String args[])
	{
		FDemo1 f = new FDemo1();
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
} 