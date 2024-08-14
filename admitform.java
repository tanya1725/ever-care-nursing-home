import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class admitform extends JFrame implements ActionListener
{

JLabel lbldivide=new JLabel();
JLabel lblpersonal=new JLabel("PERSONAL DETAILS");

JLabel lblacadmic=new JLabel("ACADMIC DETAILS");

JLabel lblpid=new JLabel("patient id:");
JTextField txtpid=new JTextField(15);

//JLabel lbllogo=new JLabel(new ImageIcon("images/nursingback.jpg"));
JLabel lblaid=new JLabel("Admit id:");
JTextField txtaid=new JTextField(15);

JLabel lbldoa=new JLabel("Date of admit:");
JTextField txtdoa=new JTextField(15);

JLabel lblcontact=new JLabel("contact no.:");
JTextField txtcontact=new JTextField(15);

JLabel lbldiagnosed=new JLabel("Diagnosed for:");
JTextField txtdiagnosed=new JTextField(15);

JLabel lblrefered=new JLabel("Refered by:");
JTextField txtrefered=new JTextField(15);

JLabel lblds=new JLabel("Document submission:");
JTextField txtds=new JTextField(15);

JLabel lblcs=new JLabel("Current status:");
JTextField txtcs=new JTextField(15);

JLabel lblbed=new JLabel("Bed Allocated:");
JTextField txtbed=new JTextField(15);

JLabel lblname=new JLabel(" patient name:");
JTextField txtname=new JTextField(15);

JLabel lblheading =new JLabel("ADDMISSION FORM");
JLabel lblleft=new JLabel();
JLabel lblright=new JLabel();

JButton btnnew=new JButton("NEW");
JButton btnsave=new JButton("SAVE");
JButton btnsearch=new JButton("SEARCH");
JButton btnedit=new JButton("EDIT");
JButton btncancel=new JButton("CANCEL");
   SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
  Date dt=new Date();
  String pp1;
  public admitform(String bedno)
  	
{
	pp1=bedno;
	  setTitle("ADMIT FORM...");
      setLayout(null);
	  setVisible(true);
	  //setLocationRelativeTo(null); 
	  Dimension size=Toolkit.getDefaultToolkit().getScreenSize(); 
	  setSize(1000,1000);

     lblheading.setOpaque(true);
	setLocation(((int)size.getWidth()/2-500),((int)size.getHeight()/2-500));
	
	  lblheading.setBounds(0,0,1000,70);
	  lblheading.setHorizontalAlignment(JLabel.CENTER);
	  lblheading.setFont(new Font("Courier New",Font.BOLD,25));
	  lblheading.setBackground(new Color(13,109,147));
	  lblheading.setForeground(new Color(255,255,255));
	  //lbllogo.setBounds(0,0,1000,1000);

	  lblleft.setBounds(0,0,20,1000);
	 lblleft.setBackground(new Color(13,109,147));
	 lblright.setBounds(960,0,20,1000);
	 lblright.setBackground(new Color(13,109,147));
	 lblpersonal.setForeground(new Color(255,255,255));
	 lblacadmic.setForeground(new Color(255,255,255));

	  lblpersonal.setBounds(20,80,200,40);
	  lblpersonal.setOpaque(true);
	  lblpersonal.setHorizontalAlignment(JLabel.CENTER);
	  lblpersonal.setFont(new Font("Arial",Font.BOLD,15));
	  lblpersonal.setBackground(new Color(13,109,147));
	  
	  lblpid.setBounds(50,150,200,40);
	  lblpid.setFont(new Font("Arial",Font.BOLD,25));
	  
	  txtpid.setBounds(260,150,100,40);
	  
	  lblaid.setBounds(50,260,200,40);
	  lblaid.setFont(new Font("Arial",Font.BOLD,25));
	  txtaid.setBounds(260,260,100,40);
	  
	  lbldoa.setBounds(450,150,250,40);
	  lbldoa.setFont(new Font("Arial",Font.BOLD,25));
	  txtdoa.setBounds(710,150,150,40);
	  
	  lblcontact.setBounds(450,260,200,40);
	  lblcontact.setFont(new Font("Arial",Font.BOLD,25));
	  txtcontact.setBounds(710,260,150,40);
	  
	  lblname.setBounds(40,370,250,40);
	  lblname.setFont(new Font("Arial",Font.BOLD,25));
	  txtname.setBounds(260,370,150,40);

	  lbldivide.setBounds(0,430,1000,5);
	  lbldivide.setOpaque(true);
	  lbldivide.setBackground(new Color(13,109,147));

	  lblacadmic.setBounds(20,450,200,40);
	  lblacadmic.setOpaque(true);
	  lblacadmic.setHorizontalAlignment(JLabel.CENTER);
	  lblacadmic.setFont(new Font("Arial",Font.BOLD,15));
	  lblacadmic.setBackground(new Color(13,109,147));
	  
	  lblrefered.setBounds(520,540,200,40);
	  lblrefered.setFont(new Font("Arial",Font.BOLD,25));
	  txtrefered.setBounds(730,540,150,40);
	  
	  lblds.setBounds(50,540,300,40);
	  lblds.setFont(new Font("Arial",Font.BOLD,25));
	  txtds.setBounds(360,540,150,40);
	  
	  lblcs.setBounds(50,650,250,40);
	  lblcs.setFont(new Font("Arial",Font.BOLD,25));
	  txtcs.setBounds(310,650,150,40);
	  
	  lblbed.setBounds(500,650,250,40);
	  lblbed.setFont(new Font("Arial",Font.BOLD,25));
	  txtbed.setBounds(720,650,150,40);

	  lbldiagnosed.setBounds(450,370,250,40);
	  lbldiagnosed.setFont(new Font("Arial",Font.BOLD,25));
	  txtdiagnosed.setBounds(710,370,150,40);
	  
	  btnnew.setBounds(150,810,80,40);
	  btnnew.setBackground(new Color(13,109,147));
	   btnnew.setForeground(new Color(255,255,255));
	  btnsave.setBounds(250,810,80,40);
	   btnsave.setBackground(new Color(13,109,147));
	   btnsave.setForeground(new Color(255,255,255));
	  btnsearch.setBounds(340,810,100,40);
	   btnsearch.setBackground(new Color(13,109,147));
	   btnsearch.setForeground(new Color(255,255,255));
	  btnedit.setBounds(450,810,80,40);
	   btnedit.setBackground(new Color(13,109,147));
	   btnedit.setForeground(new Color(255,255,255));
	  btncancel.setBounds(540,810,80,40);
	   btncancel.setBackground(new Color(13,109,147));
	   btncancel.setForeground(new Color(255,255,255));
	  
	  add(lblpid);
	  add(lblaid);
	  add(lbldoa);
	  add(lblcontact);
	  add(lbldiagnosed);
	  add(lblrefered);
	  add(lblds);
	  add(lblcs);
	  add(lblbed);
	  add(lblname);
	  add(lbldivide);
	  add(lblacadmic);
	  add(lblleft);
	  add(lblright);
	  
	  add(txtpid);
	  add(txtaid);
	  add(txtdoa);
	  add(txtcontact);
	  add(txtdiagnosed);
	  add(txtrefered);
	  add(txtds);
	  add(txtcs);
	  add(txtbed);
	  add(txtname);
	  add(lblheading);
	  add(lblpersonal);
	  
	  txtbed.setText(pp1);
	  txtbed.setEditable(false);
	  txtdoa.setEditable(false);
	  txtname.setEditable(false);
	  
	  add(btnnew);
      add(btnsearch);
      add(btnedit);
      add(btnsave);
      add(btncancel);
	  //add(lbllogo);
  
  	btnnew.addActionListener(this);
	btnsave.addActionListener(this);
	btnsearch.addActionListener(this);
	btnedit.addActionListener(this);
	btncancel.addActionListener(this);
	btnsave.setEnabled(false);
	btnedit.setEnabled(false);
	txtpid.setEditable(false);
	txtaid.setEditable(false);

	}

public void actionPerformed(ActionEvent e)
{
	int ff=0,i;
	char ch;
	String s="";
	int y=0;
	if(e.getSource()==btnnew)
	{
				txtdoa.setText("");
				txtcontact.setText("");
				txtdiagnosed.setText("");
				txtrefered.setText("");
				txtds.setText("");
				txtcs.setText("");
				btnsave.setEnabled(true);
				btnedit.setEnabled(false);
				txtdoa.setText(""+sdf.format(dt));
				try
				  {
			  String wstr=JOptionPane.showInputDialog(null,"enter patient id");
			  Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
			  Statement st=con.createStatement();
			  Statement st2=con.createStatement();
			  String str="select * from keytbl";	
			  String str2="select * from patienttbl where pid='"+wstr+"'";
			  ResultSet res=st.executeQuery(str);
			  ResultSet res2=st2.executeQuery(str2);
			  while(res2.next())
			  {
                   y=1;
				   if(y==1)
				   {
			       txtpid.setText(res2.getString(1));
				   txtname.setText(res2.getString(3));
				   txtcontact.setText(res2.getString(6));

				   }
			  }
			  if(y==1)
			  {
			  while(res.next())
			  {
				  txtaid.setText("AD0"+res.getString(7));
				  
			  }
				  }
			  
				  else{
					JOptionPane.showMessageDialog(null,"patient does not exist");
				  }
				  con.close();
				  }
				  catch(Exception ee)
				  {
					  System.out.println(ee);
				  }
	}
	
	if(e.getSource()==btnsave)
	{ 
           String gen="";
		   int temp=0;
		   String tt[]=txtbed.getText().split("/");
				try
				{
				Connection con =DriverManager .getConnection("jdbc:odbc:nursingdsn");
				String str="insert into admittbl(pid,name,aid,DOA,diagnosedFor,documentSub,currentStatus,bedAlloc,referedBy,contact)values(?,?,?,?,?,?,?,?,?,?)";
	  		  PreparedStatement ps=con.prepareStatement(str);
			 String str2="Select * from admittbl where Aid='"+txtaid.getText()+"'";
			 Statement st=con.createStatement();
			 ResultSet res=st.executeQuery(str2);
			  ps.setString(1,txtpid.getText());
			  ps.setString(3,txtaid.getText());
			  ps.setString(4,txtdoa.getText());
			  ps.setString(10,txtcontact.getText());
			  ps.setString(5,txtdiagnosed.getText());
			  ps.setString(9,txtrefered.getText());
			  ps.setString(6,txtds.getText());
			  ps.setString(7,txtcs.getText());
			  ps.setString(8,txtbed.getText());
			  ps.setString(2,txtname.getText());
			  while(res.next())
			  {
				temp=1;
			  }
			  if((txtpid.getText().trim().length()!=0)&&(txtdoa.getText().trim().length()!=0)&&(txtcontact.getText().trim().length()!=0)&&(txtdiagnosed.getText().trim().length()!=0)&&(txtds.getText().trim().length()!=0)&&(txtbed.getText().trim().length()!=0))
			  {
             
                  s=txtcontact.getText();
			      for(i=0;i<s.length();i++)
			       {
				     ch=s.charAt(i);
				     if(ch>='0'&& ch<='9')
				     {
                         ff=1;
				      }
					  else{
						ff=0;
						break;
					  }
				   }


				if(ff==1)
			  {
				if(temp==1)
				{
					JOptionPane.showMessageDialog(null,"patient is already admited");
				}
				else
				{
			  ps.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Saved Successfully");
			  btnsave.setEnabled(false);
			  Statement st3=con.createStatement();
			  Statement st2=con.createStatement();
			  st3.executeUpdate("update  keytbl set pid=pid+1");
			  st2.executeUpdate("update keytbl set admitid=admitid+1");
			  	txtdoa.setText("");
				txtcontact.setText("");
				txtdiagnosed.setText("");
				txtrefered.setText("");
				txtds.setText("");
				txtcs.setText("");
				txtname.setText("");
				txtaid.setText("");
				txtpid.setText("");
				}
			  }
			  else
			  {
			  JOptionPane.showMessageDialog(null,"invalid contact");
			  }
			  }
              else
			  {
				JOptionPane.showMessageDialog(null,"please fill all the details properly");
			  }
	       	  Statement st2=con.createStatement();System.out.println(tt[1]+"======"+tt[0]);
			  st2.executeUpdate("update wardmastertbl set B"+tt[1]+"='n' where wtype='"+tt[0]+"'");

			  
		   con.close();
		   }
		   catch(Exception ee)
		   {
			   System.out.println(ee);
		   }
	}
	if(e.getSource()==btnsearch)
	{
				  int flg=0;
		  	try
			{
				int ctr=0;
				String wstr=JOptionPane.showInputDialog(null,"Enter admit id:");
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from admittbl where Aid='"+wstr+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				btnedit.setEnabled(true);
				btnsave.setEnabled(false);
				txtdoa.setEditable(false);
			while(res.next())
			{
				txtpid.setText(res.getString(1));
				txtname.setText(res.getString(2));
				txtaid.setText(res.getString(3));
	            txtdoa.setText(res.getString(4));
				txtcontact.setText(res.getString(10));
				txtdiagnosed.setText(res.getString(5));
				txtrefered.setText(res.getString(9));
				txtds.setText(res.getString(6));
				txtcs.setText(res.getString(7));
				txtbed.setText(res.getString(8));
						
				flg=1;
			}
			if(flg==0)
			{
				JOptionPane.showMessageDialog(null,"Invalid admit id");
				txtdoa.setText("");
				txtcontact.setText("");
				txtdiagnosed.setText("");
				txtrefered.setText("");
				txtds.setText("");
				txtcs.setText("");
				txtbed.setText("");
				txtname.setText("");
				txtaid.setText("");
				txtpid.setText("");
			}
			con.close();			
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
	}
	if(e.getSource()==btnedit)
	{
				try
				{
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				Statement st=con.createStatement();
				String dstr="delete from admittbl where pid='"+txtpid.getText()+"'";
				st.executeUpdate(dstr);
				
                String gen="";
	
					
			  String str="insert into admittbl(pid,aid, name ,DOA,diagnosedFor,documentSub,currentStatus,bedAlloc,referedBy,contact)values(?,?,?,?,?,?,?,?,?,?,?)";
	  		  PreparedStatement ps=con.prepareStatement(str);
			  ps.setString(1,txtpid.getText());
			  ps.setString(3,txtaid.getText());
			  ps.setString(4,txtdoa.getText());
			  ps.setString(10,txtcontact.getText());
			  ps.setString(5,txtdiagnosed.getText());
			  ps.setString(9,txtrefered.getText());
			  ps.setString(6,txtds.getText());
			  ps.setString(7,txtcs.getText());
			  ps.setString(8,txtbed.getText());
			  ps.setString(2,txtname.getText());
			  if((txtpid.getText().trim().length()!=0)&&(txtdoa.getText().trim().length()!=0)&&(txtcontact.getText().trim().length()!=0)&&(txtdiagnosed.getText().trim().length()!=0)&&(txtds.getText().trim().length()!=0)&&(txtbed.getText().trim().length()!=0))
			  {
             
                  s=txtcontact.getText();
			      for(i=0;i<s.length();i++)
			       {
				     ch=s.charAt(i);
				     if(ch>='0'&& ch<='9')
				     {
                         ff=1;
				      }
					  else{
						ff=0;
						break;
					  }
				   }

				if(ff==1)
			  {
			  ps.executeUpdate();
			  JOptionPane.showMessageDialog(null,"update Successfully");
			  btnsave.setEnabled(false);
			  btnedit.setEnabled(false);
			 // Statement st=con.createStatement();
			 // Statement st2=con.createStatement();
			  //st.executeUpdate("update  keytbl set pid=pid+1");
			  //st2.executeUpdate("update keytbl set admitid=admitid+1");
			  	txtdoa.setText("");
				txtcontact.setText("");
				txtdiagnosed.setText("");
				txtrefered.setText("");
				txtds.setText("");
				txtcs.setText("");
			  }
			  else
			  {
			  JOptionPane.showMessageDialog(null,"invalid contact");
			  }
			  }
              else
			  {
				JOptionPane.showMessageDialog(null,"please fill all the details properly");
			  }
	       	  //Statement st2=con.createStatement();System.out.println(tt[1]+"======"+tt[0]);
			 // st2.executeUpdate("update wardmastertbl set B"+tt[1]+"='n' where wtype='"+tt[0]+"'");
				con.close();
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
	}
	if(e.getSource()==btncancel)
	{
		this.dispose();
	}
}

}

	  
	  
	




