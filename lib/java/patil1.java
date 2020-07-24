import java.util.*;
import java.io.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class addQ extends JFrame //implements ActionListener 
{
	JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2;
	String s[]={"Java","C","C++"};
	JComboBox cb1;
	addQ()
	{
		setLayout(null);
		Font f=new Font("BOLD",Font.ITALIC,22);
		setFont(f);
		
		// l1=new JLabel("Exam Name");
		// l1.setSize(150,30);
		// l1.setLocation(160,80);
		// l1.setFont(f);
		// add(l1);
		
		// // cb1=new JComboBox(s);
		// // // cb1.addItem("java");
		// // // cb1.addItem("c");
		// // //cb1.setVisibleRowCount(3);
		// // add(new JScrollPane(cb1));
		// // cb1.setSize(130,30);
		// // cb1.setLocation(340,80);
		// // cb1.setFont(f);
		// // add(cb1);
		
		// //tx1=new JTextField();
		// // add(tx1);
		
		
		// l2=new JLabel("Question Name");
		// l2.setSize(180,30);
		// l2.setLocation(160,130);
		// l2.setFont(f);
		// add(l2);
		
		// tx2=new JTextField();
		// tx2.setSize(330,30);
		// tx2.setLocation(340,130);
		// tx2.setFont(f);
		// add(tx2);
		
		// l3=new JLabel("Option1");
		// l3.setSize(150,30);
		// l3.setLocation(160,180);
		// l3.setFont(f);
		// add(l3);
		
		// tx3=new JTextField();
		// tx3.setSize(330,30);
		// tx3.setLocation(340,180);
		// tx3.setFont(f);
		// add(tx3);
		
		// l4=new JLabel("Option2");
		// l4.setSize(150,30);
		// l4.setLocation(160,230);
		// l4.setFont(f);
		// add(l4);
		
		// tx4=new JTextField();
		// tx4.setSize(330,30);
		// tx4.setLocation(340,230);
		// tx4.setFont(f);
		// add(tx4);
		
		// // l5=new JLabel("Option3");
		// // l5.setSize(150,30);
		// // l5.setLocation(160,280);
		// // l5.setFont(f);
		// // add(l5);
		
		// // tx5=new JTextField();
		// // tx5.setSize(330,30);
		// // tx5.setLocation(340,280);
		// // tx5.setFont(f);
		// // add(tx5);
		
		// // l6=new JLabel("Option4");
		// // l6.setSize(150,30);
		// // l6.setLocation(160,330);
		// // l6.setFont(f);
		// // add(l6);
		
		// // tx6=new JTextField();
		// // tx6.setSize(330,30);
		// // tx6.setLocation(340,330);
		// // tx6.setFont(f);
		// // add(tx6);
		
		// l7=new JLabel("Correct Ans");
		// l7.setSize(150,30);
		// l7.setLocation(160,380);
		// l7.setFont(f);
		// add(l7);
		
		// tx7=new JTextField();
		// tx7.setSize(330,30);
		// tx7.setLocation(340,380);
		// tx7.setFont(f);
		// add(tx7);
		
		// b1=new JButton("Save");
		// b1.setSize(110,40);
		// b1.setLocation(340,450);
		// b1.setFont(f);
		// add(b1);
		
		// // b2=new JButton("Reset");
		// // b2.setSize(110,40);
		// // b2.setLocation(500,450);
		// // b2.setFont(f);
		// // add(b2);
	}
	// public void actionPerformed(ActionEvent e)
	// {
		
	// }
}
class patil1
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(900,600);
		f.setLocation(20,20);
		f.setResizable(false);
	}
}