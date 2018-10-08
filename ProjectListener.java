
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.sql.*;



public class ProjectListener implements  ActionListener{
	
	
	
	public void  actionPerformed (ActionEvent  online)
	{
		
		//Home :home,login,aboutus,registration
		
		if (online.getSource() == home )
		{  
	        
			
			
	       JOptionPane.showMessageDialog(null,"Follow The Instruction");
		   
		   Home home = new Home ();
		   
		   
		}
		else if(online.getSource() == register )
		{
			JOptionPane.showMessageDialog(null,"Follow The Instruction");
			//dispose ();
			RegisterForm form = new RegisterForm();
		    //from.setVisible(true);
			
			
		}
		
		else if (online.getSource() == Login )
		{  
	        
			
			
	       
		   JOptionPane.showMessageDialog(null,"Follow The Instruction");
		   Login log = new Login ();
		   
		   
		}
		
		
		else if (online.getActionCommand.equals ("AboutUs") )
		{  
	        
			
			
	       
		   JOptionPane.showMessageDialog(null,"we are beiginner");
		   
		   
		   
		}
        


/*
       //login: submit,clear
	   
       else if(online.getSource() == submit )
	   {
		   
		 String dsql="SELECT * FROM `user` WHERE userName='"+t1.getText()+"'";
			try{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(dsql);
				
				
			   }
			catch(SQLException g){
				JOptionPane.showMessageDialog(this,"Wrong Username or Password");
			}
			catch(Exception eq){
				JOptionPane.showMessageDialog(this,"Wrong Username or Password");
			}  
		   
		   
	   }
*/	   
		
	}


	
	
	
	
	
	
	
	
}