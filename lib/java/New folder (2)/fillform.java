import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{Label un;
Checkbox cb1,cb2;
Button b1;
TextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9;
FDemo()
{setLayout(null);
Font f=new Font("Blackadder ITC",Font.ITALIC,40);
setFont (f);

tx9=new TextField(15);
tx9.setSize(300,500);
tx9.setLocation(800,100);
add(tx9);

Label un1 =new Label ("Form: 47 Rajat Sharma");
un1.setSize(220,50);
un1.setLocation(100,50);


Label un =new Label ("Name");
un.setSize(220,50);
un.setLocation(50,100);
tx1=new TextField(20);
tx1.setSize(280,50);
tx1.setLocation(390,100);
add(tx1); 



Label uo =new Label ("Last Name");
uo.setSize(250,50);
uo.setLocation(50,180);
tx2=new TextField(20);
tx2.setSize(280,50);
tx2.setLocation(390,180);
add(tx2);

Label up =new Label ("Email");
up.setSize(220,50);
up.setLocation(50,260);
tx3=new TextField(20);
tx3.setSize(280,50);
tx3.setLocation(390,260);
add(tx3);

Label uq =new Label ("Contact No.");
uq.setSize(300,50);
uq.setLocation(50,340);
tx4=new TextField(20);
tx4.setSize(280,50);
tx4.setLocation(390,340);
add(tx4);

Label ur =new Label ("Address");
ur.setSize(250,50);
ur.setLocation(50,420);
tx5=new TextField(20);
tx5.setSize(280,50);
tx5.setLocation(390,420);
add(tx5);

Label us =new Label ("Date of Birth");
us.setSize(250,50);
us.setLocation(50,500);
Choice list1= new Choice();
list1.add("1");
list1.add("2");
list1.add("3");
list1.add("4");
list1.add("5");
list1.add("6");
list1.add("7");
list1.add("8");
list1.add("9");
list1.add("10");
list1.add("11");
list1.add("12");
list1.add("13");
list1.add("14");
list1.add("15");
list1.add("16");
list1.add("17");
list1.add("18");
list1.add("19");
list1.add("20");
list1.add("21");
list1.add("22");
list1.add("23");
list1.add("24");
list1.add("25");
list1.add("26");
list1.add("27");
list1.add("28");
list1.add("29");
list1.add("30");
list1.add("31");
list1.setSize(70,50);
list1.setLocation(350,500);
add(list1);

Choice list2= new Choice();
list2.add("Jan");
list2.add("Feb");
list2.add("Mar");
list2.add("Apr");
list2.add("May");
list2.add("june");
list2.add("july");
list2.add("Aug");
list2.add("Sep");
list2.add("Oct");
list2.add("Nov");
list2.add("Dec");
list2.setSize(100,50);
list2.setLocation(410,500);
add(list2);

Choice list3= new Choice();
list3.add("2005");
list3.add("2004");
list3.add("2003");
list3.add("2002");
list3.add("2001");
list3.setSize(120,50);
list3.setLocation(550,500);
add(list3);


Label ut =new Label ("Gender");
ut.setSize(220,50);
ut.setLocation(50,580);
CheckboxGroup cbg =new CheckboxGroup();

Checkbox cb11=new Checkbox("Male",true,cbg);
cb11.setSize(120,50);
cb11.setLocation(330,580);
add(cb11);

Checkbox cb12=new Checkbox("FeMale",false,cbg);
cb12.setSize(150,50);
cb12.setLocation(500,580);
add(cb12);


Label uu =new Label ("Language");
uu.setSize(250,50);
uu.setLocation(50,660);
Checkbox cb1 =new Checkbox("c");
cb1.setSize(50,50);
cb1.setLocation(350,660);
add(cb1);
Checkbox cb2 =new Checkbox("c++");
cb2.setSize(80,50);
cb2.setLocation(420,660);
add(cb2);
Checkbox cb3 =new Checkbox("Java");
cb3.setSize(120,50);
cb3.setLocation(550,660);
add(cb3);

Button b1=new Button ("Submit");
b1.setSize(150,50);
b1.setLocation(200,720);
add(b1);
b1.addActionListener(this);


add(un);
add(uo);
add(up);
add(uq);
add(ur);
add(us);
add(ut);
add(uu);

}
 public void actionPerformed(ActionEvent e)
 { if(e.getSource()==b)
		{
		String s6 = tx6.getText();
		int y= Integer.parseInt(s6);
		int a=y;
		
		String s1 = tx1.getText();
		
		String s2 = tx2.getText();
		
		String s3 = tx3.getText();
		
		String s4 = tx4.getText();
		int x= Integer.parseInt(s4);
		int j=x;
		
		String s5 = tx5.getText();
			//Checkbox data fetch
		String s10="",ss11="",ss12="",ss13="";
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
		String s11=l1.getSelectedItem();
		String s12=l2.getSelectedItem();
		String s13=l3.getSelectedItem();
		String s14=cbg.getSelectedCheckbox().getLabel();
		String s17=""+a+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+""+j+
		"\n"+s5+"\n"+s11+"/"+s12+"/"+s13+"\n"+s14+"\n"+s10+"\n"+ss11+"\n"+ss12+"\n"+ss13;
		tx.setText(s17);
		

}
}

class fillform
{public static void main(String args[])
{FDemo f=new FDemo();
f.setVisible(true);
f.setSize(800,600);
f.setLocation(100,100);
f.setBackground(Color.orange);
f.setForeground(Color.black);
}
}	