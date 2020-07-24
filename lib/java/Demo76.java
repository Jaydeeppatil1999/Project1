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
		int x[]={300,200,200,};
		int y[]={100,200,400,};
		
		int n=3;
		g.fillPolygon(x,y,n);
	}
}
class Demo76
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(100,100);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}