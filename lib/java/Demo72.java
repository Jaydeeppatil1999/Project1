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
		g.drawRect(100,100,300,100);//g.drawRect(x,y,w,h);
		g.drawRoundRect(100,100,100,200,50,50);//g.drawRoundRect(x,y,w,h,xr,yr);
		g.drawOval(100,100,180,100);//g.drawOval(x,y,w,h);
		g.drawArc(100,100,100,100,90,270);//g.drawArc(x,y,w,h,sa,wa);
		g.drawRect(100,100,300,100);
	}	
}
class Demo72
{
	public static void main(String args[])
	{
		FDemo1 f = new FDemo1();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(100,100);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
} 