import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	FDemo()
	{
		setLayout(new FlowLayout());
		
		Font f = new Font("Calibri",Font.BOLD,30);
		setFont(f);
		
		
	}
	public void  paint(Graphics g)
	{
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
class Demo167
{
	public static void main(String ar[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(550,450);
		f.setLocation(100,100);
		f.setBackground(Color.red);
		f.setForeground(Color.white);
	}
}