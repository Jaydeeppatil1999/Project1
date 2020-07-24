import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements  ActionListener
{
	List l1;
	Button b1;
	TextField tx1;
	FDemo()
	{
		
		setLayout(new FlowLayout());
		setTitle("Table");
		Font f=new Font("Calibri (Body)",Font.ITALIC,30);
		setFont(f);

		Color c1 = new Color(0,0,0);
		l1=new List();
		for(int i=1; i<=31; i++)
		{
			l1.add(" "+i);
		}
		add(l1);
		
		b1 = new Button("Submit!!");
		add(b1);
		tx1= new TextField(10);
		add(tx1);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1[]=l1.getSelectedItems();
		String s2= " ";
		for(int i=0; i<s1.length; i++)
		{
			s2=s2+s1[i];
		}
		tx1.setText(s2);
	}
	
}
class Demo114
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(550,550);
		f.setLocation(60,100);
		f.setBackground(Color.white);
		f.setForeground(Color.white);
	}
} 