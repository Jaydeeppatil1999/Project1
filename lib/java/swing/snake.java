import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame 
{
	JPDemo jp1;
	FDemo()
	{
		jp1= new JPDemo();
		add(jp1);
	}
}
class JPDemo extends JPanel implements ActionListener,KeyListener
{
	ImageIcon img1,img2,img3,img4;
	Image i1,i2,head,food;
	
	int x[]=new int[100];
	int y[]=new int[100];
	int dots=5;
	boolean start_game=false;
	boolean left=false,right=true,up=false,down=false;
	int r1=0,r2=0;
	JPDemo()
	{
		img1 = new ImageIcon("b2.png");//Background
		i1 =img1.getImage();
		//setBckground(Color.black);
		
		x[0]=160;
		y[0]=100;
		x[1]=140;
		y[1]=100;
		x[2]=120;
		y[2]=100;
		x[3]=100;
		y[3]=100;
		x[4]=80;
		y[4]=100;
		
		img2 = new ImageIcon("sb.png");
		i2 =img2.getImage();
		
		img3=new ImageIcon("head.png");//head
		head=img3.getImage();
		
		img4=new ImageIcon("food3.png");//food
		food=img4.getImage();
	
		Timer t= new Timer(200,this);
		t.start();
		
		addKeyListener(this);
		setFocusable(true);
		
		randomDemo();
	}
	
	void randomDemo()
	{
		r1=(int)Math.round(Math.random()*45+1);
		r1=r1*10;
		r2=(int)Math.round(Math.random()*45+1);
		r2=r2*10;
		
	}
public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(i1,0,0,this);
		
		g.drawImage(food,r1,r2,this);
		
		for(int i=0; i<dots; i++)
		{
			if(i==0)
			{
				g.drawImage(head,x[i],y[i],this);
			}
			else
			{
				g.drawImage(i2,x[i],y[i],this);
			}
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(x[0]==r1 && y[0]==r2)
		{
			dots++;
			randomDemo();
		}
		if(start_game)
		{
			for(int i=dots;i>0;i--)
			{
				x[i]=x[i-1];
				y[i]=y[i-1];
			}
		
			if(right)
			{
				x[0]=x[0]+20;
			}
			if(left)
			{
				x[0]=x[0]-20;
			}
			if(up)
			{
				y[0]=y[0]-20;
			}
			if(down)
			{
				y[0]=y[0]+20;
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
class snake
{
	public static void main(String args[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(630,450);
		f.setLocation(10,10);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}