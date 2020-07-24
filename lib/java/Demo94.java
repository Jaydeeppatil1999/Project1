import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
		setLayout(null);
		setTitle("Login page");
		
		Font f=new Font("Arial Rounded MT Bold",Font.ITALIC,(28));
		setFont(f);
		
		Label un=new Label("Enter Name");
		un.setSize(220,40);
		un.setLocation(100,100);
		add(un);
		un.setBackground(Color.black);
		un.setForeground(Color.white);
		
		TextField tx1=new TextField();
		tx1.setSize(280,40);
		tx1.setLocation(350,100);
		add(tx1);
		
		
		Label up=new Label("Enter Pass");
		up.setSize(220,40);
		up.setLocation(100,150);
		add(up);
		up.setBackground(Color.black);
		up.setForeground(Color.white);
		
		TextField tx2=new TextField();
		tx2.setSize(280,40);
		tx2.setLocation(350,150);
		tx2.setEchoChar('*');
		add(tx2);
		
		Button b1=new Button("LogIn");
		b1.setSize(120,50);
		b1.setLocation(280,250);
		add(b1);
		
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		
		setResizable(false);
	}
}
class Demo94
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