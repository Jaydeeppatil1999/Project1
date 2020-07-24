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
		
		JButton b1=new JButton("Register");
		add(b1);
		
		JFDemo j=new JFDemo();
		add(j);

		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		card.next(c);
	}
}
class Demo141
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(60,60);
		f.setBackground(Color.blue);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}