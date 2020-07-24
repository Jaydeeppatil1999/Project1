import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
class FDemo extends Frame implements ActionListener
{
	Button b[]=new Button[9];
	int x=5;
	int y=100;
	int w=100;
	int h=100;
	
	FDemo()
	{
		setTitle("Tictac Game");
		setLayout(null);
		Font f=new Font("Calibri (Body)",Font.ITALIC,40);
		setFont(f);
		
		int i,j;
		int k=0;
		
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				b[k]=new Button();
				b[k].setSize(w,h);
				b[k].setLocation(x,y);
				b[k].setFont(f);
				add(b[k]);
				
				b[k].addActionListener(this);
				k++;
				x=x+100;
			}
			x=5;
			y=y+100;
		}	
	}
	int count =0;
	public void actionPerformed(ActionEvent e)	
	{	
		Button b1=(Button)e.getSource();
		
		if(count%2==0)
		{
			b1.setLabel("x");
		}
		else
		{
			b1.setLabel("0");
		}
		b1.removeActionListener(this);
		count++;
		
		if(
		(b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")
		||
		(b[3].getLabel()=="x" && b[4].getLabel()=="x" && b[5].getLabel()=="x")
		||
	    (b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")
		||
		(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")
		||
		(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")
		||
		(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")
		||
		(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x")
		||
		(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")
		)
		{
			System.out.println("player with x is winner");
		}
		else if(
		(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")
		||
		(b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0")
		||
	    (b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")
		||
		(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")
		||
		(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")
		||
		(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")
		||
		(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0")
		||
		(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")
		)
		{
			System.out.println("player with 0 is winner");
		}
	}
}
class Tictac
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(310,410);
		f.setLocation(100,100);
		Color c3=new Color(0,0,160);
		f.setBackground(c3);
		f.setForeground(Color.white);
	}
} 