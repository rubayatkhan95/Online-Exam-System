import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.image.*;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  
import java.awt.*;


public class UserAccount extends JFrame implements ActionListener {
 JComboBox box ;
 String [] examTopic ={"C++","java","Physics","Mathematics"};
 
 JLabel text,topic;
 JLabel background = new JLabel(new ImageIcon("image10.jpg"));

 JButton start,result,logout,profile;
 int counter;
Timer timer;


public UserAccount () {
	
	super("Online Exam");
	setLayout(null);
	//getContentPane().setBackground(Color.getHSBColor(0.56f,1.0f,0.8f));
	this.setContentPane(background);

	box = new JComboBox(examTopic);
	box.setBounds(50,170,170,50);
	this.add(box);

     
        ImageIcon logoutImage=new ImageIcon("logoutImage.png");
		ImageIcon startImage=new ImageIcon("startImage.png");
		ImageIcon profileImage=new ImageIcon("userImage.png");
		//ImageIcon deleteImage=new ImageIcon("deleteImage.png");
		ImageIcon resultImage=new ImageIcon("resultImage.png");
	
		
		
		
		
	
	text = new JLabel("Hello User");
	topic = new JLabel("Select Topic :");

    text.setFont(new Font("Comic Sans MS",Font.BOLD,24));
	text.setForeground(Color.white);
	 topic.setFont(new Font("Comic Sans MS",Font.BOLD,17));
	topic.setForeground(Color.white);
		
 
	
	//this.home = new JButton ("Add Topic",homeImage);
	this.start = new JButton ("Start exam",startImage);
	this.logout = new JButton("Logout",logoutImage);
		
	this.result= new JButton("See Results",resultImage);
	this.profile = new JButton ("Profile",profileImage);
	
	
	//setFont
	//home.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	logout.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	start.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	result.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	//addq.setFont(new Font("Comic Sans MS",Font.BOLD,12));
	
	
	
	//setBounds
    this.profile.setBounds(400,170,170,50);
    start.setBounds(50,170+70,170,50);
    result.setBounds(400,170+70,170,50);
    topic.setBounds(50,100,180,40);
    logout.setBounds(540,500,100,30);
	text.setBounds(270,20,200,30);
   
   
   
	//actionListener
	this.start.addActionListener(this);
	this.profile.addActionListener(this);
	this.result.addActionListener(this);
	this.logout.addActionListener(this);
	this.box.addActionListener(this);
   //add
   this.add(profile);
   this.add(logout);
   this.add(result);
   this.add(start);
   this.add(topic);
   this.add(text);
   
   
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,600);
   setVisible(true);
   //setResizable(false);
  
	
} 

public void actionPerformed(ActionEvent u)
{
	
	if (u.getSource() == start)
	{
		String topic = box.getSelectedItem().toString();
		if(topic.equals ("C++"))
		{
			
	    setVisible(false);
		/*
		int count =60;
		String b=Integer.toString(count);
		
		c.showtime.setText(b);
		TimeClass tc = new TimeClass(count);
		timer = new Timer (1000,tc);
		timer.start();
		
		*/
		CPPQuestion cc = new CPPQuestion ();
		}
		
		else if(topic.equals ("java"))
		{   
	        setVisible(false);
			JAVAQuestion java = new JAVAQuestion();
		}
		else{
			JOptionPane.showMessageDialog(null,"on processing,Try another one");
		}
	
	}
	else if(u.getSource() == logout)
	{
		setVisible(false);
		Home newhome = new Home();
		
		
	}
	else if(u.getSource() ==  result)
	{
		
		JOptionPane.showMessageDialog(null,"on process");
		
	}
	else if(u.getSource() == profile)	
	{
		setVisible(false);
		Profile newprofile = new Profile();
		
		
		
	}
	
	
}

/*public class TimeClass implements ActionListener{
	int counter;
	public TimeClass (int counter)
	{
		this.counter = counter ;
		
		
	}
	public void actionPerformed(ActionEvent tc)
	{
		
		counter--;
		String b=Integer.toString(counter);
		if (counter >= 1)
		{
			
		c.showtime.setText(b);	
		}else{
			timer.stop();
			//Toolkit.getDefaultToolkit().beep();
		}
	}
}*/


}