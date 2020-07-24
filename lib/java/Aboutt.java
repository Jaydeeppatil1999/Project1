import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Aboutt extends JPanel 
{
	JLabel l2;
	Aboutt(FDemo d)
	{
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,20);
		setFont(f);
		
		l2=new JLabel("I am jay ");
		l2.setSize(75,30);
		l2.setFont(f);
		l2.setLocation(70,110);
		add(l2);
		
		JButton b1=new JButton("Rating");
		add(b1);
	}
	public void paintComponent(Graphics g)
	{	
		ImageIcon i =new ImageIcon("jay1.jpg");
		Image im=i.getImage();
		g.drawImage(im,333,500,this);		
		//setBackground(Color.cyan);
	
	}
	
}