import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Login extends JFrame implements  ActionListener{

JButton User,Admin,home;
JLabel text;
JLabel background = new JLabel(new ImageIcon("image2.jpg"));



public Login () {
	
	
	super("Login");
	setLayout(null);
	getContentPane().setBackground(Color.getHSBColor(0.86f,1.0f,0.8f));
	
	this.setContentPane(background);
	
	
	//set image icon
	ImageIcon homeImage=new ImageIcon("homeImage.png");
	ImageIcon userImage=new ImageIcon("userImage.png");
	ImageIcon adminImage=new ImageIcon("adminImage.png");
	
	home = new JButton ("Home",homeImage);
	User = new JButton ("User",userImage);
	Admin = new JButton ("Admin",adminImage);
	text = new JLabel("Login");
	text.setForeground(Color.white);
	
	//setBounds button
	 home.setBounds(550,20,100,40);
	 User.setBounds(250,90,150,50);
     Admin.setBounds(250,150,150,50);
	 text.setBounds(290,220,250,50);
	 
	//setfont
	home.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	User.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	Admin.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	text.setFont(new Font("Arial",Font.BOLD,26));
	
	
	//actionListener
	
	home.addActionListener(this);
	User.addActionListener(this);
	Admin.addActionListener(this);
	//add
	this.add(home);
	this.add(User);
	this.add(Admin);
	
	add(text);
	
	  
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,600);
   setVisible(true);
	
}
public void  actionPerformed(ActionEvent  l)
{
	 if(l.getSource() == home)
	   {
		   setVisible(false);
		   
		   Home h = new Home (); 
		   
	   }
	  else if (l.getSource () == User)
	{
		
		setVisible(false);
	
	  
		NewLOG e = new NewLOG();
		
		
	
	   // UserAccount e = new UserAccount ();
		
	}
	
	
	else if(l.getSource() == Admin)
	   {
		   
		   setVisible(false);
		   
		   NewLOG e = new NewLOG(); 
		   
	   }
	
	
}




}