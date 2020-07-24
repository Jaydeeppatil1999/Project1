import javax.swing.*;
class JPDemo extends JPanel
{
	JPDemo()
	{
		JTextField tx1=new JTextField(10);
		add(tx1);
		
		JTextField tx2=new JTextField(10);
		add(tx2);
		
		JButton b1=new JButton("Login");
		add(b1);
	}
}