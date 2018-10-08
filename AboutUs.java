import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class  AboutUs extends JFrame  {


JLabel a,b,c,d ;
JButton cancel;

public AboutUs ()
{
		super("AboutUs");
setLayout(null);

getContentPane().setBackground(Color.getHSBColor(0.44f,1.0f,0.8f));
a = new JLabel("FreeOnlineTest.in website");
b = new JLabel("Contact No : 01633334444 ");
c = new JLabel("Email : shamim@aiub.com ");
d = new JLabel("Good Luck!! ");


a.setBounds(250,100,250,20);
b.setBounds(250,140,250,20);
c.setBounds(250,140+40,250,20);
d.setBounds(250,180+40,250,20);

a.setFont(new Font("Arial",Font.BOLD,16));
b.setFont(new Font("Arial",Font.BOLD,16));
c.setFont(new Font("Arial",Font.BOLD,16));
d.setFont(new Font("Arial",Font.BOLD,16));


ImageIcon resetImage=new ImageIcon("resetImage.png");
this.cancel =new JButton("Go Back",resetImage);
cancel.setBounds(300,400,150,30);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setSize(700,600);
   setVisible(true);
   

add(a);
add(b);
add(c);
add(d);
//this.add(cancel);
}
}