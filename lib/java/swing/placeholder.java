import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements KeyListener
{
	JTextField tx1,tx2;
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f = new Font("Calibri (Body)",Font.BOLD,40);
		
		tx1=new JTextField("Enter Name");
		tx1.setFont(f);
		add(tx1);
		
		tx1.setForeground(Color.gray);
		tx1.addKeyListener(this);
		
		tx2=new JTextField("Enter c.n");
		tx2.setFont(f);
		add(tx2);
		
		tx2.addKeyListener(this);
		tx2.setForeground(Color.gray);
	}
	public void keyReleased(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
			String s1=tx1.getText().trim();
			if(s1.equals(""))
			{
				tx1.setText("Enter Name");
				tx1.setForeground(Color.gray);
			}
		}
		if(tx2.isFocusOwner())
		{
			String s1=tx2.getText().trim();
			if(s1.equals(""))
			{
				tx2.setText("Enter c.n");
				tx2.setForeground(Color.gray);
			}
		}
	}
	public void keyPressed(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
			String s1=tx1.getText();
			if(s1.equals("Enter Name"))
			{
				tx1.setForeground(Color.black);
				tx1.setText("");
			}
		}
		if(tx2.isFocusOwner())
		{
			String s1=tx2.getText();
			if(s1.equals("Enter c.n"))
			{
				tx2.setForeground(Color.black);
				tx2.setText("");
			}
		}
	}
	public void keyTyped(KeyEvent e){}
}
class placeholder
{
	public static void main(String ar[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(350,350);
		f.setLocation(100,100);
	}
}
