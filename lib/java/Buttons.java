import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Buttons extends JPanel 
{
	JButton b1,b2; 
	Buttons(FDemo b)
	{
		
		b1=new JButton("Login");
		add(b1);
		b2=new JButton("Register");
		add(b2);
		
		
		b1.addActionListener(b);
		b2.addActionListener(b);
		setBackground(Color.black);
	}
	// public void paintComponent(Graphics g)
	// {	
		// ImageIcon i =new ImageIcon("jay1.jpg");
		// Image im=i.getImage();
		// g.drawImage(im,333,500,this);		
		// setBackground(Color.cyan);
	
		
	// }
} 