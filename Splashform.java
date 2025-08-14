import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
public class Splashform extends JFrame implements ActionListener
{
JLabel lblname=new JLabel("NURSING   HOME   MANAGEMENT   SYSTEM");
JLabel lblby=new JLabel("DEVELOPED BY:");
JLabel lblbyname=new JLabel("NILU  GORAI");
JButton btnok=new JButton("CANCEL");
JLabel lbldivide=new JLabel();
JLabel lblbackground=new JLabel();
JLabel lblenrollment=new JLabel("ROLL NO.");
JLabel lblno=new JLabel("213204112938");
JLabel lblbatch=new JLabel("BATCH ");
JLabel lblbatchno=new JLabel("2021-2024");
JLabel lbllogo=new JLabel(new ImageIcon("images/jwulogo.jpg"));


  public Splashform()
  {

  setTitle("SPLASH FORM...");
  setLayout(null);
  setVisible(true);
  setSize(500, 400);
  setLocationRelativeTo(null);  
  
  lbllogo.setBounds(0,0,500,120);
  lblname.setBounds(30,20,1800,40);
  lblbackground.setBounds(0,120,500,280);
  lblenrollment.setBounds(50,190,200,40);
  lblno.setBounds(200,190,200,40);
  lblenrollment.setFont(new Font("Arial",Font.BOLD,15));  
   lblno.setFont(new Font("Arial",Font.BOLD,15));  
   lblbatch.setBounds(50,240,200,40);
   lblbatch.setFont(new Font("Arial",Font.BOLD,15));  
   lblbatchno.setBounds(200,240,200,40);
   lblbatchno.setFont(new Font("Arial",Font.BOLD,15));  
  lbldivide.setBounds(0,125,500,1);
  lbldivide.setOpaque(true);
  lbldivide.setBackground(new Color(104,205,155));

  lblby.setBounds(50,140,150,40);
lblby.setFont(new Font("Arial",Font.BOLD,15));  
lblbyname.setBounds(200,140,950,40);
lblbyname.setFont(new Font("Arial",Font.BOLD,15));  

  btnok.setBounds(370,310,100,40);
  lblbackground.setOpaque(true);
  lblbackground.setBackground(new Color(255,255,255));
  
  
  lblname.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,20));
// lblby.setFont(new Font("Courier New",Font.BOLD,25));
 // lblbyname.setFont(new Font("Courier New",Font.BOLD,25));
 // setBackground(new Color(255,255,255));
 // add(lblname);
  add(lblby);
 add(lbldivide);
  add(lblbyname);
   // add(lblenrollment);
    add(lblbatch);
    add(lblbatchno);
  //add(lblno);
  add(lblbackground);

  add(btnok);
  setBackground(new Color(255,255,255));
  add(lbllogo);
  btnok.addActionListener(this);
  
  }
  public void actionPerformed(ActionEvent e)
  {
	  if(e.getSource()==btnok)
	  {
		 
		  this.dispose();
	  }
  }
  

}