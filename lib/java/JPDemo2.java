import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JPDemo2 extends JPanel implements ActionListener
{
	JPDemo2(FDemo f)
	{
		JTextField tx1=new JTextField(10);
		add(tx1);
		
		JTextField tx2=new JTextField(10);
		add(tx2);
		
		JButton b1=new JButton("Login");
		add(b1);
		
		JButton b2=new JButton("my page");
		add(b2);
		
		b1.addActionListener(f);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("ram");
	}
} 