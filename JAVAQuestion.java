import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.image.*;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



class JAVAQuestion extends JFrame implements ActionListener{
	
	
//Radio button
JRadioButton option1,option2,option3,option4;
JRadioButton option5,option6,option7,option8;
JRadioButton option9,option10,option11,option12;
JRadioButton option13,option14,option15,option16;
JRadioButton option17,option18,option19,option20;

JLabel question1,question2,question3,question4,question5;

//Label
JLabel QuestionLabel1,QuestionLabel2,QuestionLabel3,QuestionLabel4,QuestionLabel5,o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18,o19,o20;


//Button
JButton home,submit;


public JAVAQuestion(){
	
	setLayout(null);
	
	
	
	//image icon
	ImageIcon homeImage=new ImageIcon("logoutImage.png");
	ImageIcon submitImage=new ImageIcon("submitImage.png");
	
	
	home = new JButton ("Cancel",homeImage);
	submit = new JButton ("Submit",submitImage);
	//label
	question1 = new JLabel("What is the size of short variable? ");
	question2 = new JLabel("What is the default value of char variable?");
	question3 = new JLabel("- Which of the following is true about String?");
	question4 = new JLabel("Which method must be implemented by all threads?");
	question5 = new JLabel("Which operations can result in the throwing of an ArithmeticException?");
	
	QuestionLabel1 = new JLabel("Q1 : ");
	QuestionLabel2 = new JLabel("Q2 : ");
	QuestionLabel3 = new JLabel("Q3 : ");
	QuestionLabel4 = new JLabel("Q4 : ");
	QuestionLabel5 = new JLabel("Q5 : ");
	
	//options label
	o1 = new JLabel("8 bit");
	o2 = new JLabel("16 bit");
	o3 = new JLabel("32 bit");
	o4 = new JLabel("64 bit");
	
	//ans 32 bit
	
	o5 = new JLabel("'\u0000'");
	o6 = new JLabel("0");
	o7 = new JLabel("NULL");
	o8 = new JLabel("not defined");
	
	//ans '\u0000'
	
	o9 = new JLabel("Mutable");
	o10 = new JLabel("Immutable");
	o11 = new JLabel("Data Type");
	o12 = new JLabel("None of above");
	
	//ans immutable
	
	o13 = new JLabel("wait()");
	o14 = new JLabel("start()");
	o15 = new JLabel("stop()");
	o16 = new JLabel("run()");
	
	//ans run()
	
	o17 = new JLabel("/,%");
	o18 = new JLabel("*,+");
	o19 = new JLabel("!,-");
	o20 = new JLabel(">>,<<");
	
	//ans /,%
	
	
	
	//option
	option1 = new JRadioButton();
	option2 = new JRadioButton();
	option3 = new JRadioButton();
	option4 = new JRadioButton();
	option5 = new JRadioButton();
	option6 = new JRadioButton();
	option7 = new JRadioButton();
	option8 = new JRadioButton();
	option9 = new JRadioButton();
	option10 = new JRadioButton();
	option11 = new JRadioButton();
	option12 = new JRadioButton();
	option13 = new JRadioButton();
	option14 = new JRadioButton();
	option15 = new JRadioButton();
	option16 = new JRadioButton();
	option17 = new JRadioButton();
	option18 = new JRadioButton();
	option19 = new JRadioButton();
	option20 = new JRadioButton();
	
	
	//button group
	
	ButtonGroup bg1 = new ButtonGroup();
	ButtonGroup bg2 = new ButtonGroup();
	ButtonGroup bg3 = new ButtonGroup();
	ButtonGroup bg4 = new ButtonGroup();
	ButtonGroup bg5 = new ButtonGroup();
	
	
	//add button group
	bg1.add(option1);
	bg1.add(option2);
	bg1.add(option3);
	bg1.add(option4);
	
	bg2.add(option5);
	bg2.add(option6);
	bg2.add(option7);
	bg2.add(option8);
	
	bg3.add(option9);
	bg3.add(option10);
	bg3.add(option11);
	bg3.add(option12);
	
	bg4.add(option13);
	bg4.add(option14);
	bg4.add(option15);
	bg4.add(option16);

	bg5.add(option17);
	bg5.add(option18);
	bg5.add(option19);
	bg5.add(option20);

	
	
	//home submit set bounds
	home.setBounds(200,10,100,30);
	submit.setBounds(350,10,100,30);
	
	//field_setbounds
	QuestionLabel1.setBounds(10,40,30,30);
	QuestionLabel2.setBounds(10,180,30,30);
	QuestionLabel3.setBounds(10,300,30,30);
	QuestionLabel4.setBounds(10,430,30,30);
	QuestionLabel5.setBounds(10,560,30,30);
    
	
	//options set bounds
	o1.setBounds(85,65,250,30);
	o2.setBounds(85,95,250,30);
	o3.setBounds(85,125,250,30);
	o4.setBounds(85,155,150,30);
	
	o5.setBounds(85,195,250,30);
	o6.setBounds(85,225,250,30);
	o7.setBounds(85,255,250,30);
	o8.setBounds(85,285,250,30);
	
	o9.setBounds(85,325,250,30);
	o10.setBounds(85,355,250,30);
	o11.setBounds(85,385,250,30);
	o12.setBounds(85,415,250,30);
	
	o13.setBounds(85,455,250,30);
	o14.setBounds(85,485,250,30);
	o15.setBounds(85,515,250,30);
	o16.setBounds(85,545,250,30);
	
	o17.setBounds(85,585,250,30);
	o18.setBounds(85,615,250,30);
	o19.setBounds(85,645,250,30);
	o20.setBounds(85,675,250,30);
	
	
	
	
	
	//question set bounds
	question1.setBounds(70,40,600,10+20);
	question2.setBounds(70,180,600,10+20);
	question3.setBounds(70,300,600,10+20);
	question4.setBounds(70,430,400,10+20);
	question5.setBounds(70,560,500,10+20);
	
	
	//option set bounds
	option1.setBounds(65,60,20,20+20);
	option2.setBounds(65,90,20,20+20);
	option3.setBounds(65,120,20,20+20);
	option4.setBounds(65,150,20,20+20);
	
	option5.setBounds(65,190,20,20+20);
	option6.setBounds(65,220,20,20+20);
	option7.setBounds(65,250,20,20+20);
	option8.setBounds(65,280,20,20+20);
	
	option9.setBounds(65,320,20,20+20);
	option10.setBounds(65,350,20,20+20);
	option11.setBounds(65,380,20,20+20);
	option12.setBounds(65,410,20,20+20);
	
	option13.setBounds(65,450,20,20+20);
	option14.setBounds(65,480,20,20+20);
	option15.setBounds(65,510,20,20+20);
	option16.setBounds(65,540,20,20+20);
    	
	option17.setBounds(65,580,20,20+20);
	option18.setBounds(65,610,20,20+20);
	option19.setBounds(65,640,20,20+20);
	option20.setBounds(65,670,20,20+20);	
	//add button
	this.add(home);
	this.add(submit);
	//add quetion label
	add(QuestionLabel1);
	add(QuestionLabel2);
	add(QuestionLabel3);
	add(QuestionLabel4);
	add(QuestionLabel5);
	
	//add question
	add(question1);
	add(question2);
	add(question3);
	add(question4);
	add(question5);
	
	//add radio button
	add(option1);
	add(option2);
	add(option3);
	add(option4);
	
	add(option5);
	add(option6);
	add(option7);
	add(option8);
	
	add(option9);
	add(option10);
	add(option11);
	add(option12);
	
	add(option13);
	add(option14);
	add(option15);
	add(option16);

	add(option17);
	add(option18);
	add(option19);
	add(option20);

 //add option 
	
	add(o1);
	add(o2);
	add(o3);
	add(o4);
	
	add(o5);
	add(o6);
	add(o7);
	add(o8);
	
	add(o9);
	add(o10);
	add(o11);
	add(o12);
	
	add(o13);
	add(o14);
	add(o15);
	add(o16);
	
	add(o17);
	add(o18);
	add(o19);
	add(o20);
	
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,1200);
   setVisible(true);
	
	
	
	
}

public void  actionPerformed (ActionEvent  c)
{
	int total = 0;
	 if (c.getSource() == home)
	 {
		 
		 setVisible(false);
		 UserAccount v = new UserAccount ();
		 
	 }
	 else if (c.getSource() == submit)
	 {
		/* 
		if(o3.isSelected())
			total = total + 1;
		
          if(o7.isSelected())
            total = total + 1;
       if(o12.isSelected())
            total = total + 1;
         if (o13.isSelected())
            total = total + 1;
          if(o20.isSelected()){
		  total = total + 1	}	;
		String a = Integer.toString(a);*/
  JOptionPane.showMessageDialog(null,"you have scored 4");		
		 
		 
		 
	 }
	
}





}