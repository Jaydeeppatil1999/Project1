import javax.swing.*;
class HomeDemo2 extends JPanel
{
	JButton b1,b2;
	HomeDemo2(FDemo f)
	{
		b1 =new JButton("login");
		add(b1);
		
		b2 =new JButton("Register");
		add(b2);
		
		b1.addActionListener(f);
		b2.addActionListener(f);
	}

}