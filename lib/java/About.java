import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class About extends JPanel implements ActionListener
{
	JLabel l2;
	About(FDemo d)
	{
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l2=new JLabel("I am jay");
		l2.setSize(75,30);
		l2.setFont(f);
		l2.setLocation(70,110);
		add(l2);
		
		JButton b1=new JButton("Rating");
		add(b1);
		
		b1.addActionListener(d);
		
		setBackground(Color.green);
	}
	public void actionPerformed(ActionEvent e)
	{
		// card.next(c);
	}
}