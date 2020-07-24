import javax.swing.*;
class Login extends JPanel //implements ActionListener
{
	JLabel l1,l2;
	JTextField tx1,tx2;
	JButton b1;
	Login(FDemo c)
	{
		l1=new JLabel("Name");
		add(l1);
		tx1=new JTextField(10);
		add(tx1);
		
		l2=new JLabel("pass");
		add(l2);
		tx2=new JTextField(10);
		add(tx2);

		b1=new JButton("login");
		add(b1);

		b1.addActionListener(c);
		
	}
}