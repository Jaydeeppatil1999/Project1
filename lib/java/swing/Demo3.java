import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	JButton b[]=new JButton[20];
	JTextField tx1;
	int x=10;
	int y=70;
	int w=70;
	int h=70;
	FDemo()
	{
		setLayout(null);
		Font f= new Font("",Font.ITALIC,20);
		
		tx1= new JTextField();
		tx1.setFont(f);
		tx1.setSize(290,70);
		tx1.setLocation(10,0);
		tx1.setHorizontalAlignment(JTextField.RIGHT);//for right position
		add(tx1);
		
		int i,j;
		int k=0;
		
		for(i=0; i<5; i++)
		{
			for(j=0; j<4; j++)
			{
				b[k]=new JButton();
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
		b[0].setLabel("B");
		b[1].setLabel("C");
		b[2].setLabel("1/X");
		b[3].setLabel("sqrt");
		
		b[4].setLabel("7");
		b[5].setLabel("8");
		b[6].setLabel("9");
		b[7].setLabel("/");
		
		b[8].setLabel("4");
		b[9].setLabel("5");
		b[10].setLabel("6");
		b[11].setLabel("*");
		
		b[12].setLabel("1");
		b[13].setLabel("2");
		b[14].setLabel("3");
		b[15].setLabel("-");
		
		b[16].setLabel("0");
		b[17].setLabel(".");
		b[18].setLabel("=");
		b[19].setLabel("+");		
	}
	public void actionPerfomed(ActionEvent e)
	{
		// if(e.getSource()==b[0])
		// {
			
		// }
		// else if(e.getSource()==b[1])
		// {
			// tx1.setText("");
		// }
		// else if(e.getSource()==b[2])
		// {
			// tx1.setText("");
		// }
		// else if(e.getSource()==b[3])
		// {
			// tx1.setText("");
		// }
		// else if(e.getSource()==b[18])	
		// {
			// tx1.setText("");
		// }
		// else
		// {
			// JButton b1=(JButton)e.getSource();
			// String s22=tx1.getText()+b1.getLabel();
			// tx1.setText(s22);
			
		// }
	}
} 
class raj
{
	public static void main(String args[])
	{
		FDemo f= new FDemo();
		f.setVisible(true);
		f.setSize(300,450);
		f.setLocation(100,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}