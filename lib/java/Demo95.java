import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font("Calibri (Body)",Font.ITALIC,40);
		setFont(f);
		
		Button b1=new Button("Login");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("ram");
		setBackground(Color.green);
	}
}
class Demo95
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,400);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
}