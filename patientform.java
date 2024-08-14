import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class patientform extends JFrame implements ActionListener
{
JLabel lblpid=new JLabel("patient id:");
JTextField txtpid=new JTextField(15);

JLabel lbldob=new JLabel("Date of Birth:");
JTextField txtdob=new JTextField(15);

JLabel lblname=new JLabel("patient name:");
JTextField txtname=new JTextField(15);

JLabel lblbg=new JLabel("blood group:");
JTextField txtbg=new JTextField(15);

JLabel lbladhar=new JLabel("Aadhar no.");
JTextField txtadhar=new JTextField(15);

JLabel lblcontact=new JLabel("contact no.:");

JTextField txtcontact=new JTextField(15);

JLabel lblheading=new JLabel("PATIENT PERSONAL DETAILS");

JLabel lblleft=new JLabel();
JLabel lblright=new JLabel();

JButton btnnew=new JButton("NEW");
JButton btnsave=new JButton("SAVE");
JButton btnsearch=new JButton("SEARCH");
JButton btnedit=new JButton("EDIT");
JButton btncancel=new JButton("CANCEL");
 
JLabel lblgender=new JLabel("Gender:");
JRadioButton rbtmale=new JRadioButton("Male");
JRadioButton rbtfemale=new JRadioButton("Female");

ButtonGroup bg2=new ButtonGroup();

  public patientform()
  	
{
	  setTitle("PATIENT FORM...");
      setLayout(null);
	   Dimension size=Toolkit.getDefaultToolkit().getScreenSize(); 
	  setVisible(true);
	  setSize(1000,1000);
	  setLocation(((int)size.getWidth()/2-500),((int)size.getHeight()/2-500));

	lblheading.setBounds(0,0,1000,70);
	lblheading.setOpaque(true);
	lblleft.setOpaque(true);
	lblright.setOpaque(true);
	  lblheading.setHorizontalAlignment(JLabel.CENTER);
	  lblheading.setFont(new Font("Courier New",Font.BOLD,25));
	  lblheading.setBackground(new Color(102,205,255));
    
	 lblleft.setBounds(0,0,20,1000);
	 lblleft.setBackground(new Color(102,205,255));
	 lblright.setBounds(960,0,20,1000);
	 lblright.setBackground(new Color(102,205,255));

	  lblpid.setBounds(30,200,200,40);
	  lblpid.setHorizontalAlignment(JLabel.CENTER);
	  lblpid.setFont(new Font("Arial",Font.BOLD,25));
	  txtpid.setBounds(300,200,150,40);
	  
	  lbldob.setBounds(70,350,200,40);
	  lbldob.setFont(new Font("Arial",Font.BOLD,25));
	  txtdob.setBounds(300,350,150,40);
	  
	  lblname.setBounds(470,200,200,40);
	  lblname.setFont(new Font("Arial",Font.BOLD,25));
	  txtname.setBounds(680,200,150,40);
	  
	  lblgender.setBounds(70,500,200,40);
	  lblgender.setFont(new Font("Arial",Font.BOLD,25));
	  rbtmale.setBounds(220,500,150,40);
	  rbtmale.setFont(new Font("Arial",Font.BOLD,25));
	  rbtfemale.setBounds(380,500,120,40);
	   rbtfemale.setFont(new Font("Arial",Font.BOLD,25));
	  
	  lblbg.setBounds(70,650,200,40);
	  lblbg.setFont(new Font("Arial",Font.BOLD,25));
	  txtbg.setBounds(300,650,150,40);

	  lblcontact.setBounds(470,350,200,40);
	  lblcontact.setFont(new Font("Arial",Font.BOLD,25));
	  txtcontact.setBounds(680,350,150,40);
	   
	  lbladhar.setBounds(470,650,200,40);
	  lbladhar.setFont(new Font("Arial",Font.BOLD,25));
	  txtadhar.setBounds(680,650,150,40);
	  
	 btnnew.setBounds(80,750,120,50);
	 btnnew.setFont(new Font("Arial",Font.BOLD,15));
	 btnsave.setBackground(new Color(102,205,255));
	  btnsave.setBounds(210,750,120,50);
	  btnsave.setFont(new Font("Arial",Font.BOLD,15));
	  btnnew.setBackground(new Color(102,205,255));
	  btnsearch.setBounds(340,750,140,50);
	  btnsearch.setFont(new Font("Arial",Font.BOLD,15));
	  btnsearch.setBackground(new Color(102,205,255));
	  btnedit.setBounds(490,750,120,50);
	  btnedit.setFont(new Font("Arial",Font.BOLD,15));
	  btnedit.setBackground(new Color(102,205,255));
	  btncancel.setBounds(620,750,140,50);
	  btncancel.setFont(new Font("Arial",Font.BOLD,15));
	  btncancel.setBackground(new Color(102,205,255));
	  
	  add(lblpid);
	  add(lbldob);
	  add(lblname);
	  bg2.add(rbtmale);
	  bg2.add(rbtfemale);
	  add(lblgender);
	  add(lbladhar);
	  add(lblbg);
	  add(lblcontact);
	  add(lblheading);
	  add(lblleft);
	  add(lblright);
  
	  add(txtpid);
	  add(txtdob);
	  add(txtname);
	  add(txtbg);
	  add(txtadhar);
	  add(txtcontact);
  add(btnnew);
  add(btnsearch);
  add(btnedit);
  add(btnsave);
  add(btncancel);
  add(rbtmale);
  add(rbtfemale);
  
  	btnnew.addActionListener(this);
	btnsave.addActionListener(this);
	btnsearch.addActionListener(this);
	btnedit.addActionListener(this);
	btncancel.addActionListener(this);
	rbtmale.addActionListener(this);
	rbtfemale.addActionListener(this);
	btnsave.setEnabled(false);
	btnedit.setEnabled(false);
	txtpid.setEditable(false);
}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==btnnew)
	{
		txtdob.setText("");
		txtname.setText("");
		txtbg.setText("");
				try
				  {
			  Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
			  Statement st=con.createStatement();
			  String str="select pid from keytbl";
			  ResultSet res=st.executeQuery(str);
			  btnsave.setEnabled(true);
			  btnedit.setEnabled(false);
			  while(res.next())
			  {
				  txtpid.setText("p/"+res.getString(1));
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
		   int i,ff=0,f=0;
		   String s="",p="";
		   char ch,chh;
						try
				{
				Connection con =DriverManager .getConnection("jdbc:odbc:nursingdsn");
				String str="insert into patienttbl(pid,DOB,pname,pgender,bloodGroup,contact,adhar)values(?,?,?,?,?,?,?)";
	  		  PreparedStatement ps=con.prepareStatement(str);
			  ps.setString(1,txtpid.getText());
			  ps.setString(2,txtdob.getText());
			  ps.setString(3,txtname.getText());
			  ps.setString(5,txtbg.getText());
			  ps.setString(6,txtcontact.getText());
			  ps.setString(7,txtadhar.getText());

			  if(rbtmale.isSelected())
			  {
				  gen="male";
			  }
			  if(rbtfemale.isSelected())
			  {
				  gen="female";
			  }
			  ps.setString(4,gen);

                  s=txtadhar.getText();
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

				  p=txtcontact.getText();
			      for(i=0;i<p.length();i++)
			       {
				     chh=p.charAt(i);
				     if(chh>='0'&& chh<='9')
				     {
                         f=1;
				      }
					  else{
						f=0;
						break;
					  }
				   }

			   	if((txtpid.getText().trim().length()!=0)&&(txtname.getText().trim().length()!=0)&&(txtdob.getText().trim().length()!=0)&&(txtbg.getText().trim().length()!=0))
				{
			   if((txtadhar.getText().length()==12)&&(ff==1))
			   {
				
				if(f==1)
				{
			  ps.executeUpdate();
			  
			  btnsave.setEnabled(false);
			  btnedit.setEnabled(false);

			  	txtdob.setText("");
				txtname.setText("");
				txtbg.setText("");
				txtname.setText("");
				txtcontact.setText("");
				txtadhar.setText("");
				rbtfemale.setSelected(false);
				rbtmale.setSelected(false);
				JOptionPane.showMessageDialog(null,"Saved Successfully");
				Statement st=con.createStatement();
				System.out.println("12357890-");
			     st.executeUpdate("update  keytbl set pid=pid+1");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid contact");
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid adhar no.");
				}

			   }
			   else
			   {
				JOptionPane.showMessageDialog(null,"please fill all the details properly");
			   }
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
				String wstr=JOptionPane.showInputDialog(null,"Enter patient id:");
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from patienttbl where pid='"+wstr+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				btnedit.setEnabled(true);
				btnsave.setEnabled(false);
			while(res.next())
			{
				txtpid.setText(res.getString(1));
				txtdob.setText(res.getString(2));
	            txtname.setText(res.getString(3));
				txtbg.setText(res.getString(5));
				txtcontact.setText(res.getString(6));
				txtadhar.setText(res.getString(7));
			
				if(res.getString(4).equals("female"))
				{
					rbtfemale.setSelected(true);
				}
			   else
			     {
					 rbtmale.setSelected(true);
				 }
			
			
				flg=1;
			}
			if(flg==0)
			{
				JOptionPane.showMessageDialog(null,"Invalid patient id");
				txtdob.setText("");
				txtname.setText("");
				txtbg.setText("");
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
		int f=0,ff=0;
		char ch,chh;
		String s="",p="";
		int i;
              String gen="";
				try
				{
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				Statement st=con.createStatement();
				String dstr="delete from patienttbl where pid='"+txtpid.getText()+"'";
				st.executeUpdate(dstr);
				String str="insert into patienttbl(pid,DOB,pname,pgender,bloodGroup,contact,adhar)values(?,?,?,?,?,?,?)";
	  		  PreparedStatement ps=con.prepareStatement(str);
			  ps.setString(1,txtpid.getText());
			  ps.setString(2,txtdob.getText());
			  ps.setString(3,txtname.getText());
			  ps.setString(5,txtbg.getText());
			  ps.setString(6,txtcontact.getText());
			  ps.setString(7,txtadhar.getText());

			  if(rbtmale.isSelected())
			  {
				  gen="male";
			  }
			  if(rbtfemale.isSelected())
			  {
				  gen="female";
			  }
			  ps.setString(4,gen);

                  s=txtadhar.getText();
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

				  p=txtcontact.getText();
			      for(i=0;i<p.length();i++)
			       {
				     chh=p.charAt(i);
				     if(chh>='0'&& chh<='9')
				     {
                         f=1;
				      }
					  else{
						f=0;
						break;
					  }
				   }

			   	if((txtpid.getText().trim().length()!=0)&&(txtname.getText().trim().length()!=0)&&(txtdob.getText().trim().length()!=0)&&(txtbg.getText().trim().length()!=0))
				{
			   if((txtadhar.getText().length()==12)&&(ff==1))
			   {
				
				if(f==1)
				{
			  ps.executeUpdate();
			  JOptionPane.showMessageDialog(null,"update Successfully");
			  btnsave.setEnabled(false);
			  btnedit.setEnabled(false);
			 // Statement st=con.createStatement();
			  //st.executeUpdate("update  keytbl set pid=pid+1");
			  	txtdob.setText("");
				txtname.setText("");
				txtbg.setText("");
				txtname.setText("");
				txtcontact.setText("");
				txtadhar.setText("");
				rbtfemale.setSelected(false);
				rbtmale.setSelected(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid contact");
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid adhar no.");
				}

			   }
			   else
			   {
				JOptionPane.showMessageDialog(null,"please fill all the details properly");
			   }
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
	  
	  
	




