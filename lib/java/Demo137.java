import javax.swing.*;
import java.awt.*;
class FDemo extends JFrame
{
	GridLayout g;
	FDemo()
	{
		g=new GridLayout(2,3);
		setLayout(g);
		
		JButton b1=new JButton("jay1");
		add(b1);
		
		JPDemo j=new JPDemo();
		add(j);
		
		JButton b3=new JButton("jay3");
		add(b3);
		
		JButton b4=new JButton("jay4");
		add(b4);
		
		JButton b5=new JButton("jay5");
		add(b5);
		
		JButton b6=new JButton("jay6");
		add(b6);
	}
}
class Demo137
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLocation(60,60);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}