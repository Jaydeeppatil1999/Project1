import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	Container c=getContentPane();
	FDemo()
	{
		setLayout(new FlowLayout());
		JButton b1=new JButton("jay");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		c.setBackground(Color.green);
	}
}
class Demo139
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(300,300);
		f.setLocation(50,50);
		f.setBackground(Color.cyan);
		f.setForeground(Color.white);	
	}
}