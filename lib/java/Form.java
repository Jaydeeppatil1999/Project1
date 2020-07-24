import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class FDemo extends Frame implements ActionListener
{	 
	TextArea tx;
	TextField tx1,tx2,tx3,tx4,tx5,tx6;
	Choice l1,l2,l3; 
	Label l4;
	Button b1;
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup cbg;
	String ss11,ss12,ss13,s10;
	FDemo()
	{
		setLayout(null);
		Font f = new Font("Calibri (Body)",Font.BOLD,15);
		setFont(f);
		
		setTitle("FORM");
		
		
		tx = new TextArea();
		tx.setSize(280,400);
		tx.setLocation(350,70);
		tx.setBackground(new Color(0,128,55));
		tx.setForeground(Color.red);
		tx.disable();
		add(tx);
		
		tx6= new TextField();
		tx6.setSize(173,25);
		tx6.setLocation(150,70);
		add(tx6);
			
		tx1 = new TextField();
		tx1.setSize(173,25);
		tx1.setLocation(150,120);
		add(tx1);

		tx2 = new TextField();
		tx2.setSize(173,25);
		tx2.setLocation(150,170);
		add(tx2);

		tx3 = new TextField();
		tx3.setSize(173,25);
		tx3.setLocation(150,220);
		add(tx3);
		
		tx4 = new TextField();
		tx4.setSize(173,25);
		tx4.setLocation(150,270);
		add(tx4);
		
		tx5 = new TextField();
		tx5.setSize(173,25);
		tx5.setLocation(150,320);
		add(tx5);
		
		l1=new Choice();
		l1.setSize(51,23);
		l1.setLocation(150,370);
		for(int i=1; i<=31; i++)
		{
			l1.add(""+i);
		}
		add(l1);
		
		l2=new Choice();
		l2.setSize(51,23);
		l2.setLocation(200,370);
		for(int i=1; i<=12; i++)
		{
			l2.add(""+i);
		}
		add(l2);
		
		l3=new Choice();
		l3.setSize(73,23);
		l3.setLocation(250,370);
		for(int i=1980; i<=2025; i++)
		{
			l3.add(""+i);
		}
		add(l3);
		cbg =new CheckboxGroup();
		Checkbox c1 = new Checkbox("Male",true,cbg);
		c1.setBackground(new Color(0,128,55));
		c1.setSize(63,25);
		c1.setLocation(148,420);
		add(c1);
		Checkbox c22 = new Checkbox("Female",false,cbg);
		c22.setSize(85,25);
		c22.setBackground(new Color(0,128,55));
		c22.setLocation(220,420);
		add(c22);
		
		cb1= new Checkbox("C");
		cb1.setBackground(new Color(0,128,55));
		cb1.setSize(61,25);
		cb1.setLocation(150,470);
		add(cb1);
		
		cb2= new Checkbox("C++");
		cb2.setBackground(new Color(0,128,55));
		cb2.setSize(63,25);
		cb2.setLocation(220,470);
		add(cb2);
		
		cb3= new Checkbox("Java");
		cb3.setBackground(new Color(0,128,55));
		cb3.setSize(61,25);
		cb3.setLocation(150,520);
		add(cb3);
		
		cb4= new Checkbox("J2EE");
		cb4.setBackground(new Color(0,128,55));
		cb4.setSize(63,25);
		cb4.setLocation(220,520);
		add(cb4);
		

		Color c2 = new Color(0,0,0);
		b1 = new Button("Submit!!");
		b1.setSize(134,35);
		b1.setLocation(150,570);
		add(b1);
		b1.addActionListener(this);
		
		setResizable(false);
		l4=new Label("FORM");
		l4.setBounds(300,30,200,40);
		l4.setFont(new Font("Calibri",Font.BOLD,35));
		l4.setBackground(new Color(0,128,55));
		add(l4);
	}
	public void paint(Graphics g)
	{
		Color c1 = new Color(0,0,0);
		g.setColor(c1);
		g.drawString("Roll No.",15,90);
		g.drawString("Name",15,140);
		g.drawString("Last Name",15,190);
		g.drawString("E Mail",15,240);
		g.drawString("Contect No",15,290);
		g.drawString("Address",15,340);
		g.drawString("Date",15,390);
		g.drawString("Gender",15,440);
		g.drawString("Language",15,490);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
		String s6 = tx6.getText();
		// int y= Integer.parseInt(s6);
		// int a=y;
		
		String s1 = tx1.getText();
		
		String s2 = tx2.getText();
		
		String s3 = tx3.getText();
		
		String s4 = tx4.getText();
		// int x= Integer.parseInt(s4);
		// int j=x;
		
		String s5 = tx5.getText();
			//Checkbox data fetch
		if(cb1.getState())
		{
			 s10=cb1.getLabel();
		}
		if(cb2.getState())
		{
			ss11=cb2.getLabel();
		}
		if(cb3.getState())
		{
			ss12=cb3.getLabel();
		}
		if(cb4.getState())
		{
			ss13=cb4.getLabel();
		}
		 s10=""+ss11+"\n"+ss12+"\n"+ss13;
		String s11=l1.getSelectedItem();
		String s12=l2.getSelectedItem();
		String s13=l3.getSelectedItem();
		String s14=cbg.getSelectedCheckbox().getLabel();
		String s17=""+s6+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+"\t"+s4+
		"\n"+s5+"\n"+s11+"/"+s12+"/"+s13+"\n"+s14+"\n"+s10+"\n"+ss11+"\n"+ss12+"\n"+ss13;
		tx.setText(s17);
		try
		{
			FileOutputStream  fo=new FileOutputStream("form.txt",true);
			int i;
			for(i=0;i<s17.length();i++)
			{
				fo.write(s17.charAt(i));
				
			}
			fo.close();
		}
		catch(Exception e)
		{}
		
		
	}
	}
}
class Form
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(660,730);
		f.setLocation(50,50);
		Color c = new Color(0,128,55);
		f.setBackground(c);
		f.setForeground(Color.white);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}