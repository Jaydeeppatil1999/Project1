import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
		Font f=new Font("Georgia",Font.ITALIC,38);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		int x=100;
		int y=100;
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				try{Thread.sleep(150);}catch(Exception e){}
				
				int r1=(int)Math.round(Math.random()*255);
				int g1=(int)Math.round(Math.random()*255);
				int b1=(int)Math.round(Math.random()*255);
				
				Color c=new Color(r1,g1,b1);
				g.setColor(c);
				g.drawString(""+(i*j),x,y);
				x=x+70;
			}
			x=100;
			y=y+70;
		}
	}
}
class Demo83
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(850,850);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
}