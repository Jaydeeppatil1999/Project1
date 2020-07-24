import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b[]=new Button[9];
	FDemo()
	{
		setLayout(null);
		
		int x=100;
		int y=100;
		int w=100;
		int h=100;
		int k=0;
		for(int i=0; i<3; i++);
		{
			for(int j=0; j<3; j++)
			{
				b[k]=new Button();
				b[k].setBounds(x,y,w,h);
				add(b[k]);
				b[k].addActionListener(this);
				x=x+100; 
				k++;
			}
			y=y+100;
			x=100;
		}
	}
	int count=0;
	public void actionPerformed(ActionEvent e)
	{
		Button bb=(Button)e.getSource();
		count++;
		
		if(count%2==0)
		{
			bb.setLabel("X");
		}
		else
		{
			bb.setLabel("0");
		}
		bb.removeActionListener(this);
	}
}
class Demo99
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(100,100);
		f.setBackground(Color.white);			
		f.setForeground(Color.white);
	}
}