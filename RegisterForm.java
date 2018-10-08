import java.sql.*;
import javax.swing.JRadioButton;
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
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;

public class RegisterForm  extends JFrame implements ActionListener{

JRadioButton m,f;
JLabel register,name,email,password,cpassword,address,gender,male,female;

JTextField namefield,emailfield,addressfield,g;

JPasswordField passwordfield,cpasswordfield;

JButton submit,reset,home;
ButtonGroup sg;
JLabel background = new JLabel(new ImageIcon("image3.jpg"));

User b;

public RegisterForm () {
	
	super("Register Form");
	setLayout(null); 
	
	
	//background image 
	
	getContentPane().setBackground(Color.getHSBColor(0.44f,1.0f,0.8f));
	this.setContentPane(background);
	
	//radio button
	sg = new ButtonGroup();
	m= new JRadioButton();
	f= new JRadioButton();
	sg.add(m);
	sg.add(f); 
	
    //Label	
	gender = new      JLabel("Gender                         :");
	male = new JLabel ("Male");
	female = new JLabel ("Female");
	
	
	
	register = new JLabel     ("Registration Form");
	
	name = new JLabel     ("Name                            :");
	email = new JLabel    ("Email                            :");
	password = new JLabel ("Password                   :");
    cpassword = new JLabel("Confirm_Password  :");
	address = new JLabel  ("Address                      :");
	
	
	
	//set font
	register.setFont(new Font("Serif",Font.BOLD,24));
	name.setFont(new Font("Arial",Font.BOLD,12));
	email.setFont(new Font("Arial",Font.BOLD,12));
	password.setFont(new Font("Arial",Font.BOLD,12));
	cpassword.setFont(new Font("Arial",Font.BOLD,12));
	address.setFont(new Font("Arial",Font.BOLD,12));
	
	
	
	//Field
    namefield = new JTextField (50);
	emailfield = new JTextField (50);
	passwordfield = new JPasswordField (50);
	cpasswordfield = new JPasswordField(50);
	addressfield = new JTextField (50);
	g= new JTextField();
	
	//set image icon
	ImageIcon homeImage=new ImageIcon("homeImage.png");
	ImageIcon submitImage=new ImageIcon("submitImage.png");
    ImageIcon resetImage=new ImageIcon("resetImage.png");
	
	
	//Button
	
	home = new JButton ("Home",homeImage);
	submit = new JButton ("Submit",submitImage);
	reset =new JButton("Reset",resetImage);
	

	//label setBounds
	
	
	register.setBounds(250,10,200,30);
	
	name.setBounds(50,100,120,25);
	email.setBounds(50,100+35,120,25);
	password.setBounds(50,135+35,120,25);
	cpassword.setBounds(50,170+35,120,25);
	gender.setBounds(50,250,120,20);
	address.setBounds(50,300,120,25);
	male.setBounds(250,250,30,20);
	female.setBounds(350,250,50,25);

	
	
	
	
	
	
	//textfield setBounds
	namefield.setBounds(220,100,300,20);
	emailfield.setBounds(220,100+35,300,20);
	passwordfield.setBounds(220,135+35,300,20);
	cpasswordfield.setBounds(220,170+35,300,20);
	addressfield.setBounds(220,310,300,50);
	
	
	
	//button setBounds
	submit.setBounds(210,400,100,30);
	reset.setBounds(210+150,400,100,30);
	home.setBounds(285,450,100,40);
	
	
	// set bounds to radio button
		m.setBounds(220,250,20,20);
	    f.setBounds(320,250,20,20);
	
	//label add	
	add(gender);
	add(register);
	add(name);
	add(email);
	add(password);
	add(cpassword);
	add(male);
	add(female);
	add(address);
	
	//field add
	add(namefield);
	add(emailfield);
	add(passwordfield);
	add(cpasswordfield);
	add(addressfield);
	add(g);
	
	//actionlistener
	submit.addActionListener(this);
	reset.addActionListener(this);
	home.addActionListener(this);
	
	
	
	//button add
	this.add(home);
	this.add(submit);
	this.add(reset);
	this.add(m);
	this.add(f);
	
	
	
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,600);
   setVisible(true);
   
   
  
   }

public void  actionPerformed (ActionEvent  reg)
{
	    //password
        String p1=new String(passwordfield.getPassword());
		String p2=new String(cpasswordfield.getPassword());	
	    //....
		
	    
	    if(reg.getSource() == submit)
		{
			
			if(namefield.getText().isEmpty() || emailfield.getText().isEmpty() || p2.isEmpty() || p1.isEmpty() || addressfield.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(null,"You need to fill up the blank");
	      
	
	        }
			else if(p1.equals(p2))
			{
		    
				if(m.isSelected()){
					
					 g.setText("male");
				}else{
					
                    g.setText("female");				
				}
			
			String information = "INSERT INTO `exam`.`register` (`User_ID`, `Name`, `Email`, `Password`, `Gender`, `Address`) VALUES (NULL,'"+namefield.getText()+"', '"+emailfield.getText()+"', '"+p2+"', '"+g.getText()+"', '"+addressfield.getText()+"')";
			try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
					Statement stmt=con.createStatement();
					stmt.executeUpdate(information);
					
				}
				
				catch(SQLException g){
					JOptionPane.showMessageDialog(this,"Username Already in Use");
					
				}
				catch(Exception eq){
				
				}
				JOptionPane.showMessageDialog(null,"Registration complete");
				setVisible(false);
				Home l2 = new Home();	
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Password Doesn't match");
			}
			
		}
		 
		
		
		
		
		
		
		
	   else if(reg.getSource() == reset)
	   {
		   setVisible(false);
		   
		   RegisterForm rereg = new RegisterForm ();
	   }
	   
	   else if(reg.getSource() == home)
	   {
		   setVisible(false);
		   
		   Home h = new Home (); 
		   
	   }
	
}




}