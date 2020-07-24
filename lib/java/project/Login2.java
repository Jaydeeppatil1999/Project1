import javax.swing.*;
class Login2 extends JPanel
{	
	JButton b1;
	JTextField tx1,tx2;
	JLabel l1,l2;
	Login2(FDemo f)
	{
		l1=new JLabel("Name");
		add(l1);
		tx1=new JTextField(10);
		add(tx1);
		
		l2=new JLabel("Pass");
		add(l2);
		tx2=new JTextField(10);
		add(tx2);
		
		b1=new JButton("login");
		add(b1);
		
		b1.addActionListener(f);
	}
}