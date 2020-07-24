import javax.swing.*;
import java.awt.*;
class FDemo extends JFrame
{
	JPDemo jp1;
	FDemo()
	{	
		super.setTitle("Snake and Ladder");
		jp1=new JPDemo();
		add(jp1);
	}
}
class JPDemo extends JPanel
{
	ImageIcon img1,img2;
	Image swt,bord;
	JPDemo()
	{
		//setBackground(Color.black);
		
		// img1= new ImageIcon();
		// swt=img1.getImage();
		
		img1= new ImageIcon("bord2.png");
		bord=img1.getImage();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//g.drawImage(swt,0,0);
		g.drawImage(bord,200,0,this);
	}
}
class snakeladder
{
	public static void main(String args[])
	{
		FDemo f= new FDemo();
		f.setVisible(true);
		f.setBounds(200,100,990,735);
		f.setLocation(10,0);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}