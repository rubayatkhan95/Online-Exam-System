import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.image.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame implements ActionListener {
 

private JLabel background = new JLabel(new ImageIcon("image.jpg"));
JLabel text;

 JButton login;
 JButton register;
 JButton aboutus;
public Home () {
	
	super("Online Exam");
	setLayout(null);
	//getContentPane().setBackground(Color.getHSBColor(0.56f,1.0f,0.8f));
	this.setContentPane(background);

	


        ImageIcon loginImage=new ImageIcon("loginImage.png");
		ImageIcon registerImage=new ImageIcon("registerImage.png");
		
		ImageIcon aboutusImage=new ImageIcon("aboutusImage.png");
	
		
		
		
		
	
		text =new JLabel("Online Test");
		text.setBounds(250,10,200,40);
		
		text.setFont(new Font("Serif",Font.BOLD,24));
		text.setForeground(Color.white);
		add(text);
		
 
	
	
	this.login = new JButton("login",loginImage);
		
	this.register= new JButton("register",registerImage);
	aboutus = new JButton ("AboutUs",aboutusImage);
	
	
	//setFont
	
	login.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	register.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	aboutus.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	//setBounds
   
   login.setBounds(270,170,120,50);
   register.setBounds(270,70+170,120,50);
   aboutus.setBounds(270,70+250,120,50);
   
   
   //actionlistener
   
   	aboutus.addActionListener(this );
   	register.addActionListener(this );
   	login.addActionListener(this );
	
	
	
   //add
   
   this.add(login);
   this.add(register);
   this.add(aboutus);
   
   
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,600);
   setVisible(true);
   //setResizable(false);
  
	
} 
public void  actionPerformed (ActionEvent  online)
{
	
	
		
		if(online.getSource() == register )
		  {
		  	  //JOptionPane.showMessageDialog(null,"Follow The Instruction");
			
			  RegisterForm form = new RegisterForm();
		     
			
			
		  }
		
		else if (online.getSource() == login )
		  {  
	      
			//JOptionPane.showMessageDialog(null,"login");
		     Login log = new Login ();
		  }
		
		
		else if (online.getSource() == aboutus )
		  {  
	        
			
		     AboutUs we = new AboutUs();
		    
		   
		  }
	
	
}





}