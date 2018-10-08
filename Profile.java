
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.image.*;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Profile  extends JFrame implements ActionListener{


JLabel register,name,email,password,cpassword,address,gender,male,female;

JLabel namefield,emailfield,addressfield,genderfield;



JButton submit,reset,result;
JLabel background = new JLabel(new ImageIcon("image3.jpg"));

public Profile () {
	
	super("Profile");
	setLayout(null); 
	
	
	//background image 
	
	//getContentPane().setBackground(Color.getHSBColor(0.44f,1.0f,0.8f));
	this.setContentPane(background);
	
	
	
	
	
    //Label	
	
	
	register = new JLabel     ("Profile");
	name = new JLabel     ("Name       :");
	email = new JLabel    ("Email       :");
	gender = new      JLabel("Gender    :");
    address = new JLabel  ("Address     :");
	
	
	
	//set font
	register.setFont(new Font("Serif",Font.BOLD,30));
	name.setFont(new Font("Arial",Font.BOLD,16));
	email.setFont(new Font("Arial",Font.BOLD,16));
	gender.setFont(new Font("Arial",Font.BOLD,16));
    address.setFont(new Font("Arial",Font.BOLD,16));
	
	register.setForeground(Color.white);
	name.setForeground(Color.white);
	gender.setForeground(Color.white);
	email.setForeground(Color.white);
	address.setForeground(Color.white);

	//Field
    namefield = new JLabel ("Name field");
	emailfield = new JLabel ("email");
	genderfield = new JLabel ("gender");
	addressfield = new JLabel ("Address");
	
	
	//set image icon
	ImageIcon resultImage=new ImageIcon("resultImage.png");
	ImageIcon submitImage=new ImageIcon("logoutImage.png");
	ImageIcon resetImage=new ImageIcon("resetImage.png");
	
	
	//Button
	
	this.result = new JButton ("Results",resultImage);
	this.submit = new JButton ("logout",submitImage);
	this.reset =new JButton("Go Back",resetImage);
	

	//label setBounds
	
	
	register.setBounds(300,10,200,30);
	
	name.setBounds(50,100,120,25);
	email.setBounds(50,100+45,120,25);
	
	gender.setBounds(50,145+45,120,20);
	address.setBounds(50,190+50,120,25);
	

	
	
	//textfield setBounds
	
	namefield.setBounds(220,105,300,20);
	emailfield.setBounds(220,100+50,300,20);
	genderfield.setBounds(220,145+45,300,20);
	addressfield.setBounds(220,230,300,60);
	
	//button setBounds
	reset.setBounds(200,400,110,30);
	result.setBounds(210+150,400,120,30);
	submit.setBounds(540,500,100,30);
	
	
	
	
	//label add
	
	
	add(gender);
	add(register);
	add(name);
	add(email);
	
	add(address);
	
	//field add
	add(namefield);
	add(emailfield);
	add(genderfield);
	add(addressfield);
	
	
	
	//button add
	this.add(result);
	this.add(submit);
	this.add(reset);
	//add(m);
	//add(f);
	result.addActionListener(this);
	submit.addActionListener(this);
	reset.addActionListener(this);
	
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,600);
   setVisible(true);
   
   
  
   }

public void  actionPerformed (ActionEvent  p)
{
	if(p.getSource() == result)
	{
		
	}
		
	else if(p.getSource () == reset)
	{
		UserAccount a = new UserAccount();
		
	}
	else if(p.getSource() == submit)
	{
		Home h = new Home ();
		
	}
}




}