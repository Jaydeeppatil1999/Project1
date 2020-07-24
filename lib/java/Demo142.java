import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame  implements ActionListener
{
	CardLayout card;
	Container c=getContentPane();
	
	LoginDemo login;
	MenuDemo menu;
	FDemo()
	{
		card =new CardLayout();
		setLayout(card);
		
		login=new LoginDemo(this);
		add("a",login);
		
		menu=new MenuDemo();
		add("m",menu);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String s1=login.tx1.getText();
		String s2=login.tx2.getText();
		
		if(s1.equals("abc") && s2.equals("123"))
		{
			card.next(c);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Invalid Message");
		}
	}
}
class Demo142
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(388,450);
		f.setLocation(40,50);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}