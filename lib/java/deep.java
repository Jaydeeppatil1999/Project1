import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class home extends JFrame //implements ActionListener
{
	JButton b1,b2;
	JLabel l,l1,l2;
	JTextField tx1,tx2;
	//JPasswordField tx2;
	home()
	{
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,22);
		setFont(f);
		
		l=new JLabel("Admin-Page");
		l.setSize(310,44);
		l.setLocation(400,70);
		l.setFont(f);
		add(l);
		
		l1=new JLabel("Question");
		l1.setSize(100,33);
		l1.setLocation(240,160);
		l1.setFont(f);
		add(l1);
		
		tx1=new JTextField();
		tx1.setSize(230,30);
		tx1.setLocation(390,160);
		tx1.setFont(f);
		add(tx1);
		

		l2=new JLabel("Ques1");
		l2.setSize(150,33);
		l2.setLocation(240,235);
		l2.setFont(f);
		add(l2);
		
		tx2=new JTextField();
		tx2.setSize(230,30);
		tx2.setLocation(390,235);
		tx2.setFont(f);
		add(tx2);
		
		b1=new JButton("Login");
		b1.setSize(120,40);
		b1.setLocation(410,330);
		b1.setFont(f);
		add(b1);
			
		}
}
class deep
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLocation(30,30);
	}
}