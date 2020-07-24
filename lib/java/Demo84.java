import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
		Font  f=new Font("Georgia",Font.ITALIC,40);
		setFont(f);
	}
	public void paint(Graphics g)
	{	
		Color c=new Color(249,181,21);
		g.setColor(c);
		g.fillRect(250,100,200,50);
		Color c1=new Color(255,255,255);
		g.setColor(c1);
		g.fillRect(250,150,200,50);
		
		Color c2=new Color(0,128,0);
		g.setColor(c2);
		g.fillRect(250,200,200,50);
		
		Color c3=new Color(0,0,128);
		g.setColor(c3);
		g.drawArc(332,150,49,49,90,360);//round
		
		int x=332;
		int y=150;
		int w=49;
		int h=49;
		int sa=0;
		int ma=5;
		for(int i=0; i<=24; i++)
		{	
			try{Thread.sleep(200);}catch (Exception e){}
			g.setColor(c3);
			g.fillArc(x,y,w,h,sa,ma);
			sa=sa+15;
		}
	}
}
class Demo84
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(750,750);
		f.setLocation(100,100);
		f.setBackground(Color.white);
		f.setForeground(Color.white);
	}
}