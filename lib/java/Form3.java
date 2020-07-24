import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	
	TextField tx1,tx2,tx3,tx4,tx5,tx6;
	Label L1,L2,l3,l4,l5,l6,l7,l8;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	Choice ch,ch1,ch2;
	TextArea ta=new TextArea();
	
	FDemo()
	{
		setLayout(null);
		Font F=new Font("Blackadder ITC",Font.ITALIC,19);
	    setFont(F);
    
	 ta.setSize(300,400);
	 ta.setLocation(460,100);
	 add(ta);
	
	 L1.setSize(95,30);
     L1.setLocation(100,50);
	 add(L1);
	 tx1=new TextField(15);
	 tx1.setSize(150,30);
	 tx1.setLocation(200,50);
	 add(tx1);
	 
	 L2=new Label("Last Name");
	 L2.setSize(95,30);
     L2.setLocation(100,100);
	 add(L2);
	 tx2=new TextField(15);
	 tx2.setSize(150,30);
	 tx2.setLocation(200,100);
	 add(tx2);
	 
	 l3=new Label("E-mail");    //E-mail
	 l3.setSize(80,30);
     l3.setLocation(100,150);
	 add(l3);
	  tx3=new TextField(35);
	  tx3.setSize(150,30);
	  tx3.setLocation(190,150);
	 add(tx3);
	 
	 l4=new Label("Contact");      //Contact
	 l4.setSize(80,30);
     l4.setLocation(100,200);
	 add(l4);
	 tx4=new TextField(10);
	 tx4.setSize(150,30);
	  tx4.setLocation(190,200);
	 add(tx4);
	 
	 l5=new Label("Address");         //Address
	 l5.setSize(80,30);
     l5.setLocation(100,250);
	 add(l5);
	 tx5=new TextField(60);
	 tx5.setSize(240,30);
	  tx5.setLocation(190,250);
	 add(tx5);
	 
	 l6=new Label("Date");        //DATE
	 l6.setSize(80,30);
     l6.setLocation(100,300);
	 add(l6);
	
	 //String ch2[]=new String[Jan,Feb,Mar,Apr,June,July,Aug,Sept,Oct,Nov,Dec];
	 Choice ch=new Choice();
	 for(int i=1;i<=31;i++)
	 {
	 ch.add(""+i);
	 }
	  ch.setSize(50,30);
		  ch.setLocation(185,300);
		  add(ch);
		  
		  Choice ch1=new Choice();
		  for(int j=1990;j<=2050;j++)
	 {
	 ch1.add(""+j);
	 }
	 ch1.setSize(80,30);
		ch1.setLocation(335,300);
		add(ch1);
		  
		Choice ch2=new Choice();
		for(int k=1;k<=12;k++)
	 {
	 ch2.add(""+k);
	 }
	 ch2.setSize(80,30);
		ch2.setLocation(245,300);
		add(ch2);
	 
	 l7=new Label("Gender");         //Gender                     
	 l7.setSize(80,30);
     l7.setLocation(100,350);
	 add(l7);
	 
	 CheckboxGroup cbg = new CheckboxGroup();
	 Checkbox cb1=new Checkbox("Male",true,cbg);
	 cb1.setSize(100,30);
	 cb1.setLocation(190,350);
	 add(cb1);
	 Checkbox cb2 = new Checkbox("FeMale",false,cbg);
	 cb2.setSize(100,30);
	 cb2.setLocation(300,350);
	 add(cb2);
	 
	 l8=new Label("Prog.lang");
	 l8.setSize(95,30);
     l8.setLocation(90,400);
	 add(l8);
	 
	 Checkbox cb3=new Checkbox("HTML");
	 cb3.setSize(100,30);
	 cb3.setLocation(195,400);
	 add(cb3);
	 
	 Checkbox cb4=new Checkbox("CSS");
	 cb4.setSize(100,30);
	 cb4.setLocation(195,435);
	 add(cb4);
	 
	 Checkbox cb5=new Checkbox("c & c++");
	 cb5.setSize(100,30);
	 cb5.setLocation(300,400);
	 add(cb5);
	 
	 Checkbox cb6=new Checkbox("MAVA");
	 cb6.setSize(100,30);
	 cb6.setLocation(300,435);
	 add(cb6);
	 
	 tx8=new TextField(15);
	 tx8.setSize(90,30);
	  tx8.setLocation(190,400);
	 add(tx8);
	 
	 Button b1=new Button("SUBMIT");
	 b1.setSize(100,100);       
		b1.setLocation(300,500); 
		add(b1);
	b1.addActionListener(this);	
	}
	public vooid paint(Graphics g)
	{
	 g.drawString("First Name");
		
	}
	public void actionPerformed(ActionEvent e)
		{  
		String s1="",s2="",s3="",s4="",s5="",cx1="",cx2="";
		s1=tx1.getText();
		s2=tx2.getText();
		ta.setText(s1+s2); //FIRST AND LAST NAME
		 s3=tx3.getText(); //email 
		 ta.setText(s3);  
		 //s4=tx4.getText(); //contact
		 // s5=tx5.getText();//adress
		  
		  //s6=ch.getSelectedItems();
		 //ta.setText(s6);
		  
		if(cb3.getState())
		{cx1=cb3.getLabel();}
	    if(cb4.getState())
		{cx1=cx1+cb4.getLabel();}
	if(cb5.getState())
		{cx1=cx1+cb5.getLabel();}
	
	
		  
		}
}

class Form3
{
	public static void main(String args[])
 {
   FDemo F=new FDemo();
   F.setVisible(true);
   F.setSize(800,800);
   F.setLocation(500,100);
   F.setBackground(Color.black);
   F.setForeground(Color.white);
   F.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e)
	{
   System.exit(0);
	}});
}
}