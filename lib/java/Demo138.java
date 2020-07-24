import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	CardLayout card;
	Container c=getContentPane();
	FDemo()
	{
		card = new CardLayout();
		setLayout(card);
		
		JButton b1=new JButton("jay1");
		add(b1);
		
		JButton b2=new JButton("jay1");
		add(b2);
		
		JButton b3=new JButton("jay3");
		add(b3);
		
		JButton b4=new JButton("jay4");
		add(b4);
		
		JButton b5=new JButton("jay5");
		add(b5);
		
		JButton b6=new JButton("jay1");
		add(b6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		card.next(c);
	}
}
class Demo138
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