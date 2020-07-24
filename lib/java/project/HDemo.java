import javax.swing.*;
class HDemo extends JPanel
{
	JButton b1,b2;
	HDemo(FDemo f)
	{
		b1=new JButton("login");
		add(b1);
		
		b2=new JButton("register");
		add(b2);
		b1.addActionListener(f);
		b2.addActionListener(f);
	}
}