import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1;
	boolean b=false;
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font("Calibri (Body)",Font.ITALIC,40);
		setFont(f);
		
		b1=new Button("click");
		add(b1);
		
	 	b1.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		int i;
		int x=100;
		int y=100;
		if(b)
		{
			for(i=1; i<=10; i++)
			{
				g.drawString(" " +i,x,y+=60);
			}
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		b=true;
		repaint();
	}
}
class Demo111
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(100,100);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}