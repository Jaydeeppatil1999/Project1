import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	CardLayout card;
	Container c=getContentPane();
	FDemo()
	{
		card=new CardLayout();
		setLayout(card);
		
		JButton b1=new JButton("jay1");
		add(b1);
		
		JPDemo2 j=new JPDemo2(this);
		add(j);
		
		LoginDemo l=new LoginDemo(this);
		add(l);
		JButton b3=new JButton("jay3");
		add(b3);
		
		// JButton b4=new JButton("jay4");
		// add("D",b4);
		
		b1.addActionListener(this);
		b3.addActionListener(this);
		// b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		card.next(c);
	}
}
class Demo140
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLocation(40,40);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}