import javax.swing.*; 
import java.awt.*;
class FDemo extends JFrame
{
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font(" ",Font.BOLD,30);
		Font o=new Font(" ",Font.ITALIC,20);
		
		
		JLabel j=new JLabel("Jaydeep Patil");
		j.setFont(f);
		add(j);
		
		JPasswordField p=new JPasswordField(10);
		p.setFont(o);
		add(p);
		
		
	}
} 
class Demo1
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(100,100);
		//f.setBackground(Color.white);
		//f.setForeground(Color.white);
		//f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}