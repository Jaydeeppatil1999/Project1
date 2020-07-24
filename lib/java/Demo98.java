import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	FDemo()
	{
		setLayout(null);
		Font f=new Font("Calibri (Body)",Font.ITALIC,(40));
		setFont(f);
		
		b1=new Button();
		b1.setSize(100,100);
		b1.setLocation(100,100);
		add(b1);
		
		b2=new Button();
		b2.setSize(100,100);
		b2.setLocation(200,100);
		add(b2);
		
		b3=new Button();
		b3.setSize(100,100);
		b3.setLocation(300,100);
		add(b3);
		
		b4=new Button();
		b4.setSize(100,100);
		b4.setLocation(100,200);
		add(b4);
		
		b5=new Button();
		b5.setSize(100,100);
		b5.setLocation(200,200);
		add(b5);
		
		b6=new Button();
		b6.setSize(100,100);
		b6.setLocation(300,200);
		add(b6);
		
		b7=new Button();
		b7.setSize(100,100);
		b7.setLocation(100,300);
		add(b7);
		
		b8=new Button();
		b8.setSize(100,100);
		b8.setLocation(200,300);
		add(b8);
		
		b9=new Button();
		b9.setSize(100,100);
		b9.setLocation(300,300);
		add(b9);
		
		b1.addActionListener(this); 
		b2.addActionListener(this); 
		b3.addActionListener(this); 
		b4.addActionListener(this);
		b5.addActionListener(this);	
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
	}
	int count =0;
	public void actionPerformed(ActionEvent e)	
	{	
		Button b=(Button)e.getSource();
		count++;
		
		if(count%2==0)
		{
			b.setLabel("X");
		}
		else
		{
			b.setLabel("0");
		}
	}
}
class Demo98
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(50,50);
		Color c3=new Color(0,0,160);
		f.setBackground(c3);
		f.setForeground(Color.white);
	}
}