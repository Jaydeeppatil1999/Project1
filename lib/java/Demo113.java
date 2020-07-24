import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1;
	TextField tx1;
	int n;
	String s1;
	boolean b=false;
	
	FDemo()
	{
		setLayout(null);
		setTitle("Table");
		Font f=new Font("Calibri (Body)",Font.ITALIC,30);
		setFont(f);
		
		tx1=new TextField(2);
		tx1.setSize(200,50);
		tx1.setLocation(200,40);
		add(tx1);
		
		b1=new Button("SHOW");
		b1.setSize(100,52);
		b1.setLocation(420,40);
		add(b1);
		
		b1.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		if(b)
		{
			int x=-10;
			int y=160;
			
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=10; j++)
				{
					try{Thread.sleep(80);}catch(Exception e){}
					int r1 =(int)Math.round(Math.random()*255);
					int g1 =(int)Math.round(Math.random()*255);
					int b1 =(int)Math.round(Math.random()*255);
					
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
	public void actionPerformed(ActionEvent e)
	{
		s1 = tx1.getText();
		n = Integer.parseInt(s1);
		b = true;
		repaint();
	}
}
class Demo113
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(850,750);
		f.setLocation(60,10);
		f.setBackground(Color.white);
		f.setForeground(Color.white);
	}
} 