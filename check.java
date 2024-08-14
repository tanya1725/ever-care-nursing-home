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
  int j,i;
  for(j=0;j<=20;j++)
  {
	 btnshow[j]=new JButton();
  }
       int x=0,y=0;
	   for(i=0;i<4;i++)
	    { 
       for(j=i;j<=5;j++)
	    {
		  btnshow[j].setBounds(50+x,300+y,60,40);
		  x=x+65;
		  add(btnshow[j]);
	    }
	      y=y+50;
		  add(btnshow[j]);
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