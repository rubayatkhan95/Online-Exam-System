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

public class AdminAccount extends JFrame implements ActionListener {
 
 JLabel text;
 JLabel background = new JLabel(new ImageIcon("image8.jpg"));

 JButton home,addq,delete,update,logout;
 
public AdminAccount () {
	
	super("Online Exam");
	setLayout(null);
	//getContentPane().setBackground(Color.getHSBColor(0.56f,1.0f,0.8f));
	this.setContentPane(background);

	

     
        ImageIcon logoutImage=new ImageIcon("logoutImage.png");
		ImageIcon addImage=new ImageIcon("addImage.png");
		//ImageIcon homeImage=new ImageIcon("homeImage.png");
		ImageIcon deleteImage=new ImageIcon("deleteImage.png");
		ImageIcon updateImage=new ImageIcon("updateImage.png");
	
		
		
		
		
	
	text = new JLabel("Welcome Admin");

    text.setFont(new Font("Comic Sans MS",Font.BOLD,24));
	text.setForeground(Color.white);
		
 
	
	//this.home = new JButton ("Add Topic",homeImage);
	this.addq = new JButton ("Add Question",addImage);
	this.logout = new JButton("Logout",logoutImage);
		
	this.delete= new JButton("Delete Question",deleteImage);
	this.update = new JButton ("Update Question",updateImage);
	
	
	//setFont
	//home.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	logout.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	delete.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	update.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	addq.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	//setBounds
  // home.setBounds(270,70,120,50);
   addq.setBounds(270,170,180,50);
   update.setBounds(270,70+170,180,50);
   delete.setBounds(270,70+250,180,50);
    logout.setBounds(540,500,100,30);
	text.setBounds(270,20,200,30);
   
   
   /*
   
   	aboutus.addActionListener(new ProjectListener() );
   	register.addActionListener(new ProjectListener() );
   	login.addActionListener(new ProjectListener() );
	home.addActionListener(new ProjectListener() );
	
	*/
   //add
  //this.add(home);
   this.add(logout);
   //this.add(delete);
   this.add(addq);
   this.add(update);
   this.add(text);
   
   logout.addActionListener(this);
   //delete.addActionListener(this);
   update.addActionListener(this);
   addq.addActionListener(this);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,600);
   setVisible(true);
   //setResizable(false);
  
	
} 

public void  actionPerformed(ActionEvent  l)
{
	if(l.getSource()== addq)
	{
		//ques n = new ques();
		JOptionPane.showMessageDialog(null,"on processing");
	}
	else if (l.getSource() == update)
	{    
     JOptionPane.showMessageDialog(null,"on process");
		
	}
   else if(l.getSource() == logout)
{
	setVisible(false);
	Login a = new Login ();
}

}


}