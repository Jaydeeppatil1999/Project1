import java.awt.*;	
class FDemo extends Frame
{
	FDemo()
	{
		Font f=new Font("Bahnschrift SemiBold",Font.ITALIC,40);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		int x=100;
		int y=100;
		
		for(int i=1; i<=10; i++)
		{
			g.drawString(" "+i,x,y);
			x=x+70;
		}
	}
}
class Demo82
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(750,750);
		f.setLocation(150,150);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
}