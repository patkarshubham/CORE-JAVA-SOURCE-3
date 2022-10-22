import javax.swing.*;
import java.awt.*;
class LoginForm extends JFrame
{
 JLabel la1=new JLabel("USER ID");
 JLabel la2=new JLabel("PASSWORD");
 JTextField tb1=new JTextField();
 JPasswordField tb2=new JPasswordField();
 JCheckBox cb=new JCheckBox("KEEP ME SIGNED IN...");
 JButton bt=new JButton("LOGIN");
 public LoginForm()
 {
   super("Login Form");
   setSize(800,600);
   setLocationRelativeTo(null); 
   setResizable(false);
   setDefaultCloseOperation(3); 
   addComponents();
   setVisible(true);  
 } 
 private void addComponents()
  {
    setLayout(null);
    la1.setBounds(40,30,100,30);
    add(la1);  
    tb1.setBounds(140,30,130,30);    
    add(tb1);
    la2.setBounds(40,90,100,30);
    add(la2);
    tb2.setBounds(140,90,130,30);    
    add(tb2);
    cb.setBounds(40,150,200,30);
    add(cb);
    bt.setBounds(180,210,80,30);
    add(bt);
   }
public static void main(String []args)
{
  new LoginForm();
}
}