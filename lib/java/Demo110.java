import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{	
	TextField tx1;
	TextField tx2;
	TextField tx3;
		
	Button b1;
	FDemo()
	{
		setLayout(new FlowLayout());
		Font f=new Font("Calibri (Body)",Font.ITALIC,40);
		setFont(f);
		
		tx1 = new TextField(15);
		add(tx1);
		tx2 = new TextField(15);
		add(tx2);
		
		b1=new Button("SUM");
		add(b1);
		
		tx3 = new TextField(15);
		add(tx3);
		
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1 = tx1.getText();
		String s2 = tx2.getText();
		
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		
		int sum=x+y;
		tx3.setText(" "+sum);
	}
}
class Demo110
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(700,500);
		f.setLocation(100,100);
		f.setBackground(Color.blue);
		f.setForeground(Color.white);
	}
}