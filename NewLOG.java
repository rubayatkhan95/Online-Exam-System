import java.sql.*;
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


public class NewLOG  extends JFrame implements ActionListener{


JLabel title,name,password;

JTextField namefield;
JPasswordField passwordfield;


JButton submit;
Profile g = new Profile();

public NewLOG () {
	
	super("Login Page");
	setLayout(null); 
	

	
	title = new JLabel     ("Sign In");
	name = new JLabel     ("Email       :");
	password = new JLabel    ("Pasword       :");
	
	
	title.setFont(new Font("Serif",Font.BOLD,30));
	name.setFont(new Font("Arial",Font.BOLD,16));
	password.setFont(new Font("Arial",Font.BOLD,16));
	
	
	/*register.setForeground(Color.white);
	name.setForeground(Color.white);
	gender.setForeground(Color.white);
	email.setForeground(Color.white);
	address.setForeground(Color.white);
	*/

	//Field
    namefield = new JTextField (50);
	passwordfield = new JPasswordField (50);
	
	
	
	
	//Button
	
	
	this.submit = new JButton ("login");
	
	//label setBounds
	
	
	title.setBounds(300,10,200,30);
	
	name.setBounds(50,100,120,25);
	password.setBounds(50,100+45,120,25);
	

	
	
	//textfield setBounds
	
	namefield.setBounds(220,105,300,20);
    passwordfield.setBounds(220,100+50,300,20);
	
	//button setBounds

	submit.setBounds(300,250,100,30);
	
	
	
	
	//label add
	
	
	
	add(title);
	add(name);
	add(password);
	
	
	
	//field add
	add(namefield);
	add(passwordfield);
	
	
	
	
	//button add
	
	this.add(submit);
	
	
	
	submit.addActionListener(this);
	
	
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,600);
   setVisible(true);
   
   
  
   }

public void  actionPerformed (ActionEvent  p)
{      

	
        String p1=new String(passwordfield.getPassword());
		
		String p2= new String (namefield.getText());
	    String a = "Admin@gmail.com";
	    int b = 1234;
	    String k = Integer.toString(b);
	    
	/*int j=4321;
	 String x= Integer.toString(j);
	String m ="shamim@gmail.com";
	 if(p1.equals(x) && p2.equals(m))
	{
		setVisible(false);
							UserAccount u = new UserAccount();
	}
	 */ 
		if (p.getSource()== submit) {
		String dsql="SELECT * FROM `register` WHERE Email='"+p2+"'";
		System.out.println(dsql);
		try{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","");
					Statement stmt=con.createStatement();
					ResultSet rs = stmt.executeQuery(dsql);
					if(rs.next()){
						
						if(p1.equals(rs.getString(3)))
						{   
					
					
					        
							setVisible(false);
							UserAccount u = new UserAccount();
						}
						else{
							JOptionPane.showMessageDialog(null,"invalid password");
						}
					
				}
				
				else{
							JOptionPane.showMessageDialog(null,"invalid email");
						}
				
				
				
		
		
	
		}catch(SQLException g){
			g.printStackTrace();
					JOptionPane.showMessageDialog(this,"invalid information");
					
				}
				catch(Exception eq){
				
				}
				}

				
				
}

}


