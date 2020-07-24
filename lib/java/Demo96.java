import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3;
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font("Calibri (Body)",Font.ITALIC,(30));
		setFont(f);
		
		b1=new Button("Red");
		add(b1);
		b2=new Button("Green");
		add(b2);
		b3=new Button("Blue");
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			setBackground(Color.red);
		}
		if(e.getSource()==b2)
		{
			setBackground(Color.green);
		}
		if(e.getSource()==b3)
		{
			setBackground(Color.blue);
		}
	}
}
class Demo96
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,400);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
}