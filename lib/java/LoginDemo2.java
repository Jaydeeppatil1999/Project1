import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LoginDemo2 extends JPanel 
{	JLabel un,uo; 
	JTextField tx1;
	JPasswordField  tx2;
	JButton b1,b2;
		
	LoginDemo2(FDemo r)
	{
		setLayout(null);
		Font f1=new Font("Blackadder ITC",Font.ITALIC,150);
		setFont(f1);

		 un =new JLabel ("Email");
		 un.setSize(100,50);
		 un.setLocation(100,100);
		 add(un);
		 
		 tx1=new JTextField(20);
		 tx1.setSize(280,50);
		 tx1.setLocation(190,100);
		 add(tx1); 

		 uo =new JLabel ("Password");
		 uo.setSize(250,50);
		 uo.setLocation(100,180);
		 add(uo);

		 tx2=new JPasswordField(10);
		 tx2.setSize(280,50);
		 tx2.setLocation(190,180);
		 add(tx2);

		JButton b1=new JButton("LoGin");
		b1.setSize(80,50);
		b1.setLocation(200,250);
		add(b1);


		JButton b2=new JButton("Registration");
		b2.setSize(100,50);
		b2.setLocation(300,250);
		add(b2);

		 b1.addActionListener(r);
		 b2.addActionListener(r);

	}
	

}
