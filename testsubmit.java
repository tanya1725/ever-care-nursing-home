import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class testsubmit extends JFrame implements ActionListener
{
   JLabel lbldetail[]=new JLabel[18];
   JLabel lblvalue[]=new JLabel[18];
   JTextField txtavalue[]=new JTextField[18];
   
 JLabel lblreqid=new JLabel("TEST REQUEST ID");
 JTextField txtreqid=new JTextField(15);
 
  JLabel lblid=new JLabel("TEST ID");
 JComboBox cmbid=new JComboBox();
 
JLabel lblheading=new JLabel("TEST SUBMIT FORM ");
JLabel lblleft=new JLabel();
JLabel lblright=new JLabel();

  JLabel lbldate=new JLabel("DATE");
 JTextField txtdate=new JTextField(15);
 
JRadioButton rbtpatient=new JRadioButton("Patient");
JRadioButton rbtnonpatient=new JRadioButton("Non-patient");
ButtonGroup bg=new ButtonGroup();
{
	 bg.add(rbtnonpatient);
	 bg.add(rbtpatient);
}
  JLabel lblnpname=new JLabel("NON-PATIENT NAME");
 JTextField txtnpname=new JTextField(15);
 
  JLabel lblnpid=new JLabel("NON-PATIENT ID");
 JTextField txtnpid=new JTextField(15);
 
  JLabel lblpname=new JLabel("PATIENT NAME");
 JTextField txtpname=new JTextField(15);
 
  JLabel lblpid=new JLabel("PATIENT ID");
 JTextField txtpid=new JTextField(15);
 
 JLabel lbldetail1=new JLabel("test detail");
 JLabel lblvalue1=new JLabel("test value");
 JLabel lblavalue1=new JLabel("value");
 
 JButton btnnew=new JButton("NEW");
JButton btnsave=new JButton("SAVE");
JButton btnsearch=new JButton("SEARCH");
JButton btnedit=new JButton("EDIT");
JButton btncancel=new JButton("CANCEL");

SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
Date dt=new Date();
int flag=0;
String per="";
int flg=0,flgg=0;
public testsubmit()
{
	
	txtdate.setText(""+sdf.format(dt));
	
   setTitle("TEST SUBMIT...");
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

  lblreqid.setBounds(100,200,200,40);
  lblreqid.setFont(new Font("Arial",Font.BOLD,20));
  txtreqid.setBounds(310,200,80,40);
  
  lbldate.setBounds(400,200,80,40);
  lbldate.setFont(new Font("Arial",Font.BOLD,20));
  txtdate.setBounds(490,200,80,40);
  
  lblid.setBounds(570,200,100,40);
  lblid.setFont(new Font("Arial",Font.BOLD,20));
  cmbid.setBounds(680,200,100,40);
  
  rbtnonpatient.setBounds(100,100,150,40);
  rbtnonpatient.setFont(new Font("Arial",Font.BOLD,20));
  rbtpatient.setBounds(350,100,150,40);
  rbtpatient.setFont(new Font("Arial",Font.BOLD,20));
  
  lblpname.setBounds(470,160,100,40);
  txtpname.setBounds(570,160,100,40);
  
  lblpid.setBounds(680,160,100,40);
  txtpid.setBounds(780,160,60,40);
  
  lblnpname.setBounds(470,160,100,40);
  txtnpname.setBounds(570,160,100,40);
  
  lblnpid.setBounds(680,160,100,40);
  txtnpid.setBounds(780,160,60,40);
  
  btnnew.setBounds(150,850,100,40);
  btnnew.setFont(new Font("Arial",Font.BOLD,15));
  btnnew.setBackground(new Color(102,205,255));
  btnsave.setBounds(260,850,100,40);
  btnsave.setFont(new Font("Arial",Font.BOLD,15));
  btnsave.setBackground(new Color(102,205,255));
  btnsearch.setBounds(370,850,100,40);
  btnsearch.setFont(new Font("Arial",Font.BOLD,15));
  btnsearch.setBackground(new Color(102,205,255));
  btnedit.setBounds(480,850,100,40);
  btnedit.setFont(new Font("Arial",Font.BOLD,15));
  btnedit.setBackground(new Color(102,205,255));
  btncancel.setBounds(590,850,100,40);
  btncancel.setFont(new Font("Arial",Font.BOLD,15));
  btncancel.setBackground(new Color(102,205,255));
  
  lbldetail1.setBounds(150,300,200,40);
  lblavalue1.setBounds(500,300,200,40);
  lblvalue1.setBounds(800,300,200,40);
  
  
  int i;
  int y=0;
  
  for(i=0;i<15;i++)
  {
	  lbldetail[i]=new JLabel();
	  txtavalue[i]=new JTextField(15);
	  lblvalue[i]=new JLabel();
	  
	  lbldetail[i].setOpaque(true);
	  lblvalue[i].setOpaque(true);
	  lbldetail[i].setBounds(100,350+y,150,20);
	  lbldetail[i].setFont(new Font("Arial",Font.BOLD,15));
	  lbldetail[i].setHorizontalAlignment(JLabel.CENTER);
	  txtavalue[i].setBounds(450,350+y,150,20);
	  txtavalue[i].setFont(new Font("Arial",Font.BOLD,15));
	  txtavalue[i].setHorizontalAlignment(JLabel.CENTER);
	  lblvalue[i].setBounds(750,350+y,150,20);
	  lblvalue[i].setFont(new Font("Arial",Font.BOLD,15));
	  lblvalue[i].setHorizontalAlignment(JLabel.CENTER);
	  y=y+30;
	  add(lbldetail[i]); 
	  add(txtavalue[i]);
	  add(lblvalue[i]);
	  lblvalue[i].setBackground(new Color(200,200,200));
	  lbldetail[i].setBackground(new Color(200,200,200));
 }
	  add(lblreqid);
	  add(lbldate);
	  add(lblid);
	  add(lblpname);
	  add(lblpid);
	  add(lblnpname);
	  add(txtnpname);
	  add(lblnpid);
	  add(txtnpid);
	  add(lbldetail1);
	  add(lblavalue1);
	  add(lblvalue1);
	  add(lblheading);
	  add(lblleft);
	  add(lblright);
	  
	  add(txtreqid);
	  add(txtdate);
	  add(cmbid);
	  add(txtpname);
	  add(txtpid);
	  add(rbtpatient);
	 add(rbtnonpatient);
	
	  add(btnnew);
	  add(btncancel);
	  add(btnsave);
	  add(btnedit);
	  add(btnsearch);
	  
  btnnew.addActionListener(this);
  btncancel.addActionListener(this);
  btnedit.addActionListener(this);
  btnsearch.addActionListener(this);
  btnsave.addActionListener(this);
  cmbid.addActionListener(this);
  rbtpatient.addActionListener(this);
  rbtnonpatient.addActionListener(this);
  cmbid.setSelectedItem("SELECT");
  lblnpid.setVisible(false);
  txtnpid.setVisible(false);
  lblnpname.setVisible(false);
  txtnpname.setVisible(false);
  lblpid.setVisible(false);
  txtpid.setVisible(false);
  lblpname.setVisible(false);
  txtpname.setVisible(false);
  btnsave.setEnabled(false);
  btnedit.setEnabled(false);
  txtreqid.setEditable(false);
  txtdate.setEditable(false);
  txtnpid.setEditable(false);
  txtnpname.setEditable(false);
  txtpid.setEditable(false);
  txtpname.setEditable(false);
  
		  for(i=0;i<15;i++)
		  {
			  lbldetail[i].setVisible(false);
			  lblvalue[i].setVisible(false);
			  txtavalue[i].setVisible(false);
		  }
		  repaint();
  }
  public void actionPerformed(ActionEvent e)
  {
	  int i=0;
	  int ff=0;
	  int f=0;	
	  if(e.getSource()==btnnew)
	  { 
        flag=0;
		int temp=0;
		
          try
		  {

			cmbid.removeAllItems();
			cmbid.addItem("SELECT");
			txtreqid.setText("");
			txtpid.setText("");
			txtpname.setText("");
			txtnpid.setText("");
			txtnpname.setText("");

			Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");

			  if(rbtpatient.isSelected())
			  {
				    
				    lblnpid.setVisible(false);
					txtnpid.setVisible(false);
					lblnpname.setVisible(false);
					txtnpname.setVisible(false);
					lblpid.setVisible(true);
					txtpid.setVisible(true);
					  lblpname.setVisible(true);
					  txtpname.setVisible(true);
					  btnsave.setEnabled(true);
					  			txtreqid.setText("");
								txtpid.setText("");
								txtpname.setText("");
								txtnpid.setText("");
								txtnpname.setText("");
					  //cmbid.setSelectedItem("SELECT");
					String wstr=JOptionPane.showInputDialog(null,"Enter patient  test request id:");
					
					String str1="select * from patientreqtbl where treqid='"+wstr+"'";
					//String str2="select * from patienttbl where pid='"+wstr+"'";
					Statement st1=con.createStatement();
					ResultSet res1=st1.executeQuery(str1);
		
		            while(res1.next())
					{
			               	 //cmbid.setSelectedItem("SELECT");				    
							 cmbid.addItem(res1.getString(3));
							 txtreqid.setText(res1.getString(1));
							 txtpid.setText(res1.getString(2));
							 temp=1;
					}
					String str2="select * from admittbl where aid='"+txtpid.getText()+"'";
					Statement st2=con.createStatement();
					ResultSet res2=st2.executeQuery(str2);					
					while(res2.next())
					{
						txtpname.setText(res2.getString(2));
						temp=1;
					}
					if(temp==0)
					{
						JOptionPane.showMessageDialog(null,"invalid request id");
						txtreqid.setText("");
						txtpid.setText("");
						txtpname.setText("");
					}
		        }
				
			  if(rbtnonpatient.isSelected())
			  {
				      
				      lblnpid.setVisible(true);
					  txtnpid.setVisible(true);
					  lblnpname.setVisible(true);
					  txtnpname.setVisible(true);
					  lblpid.setVisible(false);
					  txtpid.setVisible(false);
					  lblpname.setVisible(false);
					  txtpname.setVisible(false);
					  btnsave.setEnabled(true);
					  			txtreqid.setText("");
								txtpid.setText("");
								txtpname.setText("");
								txtnpid.setText("");
								txtnpname.setText("");
					 cmbid.setSelectedItem("SELECT");
					  
					String wstr=JOptionPane.showInputDialog(null,"Enter  NON-PATIENT  request id:");
			
					String str1="select * from nonpatientreqtbl where treqid='"+wstr+"'";
					Statement st1=con.createStatement();
					ResultSet res1=st1.executeQuery(str1);
                    while(res1.next())
					{
						
						cmbid.addItem(res1.getString(2));
						txtreqid.setText(res1.getString(1));
						txtnpid.setText(res1.getString(5));
						txtnpname.setText(res1.getString(6));
						temp=1;
					}
					if(temp==0)
					{
						JOptionPane.showMessageDialog(null,"invalid request id");
						txtreqid.setText("");
						//txtnpcontact.setText("");
						txtnpname.setText("");
						txtnpid.setText("");
					}
			  }
						
               con.close(); 					
			  }
		  catch(Exception ee)
		  {
			  System.out.println(ee);
		  }
	  }
	  if(e.getSource()==cmbid)
	  {

		  	try
			{   
				//cmbid.setSelectedItem("SELECT");
			   
				Connection con =DriverManager.getConnection("jdbc:odbc:nursingdsn");
				if(flag==0)
				 {
				String str="select * from testsubmittbl where Testid='"+""+cmbid.getSelectedItem()+"' and treqid='"+txtreqid.getText()+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);

				while(res.next())
				{
				flg=1;
				}
				
				if(flg==1)
				{
					JOptionPane.showMessageDialog(null,"details are already submited");
					 cmbid.setSelectedItem("SELECT");
					 for(i=0;i<15;i++)
					 {
						lbldetail[i].setVisible(false);
						lblvalue[i].setVisible(false);
						txtavalue[i].setVisible(false);
					 }
				}

				else
				{
					String str1="select * from testdetailtbl where TESTid='"+cmbid.getSelectedItem()+"'";
				String str2="select * from testvaluetbl where TESTid='"+cmbid.getSelectedItem()+"'";
				Statement st1=con.createStatement();
				ResultSet res1=st1.executeQuery(str1);
				Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);				
				while(res1.next())
				{
					for(i=0;i<15;i++)
					{
						String tdetail=res1.getString(i+4);
						if(tdetail.equals("x"))
						{
							lbldetail[i].setVisible(false);
							txtavalue[i].setVisible(false);
						}
						else
						{
							lbldetail[i].setVisible(true);
							txtavalue[i].setVisible(true);
							lbldetail[i].setText(tdetail);
						}
					}
					
				}

				while(res2.next())
				{
					for(i=0;i<15;i++)
					{
						String tvalue=res2.getString(i+4);
						if(tvalue.equals("x"))
						{
							lblvalue[i].setVisible(false);	
                            txtavalue[i].setVisible(false);							
						}
						else
						{
							lblvalue[i].setVisible(true);
							txtavalue[i].setVisible(true);
							lblvalue[i].setText(tvalue);
						}
					}
				}				
				}

				 }
				 


				
				else
				{
				  if(flag==1)
			      {
				//Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str1="select * from testdetailtbl where TESTid='"+cmbid.getSelectedItem()+"'";
				String str2="select * from testvaluetbl where TESTid='"+cmbid.getSelectedItem()+"'";
				String str3="select * from testsubmittbl where Testid='"+""+cmbid.getSelectedItem()+"' and treqid='"+txtreqid.getText()+"'";
				Statement st1=con.createStatement();
				ResultSet res1=st1.executeQuery(str1);
				Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);
				Statement st3=con.createStatement();
				ResultSet res3=st3.executeQuery(str3);	
							
				while(res1.next())
				{
					for(i=0;i<15;i++)
					{
						//cmbid.addItem("SELECT");
						String tdetail=res1.getString(i+4);
						if(tdetail.equals("x"))
						{
							lbldetail[i].setVisible(false);
							//txtavalue[i].setVisible(false);
						}
						else
						{
							lbldetail[i].setVisible(true);
							//txtavalue[i].setVisible(true);
							lbldetail[i].setText(tdetail);
						}
					}
					
				}

				while(res2.next())
				{
					for(i=0;i<15;i++)
					{
						String tvalue=res2.getString(i+4);
						if(tvalue.equals("x"))
						{
							lblvalue[i].setVisible(false);	
                            //txtavalue[i].setVisible(false);							
						}
						else
						{
							lblvalue[i].setVisible(true);
							//txtavalue[i].setVisible(true);
							lblvalue[i].setText(tvalue);
						}
					}
				}
				while(res3.next())
				{
					for(i=0;i<15;i++)
					{
						//System.out.println("111111111");
						String tavalue=res3.getString(i+7);
						if(tavalue.equals(""))
						{
							txtavalue[i].setVisible(false);
						}
						else
						{
							txtavalue[i].setVisible(true);
							txtavalue[i].setText(tavalue);
						}
					}
				}
						
						

			    }
				
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
	  int p=0;
	  
		   try
			{
			
				btnedit.setEnabled(false);
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				if(rbtpatient.isSelected())
				{
                String str="insert into testsubmittbl(Treqid,Tdate,Testid,Ptype,Pid,Pname,av1,av2,av3,av4,av5,av6,av7,av8,av9,av10,av11,av12,av13,av14,av15)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
				PreparedStatement ps=con.prepareStatement(str);
				String str3="select * from testsubmittbl where Testid='"+""+cmbid.getSelectedItem()+"' and treqid='"+txtreqid.getText()+"'";
				Statement st3=con.createStatement();
				ResultSet res3=st3.executeQuery(str3);	
               
				  ps.setString(1,txtreqid.getText());
				  ps.setString(2,txtdate.getText());
				  ps.setString(3,""+cmbid.getSelectedItem());
				  per="patient";
				  ps.setString(4,per);
				  ps.setString(5,txtpid.getText());
				  ps.setString(6,txtpname.getText());
				  for(i=0;i<15;i++)
				  {
					  //System.out.println(i);
					 ps.setString(i+7,""+txtavalue[i].getText());
				  }		 
				for(;i<15;i++)
				{
					ps.setString(i+7,"x");	
					ps.setString(i+7,"x");	
				}
				  for(i=0;i<15;i++)
				  {
					if((txtavalue[i].getText().length()!=0)&&(cmbid.getSelectedItem()!="SELECT"))
					{
						ff=1;
					}
				  }
				  while(res3.next())
				  {
					p=1;
				  }
				  if(ff==1)
				  {
					if(p==0)
					{
                   ps.executeUpdate();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"already submitted");
					}
				  }
				  else{
					JOptionPane.showMessageDialog(null,"please fill all the details");
				  }
		     		  
		     		  
				for(i=0;i<15;i++)
				{
					txtavalue[i].setText("");
				}
				 				
	  
				}
	  if(rbtnonpatient.isSelected())
	  {
                String str="insert into testsubmittbl(Treqid,Tdate,Testid,Ptype,Pid,Pname,av1,av2,av3,av4,av5,av6,av7,av8,av9,av10,av11,av12,av13,av14,av15)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
				PreparedStatement ps=con.prepareStatement(str);
    				String str3="select * from testsubmittbl where Testid='"+""+cmbid.getSelectedItem()+"' and treqid='"+txtreqid.getText()+"'";
				Statement st3=con.createStatement();
				ResultSet res3=st3.executeQuery(str3);	           
				  ps.setString(1,txtreqid.getText());
				  ps.setString(2,txtdate.getText());
				  ps.setString(3,""+cmbid.getSelectedItem());
				  per="non-patient";
				  ps.setString(4,per);
				  ps.setString(5,txtnpid.getText());
				  ps.setString(6,txtnpname.getText());
				  for(i=0;i<15;i++)
				  {
					 ps.setString(i+7,""+txtavalue[i].getText());
				  }
				for(;i<15;i++)
				{
					ps.setString(i+7,"x");	
					ps.setString(i+7,"x");	
				}
				  for(i=0;i<15;i++)
				  {
					if((txtavalue[i].getText().length()!=0)&&(cmbid.getSelectedItem()!="SELECT"))
					{
						ff=1;
					}
				  }
				  while(res3.next())
				  {
					p=1;
				  }
				  if(ff==1)
				  {
					if(p==0)
					{

                   ps.executeUpdate();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"already submited");
					}
				  }
				  else{
					JOptionPane.showMessageDialog(null,"fill all the details properly");
				  }
				   

				   for(i=0;i<15;i++)
				   {
					txtavalue[i].setText("");
				   }	 
 
	  }
	  if((ff==1)&&(p==0))
	  {
	  JOptionPane.showMessageDialog(null,"saved successfully");
	
	  //btnsave.setEnabled(false);
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
	  flag=1;


	  		  	try
			    {

			for(i=0;i<15;i++)
			{
				txtavalue[i].setText("");
				lbldetail[i].setText("");
				lblvalue[i].setText("");
			}
					
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
							txtreqid.setText("");
							txtpid.setText("");
							txtpname.setText("");
							txtnpid.setText("");
							txtnpname.setText("");

				if(rbtpatient.isSelected())
				{
				    lblnpid.setVisible(false);
					txtnpid.setVisible(false);
					lblnpname.setVisible(false);
					txtnpname.setVisible(false);
					lblpid.setVisible(true);
					txtpid.setVisible(true);
					lblpname.setVisible(true);
				    txtpname.setVisible(true);
                    btnedit.setEnabled(true);	
					btnsave.setEnabled(false);
				cmbid.removeAllItems();
				cmbid.addItem("SELECT");	

				String wstr=JOptionPane.showInputDialog(null,"Enter patient request id:");
				String str="select * from testsubmittbl where treqid='"+wstr+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);	
				btnedit.setEnabled(true);
				btnsave.setEnabled(false);	
                while(res.next())
				{
                 txtpid.setText(res.getString(5));
                 txtpname.setText(res.getString(6));
                 txtreqid.setText(res.getString(1));
 				if(res.getString(4).equals("patient"))
				{
					rbtpatient.setSelected(true);
				}
			   else
			     {
					 rbtnonpatient.setSelected(true);
				 } 
                  txtdate.setText(res.getString(2));			
				  cmbid.addItem(res.getString(3));
								f=1;
				}
				}
		
				if(rbtnonpatient.isSelected())
				{
				      lblnpid.setVisible(true);
					  txtnpid.setVisible(true);
					  lblnpname.setVisible(true);
					  txtnpname.setVisible(true);
					  lblpid.setVisible(false);
					  txtpid.setVisible(false);
					  lblpname.setVisible(false);
					  txtpname.setVisible(false);
					  btnedit.setEnabled(true);
					  btnsave.setEnabled(false);
				String wstr=JOptionPane.showInputDialog(null,"Enter non-patient request id:");
				String str="select * from testsubmittbl where treqid='"+wstr+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);	
				btnsave.setEnabled(false);	
                while(res.next())
				{
                 txtnpid.setText(res.getString(5));
                 txtnpname.setText(res.getString(6));
                 txtreqid.setText(res.getString(1));
 				if(res.getString(4).equals("non-patient"))
				{
					rbtnonpatient.setSelected(true);
				}
			   else
			     {
					 rbtpatient.setSelected(true);
				 } 
                  txtdate.setText(res.getString(2));			
				  cmbid.addItem(res.getString(3));
				
				f=1;
				}
				}
				con.close();		
                    if(f==0)
					{
						JOptionPane.showMessageDialog(null,"invalid test request id");

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
	if(rbtpatient.isSelected())
	{
    
	String dstr="delete from testsubmittbl where  Testid='"+""+cmbid.getSelectedItem()+"' and treqid='"+txtreqid.getText()+"'";
	st.executeUpdate(dstr);
				if(rbtpatient.isSelected())
				{
                String str="insert into testsubmittbl(Treqid,Tdate,Testid,Ptype,Pid,Pname,av1,av2,av3,av4,av5,av6,av7,av8,av9,av10,av11,av12,av13,av14,av15)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
				PreparedStatement ps=con.prepareStatement(str);
               
				  ps.setString(1,txtreqid.getText());
				  ps.setString(2,txtdate.getText());
				  ps.setString(3,""+cmbid.getSelectedItem());
				  per="patient";
				  ps.setString(4,per);
				  ps.setString(5,txtpid.getText());
				  ps.setString(6,txtpname.getText());
				  for(i=0;i<15;i++)
				  {
					  //System.out.println(i);
					 ps.setString(i+7,""+txtavalue[i].getText());
				  }		 
				for(;i<15;i++)
				{
					ps.setString(i+7,"x");	
					ps.setString(i+7,"x");	
				}
				  for(i=0;i<15;i++)
				  {
					if((txtavalue[i].getText().length()!=0)&&(cmbid.getSelectedItem()!="SELECT"))
					{
						ff=1;
					}
				  }
				  if(ff==1)
				  {
                   ps.executeUpdate();
				  }
				  else{
					JOptionPane.showMessageDialog(null,"please fill all the details");
				  }
		     		  
		     		  
				for(i=0;i<15;i++)
				{
					txtavalue[i].setText("");
				}
				 				
	  
				}
				}
	  if(rbtnonpatient.isSelected())
	  {
				String dstr="delete from testsubmittbl where  Testid='"+""+cmbid.getSelectedItem()+"' and treqid='"+txtreqid.getText()+"'";
				st.executeUpdate(dstr);
                String str="insert into testsubmittbl(Treqid,Tdate,Testid,Ptype,Pid,Pname,av1,av2,av3,av4,av5,av6,av7,av8,av9,av10,av11,av12,av13,av14,av15)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
				PreparedStatement ps=con.prepareStatement(str);
               
				  ps.setString(1,txtreqid.getText());
				  ps.setString(2,txtdate.getText());
				  ps.setString(3,""+cmbid.getSelectedItem());
				  per="non-patient";
				  ps.setString(4,per);
				  ps.setString(5,txtnpid.getText());
				  ps.setString(6,txtnpname.getText());
				  for(i=0;i<15;i++)
				  {
					 ps.setString(i+7,""+txtavalue[i].getText());
				  }
				for(;i<15;i++)
				{
					ps.setString(i+7,"x");	
					ps.setString(i+7,"x");	
				}
				  for(i=0;i<15;i++)
				  {
					if((txtavalue[i].getText().length()!=0)&&(cmbid.getSelectedItem()!="SELECT"))
					{
						ff=1;
					}
				  }
				  if(ff==1)
				  {
                   ps.executeUpdate();
				  }
				   

				   for(i=0;i<15;i++)
				   {
					txtavalue[i].setText("");
				   }	 
 
	  }
	  if(ff==1)
	  {
	  JOptionPane.showMessageDialog(null,"update successfully");
	
	  btnsave.setEnabled(false);
	  for(i=0;i<15;i++)
	  {
				txtavalue[i].setText("");
				lbldetail[i].setText("");
				lblvalue[i].setText("");
	  }
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