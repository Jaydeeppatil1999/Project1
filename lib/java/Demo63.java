import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
//frame first example
class FDemo extends Frame
{
	FDemo()
	{}
	public void paint(Graphics g)
	{
		g.drawString("JD Patil",100,100);//g.drawString(s,x,y);
	}
}
class Demo63
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);//to show frame box
		f.setSize(300,300);//f.setSize(width,height);
		f.setLocation(100,100);//f.setLocation(width,height);
		f.setBackground(Color.blue);//to set background color
		f.setForeground(Color.white);//to set text color
	}
}