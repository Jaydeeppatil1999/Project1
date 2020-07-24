import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3;
	FDemo()
	{
		setLayout(null);
		Font f=new Font("",Font.ITALIC,40);
		setFont(f);
		
		b1=new Button();
		b1.setSize(100,100);
		b1.setLocation(100,100);
		add(b1);
		
		b2=new Button();
		b2.setSize(100,100);
		b2.setLocation(200,100);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			b1.setLabel("0");
		}
		if(e.getSource()==b2)
		{
			b2.setLabel("x");
		}
	}
}
class Demo109
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(700,500);
		f.setLocation(100,100);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}