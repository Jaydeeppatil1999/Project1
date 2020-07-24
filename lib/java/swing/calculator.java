import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.script.*;
class FDemo extends JFrame implements ActionListener
{
	JButton b[]=new JButton[20];
	JTextField tx1;
	String data[]={"B","C","1/x","sqrt","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
	int x=10;
	int y=70;
	int w=70;
	int h=70;
	FDemo()
	{
		setTitle("Calculator");
		
		setLayout(null);
		Font f= new Font("Calibri (Body)",Font.BOLD,18);
		
		tx1= new JTextField();
		tx1.setFont(f);
		tx1.setSize(280,60);
		tx1.setLocation(10,5);
		tx1.setHorizontalAlignment(JTextField.RIGHT);//for right position
		add(tx1);
		
		int i,j;
		int k=0;
		
		for(i=0; i<5; i++)
		{
			for(j=0; j<4; j++)
			{
				b[k]=new JButton(data[k]);
				b[k].setSize(w,h);
				b[k].setLocation(x,y);
				b[k].setFont(f);
				add(b[k]);
				
				b[k].addActionListener(this);
				x=x+70;
				k++;
			}
			x=10;
			y=y+70;
	 	}	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[0])
		{
			String s1=tx1.getText();
			tx1.setText(s1.substring(0,s1.length()-1));
		}
		else if(e.getSource()==b[1])
		{
			tx1.setText("");
		}
		else if(e.getSource()==b[2])
		{
			String s1= tx1.getText();
			double a=Double.parseDouble(s1);
			a=1/a;
			tx1.setText(""+a);
		}
		else if(e.getSource()==b[3])
		{
			String s1=tx1.getText();
			double a= Double.parseDouble(s1);
			tx1.setText(""+Math.sqrt(a));
			
		}
		else if(e.getSource()==b[18])
		{
			String s1=tx1.getText();
			
			ScriptEngineManager sem= new ScriptEngineManager();
			ScriptEngine se =sem.getEngineByName("js");
			try
			{
				tx1.setText(""+se.eval(s1));
			}
			catch(Exception exe){}
			
		}
		else if(e.getSource()==b[18])	
		{
			//tx1.setText("");
		}
		else
		{
			JButton b1=(JButton)e.getSource();
			String s22=tx1.getText()+b1.getLabel();
			tx1.setText(s22);		
		}
	}
} 
class calculator
{
	public static void main(String args[])
	{
		FDemo f= new FDemo();
		f.setVisible(true);
		f.setSize(320,480);
		f.setLocation(100,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}  