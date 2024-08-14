import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
public class check extends JFrame implements ActionListener
{
JButton btnshow[]=new JButton[30];

  public check()
  {
  setLayout(null);
  setVisible(true);
  setSize(2000,2000);
  int i;
  for(i=0;i<=20;i++)
  {
	  btnshow[i]=new JButton();
  }
       int x=0,y=0;
	  for(i=0;i<=20;i++)
	  { 
	      if(i<=5)
		  {
		  btnshow[i].setBounds(50+x,300,60,40);
		  x=x+65;
		  add(btnshow[i]);
		  }
		  else
		  {
		  y=y+50;
		  }
	   }
	   }
	   
	   	  public void actionPerformed(ActionEvent e)
	  {
	  }
	  
	  public static void main(String args[])
	  {
		  check obj=new check();
	  }
}