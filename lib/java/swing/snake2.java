import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{
	JPDemo jp;
	FDemo()
	{
		jp=new JPDemo();
		add(jp);
	}	
}
class JPDemo extends JPanel implements ActionListener,KeyListener
{
	ImageIcon img1,img2,img3;
    Image sb,head,food3;
    int x[]=new int[120];
    int y[]=new int[120];
    boolean start_game=false;
    boolean left=false,right=true,up=false,down=false;
    int r1=0,r2=0,b=5;
	JPDemo()
	{
		x[0]=120;
		y[0]=100;
		x[1]=95;
		y[1]=100;
		x[2]=70;
		y[2]=100;
		x[3]=45;
		y[3]=100;
		x[4]=20;
		y[4]=100;
	 setBackground(Color.gray);
	 img1=new ImageIcon("sb.png");
	 sb=img1.getImage();
	 img2=new ImageIcon("head.png");
	 head=img2.getImage();
	 img3=new ImageIcon("food3.png");
	 food3=img3.getImage();
	 Timer T=new Timer(120,this);
	 T.start();
	 addKeyListener(this);
	 randomDemo();
	 setFocusable(true );
	}
	
	void randomDemo()
	{
		r1=(int)Math.round(Math.random()*32+1);
		r1=r1*20;
		r2=(int)Math.round(Math.random()*32+1);
		r2=r2*20;
	}	
	public void paintComponent(Graphics g)
	{
	super.paintComponent(g);
	g.drawImage(food3,r1,r2,this);
	for(int i=0;i<b;i++)
	{
		if(i==0)
		{
			g.drawImage(head,x[i],y[i],this);}
		else
		{
			g.drawImage(sb,x[i],y[i],this);
		}
	
	}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(x[0]==r1 && y[0]==r2)
		{
			b++;
			randomDemo();
		}
if(start_game)	
{	
	for(int i=b;i>0;i--)
		{
		x[i]=x[i-1];
		y[i]=y[i-1];
		}
		if(right)
		{
		x[0]=x[0]+25;
		}
		if(left)
		{
		x[0]=x[0]-25;
		}
		if(up)
		{
		y[0]=y[0]-25;
		}
		if(down)
		{
		y[0]=y[0]+25;
		}	
	}         
		repaint();
}
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e)
	{
		
		start_game=true;
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			left=true;
	        right=false;
	        up=false;
			down=false;
		}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			left=false;
	        right=true;
	        up=false;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{	
			left=false;
	        right=false;
	        up=true;
			down=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			left=false;
	        right=false;
	        up=false;
			down=true;
		}
	}
	public void keyTyped(KeyEvent e){}
	
}
class snake2
{
 public static void main(String args[])
 {
   FDemo F=new FDemo();
   F.setVisible(true);
   F.setSize(800,800);
   F.setLocation(200,10);
   F.setDefaultCloseOperation(F.EXIT_ON_CLOSE);	
}
}