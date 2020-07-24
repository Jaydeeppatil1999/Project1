import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
		Font f=new Font("Colonna MT",Font.ITALIC,40);
		setFont(f);
	}
	public void paint(Graphics g)
	{ 
		Color c4=new Color(85,0,0);
		g.setColor(c4);
		g.fillRect(240,42,6,500);
		g.fillRoundRect(200,540,80,12,8,8);
		g.fillRoundRect(180,553,120,15,8,8);
		g.fillRoundRect(160,569,160,18,9,9);
		
		Color c=new Color(255,128,0);
		g.setColor(c);
		g.fillRect(246,50,200,50);
		Color c1=new Color(255,255,255);
		g.setColor(c1);
		g.fillRect(246,100,200,50);
		
		Color c2=new Color(0,128,0);
		g.setColor(c2);
		g.fillRect(246,150,200,50);
		
		Color c3=new Color(0,0,160 );
		g.setColor(c3);
		g.drawArc(320,100,50,50,90,360);//round
		
		int x=320;
		int y=100;
		int w=50;
		int h=50;
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
class Demo85
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(750,750);
		f.setLocation(100,100);
		f.setBackground(Color.white);
		f.setForeground(Color.white);
	}
}