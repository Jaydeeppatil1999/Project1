import java.awt.*;
import javax.swing.*;
class HomeDemo extends JPanel
{
	JButton b1,b2;
	ImageIcon img;
	Image im;
	HomeDemo(FDemo f)
	{
		
		
		b1=new JButton("Login");
		add(b1);
		b2=new JButton("Register");
		add(b2);
		
		img=new ImageIcon("jay6.jpg");
		im=img.getImage();
		
		b1.addActionListener(f);
		b2.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(im,0,0,540,360,this);
	}
}