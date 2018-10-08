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

 class L  extends JFrame implements ActionListener {
	
	
	
	JLabel title,name,password;
	JTextField fname,fpassword;
	JButton login;
	
	
	public L()
	{   
	super("Login page");
	setLayout(null);
		getContentPane().setBackground(Color.getHSBColor(0.44f,1.0f,0.8f));
	title = new JLabel     ("Sign in Here :");
	name = new JLabel     ("Username :");
	password = new JLabel    ("Password    :");
		
	//title.setFont(new Font("Serif",Font.BOLD,24));
	//name.setFont(new Font("Arial",Font.BOLD,12));
	//password.setFont(new Font("Arial",Font.BOLD,12));
		
	fname = new JTextField (50);
	fpassword = new JTextField (50);
	
	login= new JButton ("Login");
	
	title.setBounds(250,10,200,30);
	name.setBounds(50,100,120,25);
	password.setBounds(50,100+35,120,25);
	fname.setBounds(220,100,300,20);
	fpassword.setBounds(220,100+35,300,20);
	login.setBounds(300,300,100,40);

	//event e = new event(this);
 login.addActionListener(this);	
	add(name);
    add(password);	
	add(fname);
	add(fpassword);
	add(login);
	add(title);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(700,600);
    setVisible(true);
		
	}
	//public class event implements ActionListener{
	public void actionperformed(ActionEvent e)
	{
		if(e.getSource() == login)
		{
			
			//if()
		}
	}
	//}	
}