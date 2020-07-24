import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	JTextField tx1,tx2,tx3;
	JButton b1,b2,b3;
	int x,y;
	int j;
	FDemo()
	{
		setLayout(null);
		
		Font f= new Font ("Calibri (Body)",Font.BOLD,20);
		tx1 = new JTextField();
		tx1.setFont(f);
		tx1.setSize(100,30);
		tx1.setLocation(50,50);
		add(tx1);
		
		tx2 = new JTextField();
		tx2.setFont(f);
		tx2.setSize(100,30);
		tx2.setLocation(50,85);
		add(tx2);
		
		b1 =new JButton("+");
		b1.setFont(f);
		b1.setSize(50,30);
		b1.setLocation(50,130);
		add(b1);
		
		b2 =new JButton("-");
		b2.setFont(f);
		b2.setSize(50,30);
		b2.setLocation(100,130);
		add(b2);
		
		
		b3 =new JButton("=");
		b3.setFont(f);
		b3.setSize(100,30);
		b3.setLocation(50,200);
		add(b3);

		tx3 = new JTextField();
		tx3.setFont(f);
		tx3.setSize(100,30);
		tx3.setLocation(50,250);
		add(tx3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e)
		{
			String s1 = tx1.getText();
	
			int a= Integer.parseInt(s1);
		
			String s2 = tx2.getText();
			int b= Integer.parseInt(s2);
			if(e.getSource()==b1)
			{
				j=a+b;
				tx3.setText(" "+j);
			}
			if(e.getSource()==b2)
			{
				j=a-b;
				tx3.setText(" "+j);
			}
			if(e.getSource()==b3)
			{
				//tx3.setText(" "+j);
			}
			
		}
} 
class demo
{
	public static void main(String ar[])
	{
		FDemo f= new FDemo();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLocation(100,100);
	}
}