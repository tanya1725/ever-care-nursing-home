import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class doctorform extends JFrame implements ActionListener,ItemListener
{
	int flg=0;
	int change=0;
					char ch,chh,chhh,chhhh;
				int i,ff=0,fff=0,ffff=0,fffff=0;
				String s="",w="",p="",t="";
				int ctr=0,tt=0,t5=0,ttt=0,tttt=0,ctr1=0,ctr2=0,ctr3=0 ;
				int ts=0;
				int set=1;
				int set2=1;
JLabel lblid=new JLabel("DR.id");
JTextField txtid=new JTextField(15);
//////////////////////////////////////////////doctor id///////////////////////////////////////////////////////////////
JLabel lbldoj=new JLabel("DOJ");
JTextField txtdoj=new JTextField(15);
/////////////////////////////////////////////doctor date of joining///////////////////////////////////////////////////
JLabel lblname=new JLabel("DR. name");
JTextField txtname=new JTextField(15);
////////////////////////////////////////////doctor name////////////////////////////////////////////////////////////////
JLabel lbladdress=new JLabel("DR.address");
JTextField txtaddress=new JTextField(15);
////////////////////////////////////////////doctor address/////////////////////////////////////////////////////////////
JLabel lblcontact=new JLabel("DR.contact");
JTextField txtcontact=new JTextField(15);
///////////////////////////////////////////doctor contact//////////////////////////////////////////////////////////////
JLabel lblemail=new JLabel("DR.email");
JTextField txtemail=new JTextField(15);
//JTextField txtemail2=new JTextField(15);
///////////////////////////////////////////doctor email////////////////////////////////////////////////////////////////
JLabel lblspecialized=new JLabel("specialized in");
JComboBox cmbspecialized=new JComboBox();
//////////////////////////////////////////specialized in///////////////////////////////////////////////////////////////
JLabel lblvisitingdays=new JLabel("visiting days");
JLabel lblsun=new JLabel("SUN");
JLabel lblmon=new JLabel("MON");
JLabel lbltue=new JLabel("TUE");
JLabel lblwed=new JLabel("WED");
JLabel lblthu=new JLabel("THU");
JLabel lblfri=new JLabel("FRI");
JLabel lblsat=new JLabel("SAT");

JCheckBox chsun=new JCheckBox("");
JCheckBox chmon=new JCheckBox("");
JCheckBox chtue=new JCheckBox("");
JCheckBox chwed=new JCheckBox("");
JCheckBox chthu=new JCheckBox("");
JCheckBox chfri=new JCheckBox("");
JCheckBox chsat=new JCheckBox("");

JTextField txtvisitingdays=new JTextField(15);

/////////////////////////////////////////visiting days/////////////////////////////////////////////////////////////////
JLabel lblvisitinghrs=new JLabel("visiting hrs");
JTextField txtvisitinghrs=new JTextField(15);
JTextField txtvisitinghrs1=new JTextField(15);
JLabel lbldot1=new JLabel(":");
JTextField txtvisitinghrs2=new JTextField(15);
JComboBox cmbvisitinghrs=new JComboBox();
JTextField txtvisitinghrs3=new JTextField(15);
JTextField txtvisitinghrs4=new JTextField(15);
JLabel lbldot2=new JLabel(":");
JTextField txtvisitinghrs5=new JTextField(15);
JComboBox cmbvisitinghrs3=new JComboBox();
JLabel lblheading=new JLabel("DOCTOR FORM");
JLabel lblleft=new JLabel();
JLabel lblright=new JLabel();
////////////////////////////////////////visiting days/////////////////////////////////////////////////////////////////
JButton btnnew=new JButton("NEW");
JButton btnsave=new JButton("SAVE");
JButton btnsearch=new JButton("SEARCH");
JButton btnedit=new JButton("EDIT");
JButton btncancel=new JButton("CANCEL");
JButton btnchange=new JButton("change");

//////////////////////////////////////////buttons ///////////////////////////////////////////////////////////////////////
  SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
  Date dt=new Date();

  public doctorform()
  {
  setTitle("Doctor form...");
  setLayout(null);
  setVisible(true);
  setSize(1000,1000);
  Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
   setLocation(((int)size.getWidth()/2-500),((int)size.getHeight()/2-500));
     	lblheading.setBounds(0,0,1000,70);
	lblheading.setOpaque(true);
	lblleft.setOpaque(true);
	lblright.setOpaque(true);
	  lblheading.setHorizontalAlignment(JLabel.CENTER);
	  lblheading.setFont(new Font("Engravers MT",Font.BOLD,30));
	  lblheading.setBackground(new Color(63,147,203));
    
	 lblleft.setBounds(0,0,20,1000);
	 lblleft.setBackground(new Color(63,147,203));
	 lblright.setBounds(960,0,20,1000);
	 lblright.setBackground(new Color(63,147,203));
  
  lblid.setBounds(150,150,150,40);
  lblid.setFont(new Font("Arial",Font.BOLD,25));

  txtid.setBounds(300,150,150,40);
  
  lbldoj.setBounds(500,150,100,40);
  lbldoj.setFont(new Font("Arial",Font.BOLD,25));
  txtdoj.setBounds(600,150,150,40);
  
  lblname.setBounds(150,230,150,40);
  lblname.setFont(new Font("Arial",Font.BOLD,25));
  txtname.setBounds(300,230,400,40);
  
  lbladdress.setBounds(150,310,200,40);
    lbladdress.setFont(new Font("Arial",Font.BOLD,25));

  txtaddress.setBounds(300,310,170,70);
  
  lblcontact.setBounds(550,310,150,40);
    lblcontact.setFont(new Font("Arial",Font.BOLD,25));

  txtcontact.setBounds(700,310,150,40);
  
  lblemail.setBounds(550,390,150,40);
    lblemail.setFont(new Font("Arial",Font.BOLD,25));

  txtemail.setBounds(700,390,170,40);
 // txtemail2.setBounds(740,370,100,40);
  
  lblspecialized.setBounds(150,410,200,40);
    lblspecialized.setFont(new Font("Arial",Font.BOLD,25));

  cmbspecialized.setBounds(350,410,170,40);
  
  lblvisitingdays.setBounds(150,500,200,40);
    lblvisitingdays.setFont(new Font("Arial",Font.BOLD,25));

  txtvisitingdays.setBounds(360,500,150,40);
  chsun.setBounds(160,560,20,40);
   chmon.setBounds(210,560,20,40);
    chtue.setBounds(260,560,20,40);
	 chwed.setBounds(310,560,20,40);
	  chthu.setBounds(360,560,20,40);
	   chfri.setBounds(410,560,20,40);
	    chsat.setBounds(460,560,20,40);

  lblsun.setBounds(160,610,30,40);
   lblmon.setBounds(210,610,30,40);
    lbltue.setBounds(260,610,30,40);
	 lblwed.setBounds(310,610,30,40);
	  lblthu.setBounds(360,610,30,40);
	   lblfri.setBounds(410,610,30,40);
	    lblsat.setBounds(460,610,30,40);
  
  lblvisitinghrs.setBounds(550,510,200,40);
  lblvisitinghrs.setFont(new Font("Arial",Font.BOLD,25));

  txtvisitinghrs1.setBounds(700,510,150,40); 
  btnchange.setBounds(870,510,80,40);
  txtvisitinghrs.setBounds(600,590,100,40); 
  lbldot1.setBounds(720,590,30,40);
  txtvisitinghrs3.setBounds(740,590,60,40); 
  cmbvisitinghrs.setBounds(810,590,60,40);

  txtvisitinghrs2.setBounds(890,590,50,40); 

  txtvisitinghrs4.setBounds(600,650,100,40);  
  lbldot2.setBounds(720,650,30,40); 
  txtvisitinghrs5.setBounds(740,650,60,40);
  cmbvisitinghrs3.setBounds(810,650,60,40); 
  
  btnnew.setBounds(150,750,100,40);
    btnnew.setFont(new Font("Arial",Font.BOLD,15));
  btnsave.setFont(new Font("Arial",Font.BOLD,15));
  btnsearch.setFont(new Font("Arial",Font.BOLD,15));
  btnedit.setFont(new Font("Arial",Font.BOLD,15));
  btncancel.setFont(new Font("Arial",Font.BOLD,15));

  btnsearch.setBounds(260,750,100,40);
  btnedit.setBounds(370,750,100,40);
  btnsave.setBounds(480,750,100,40);
  btncancel.setBounds(590,750,100,40);
  txtvisitinghrs1.setEditable(false);

  
  add(lblid);
  add(lbldoj);
  add(lblname);
  add(lbladdress);
  add(lblcontact);
  add(lblemail);
  add(lblspecialized);
  add(lblvisitingdays);
  add(lblvisitinghrs);
  add(lblsun);
  add(lblmon);
  add(lbltue);
  add(lblwed);
  add(lblthu);
  add(lblfri);
  add(lblsat);
  add(lbldot1);
  add(lbldot2);
  add(lblheading);
  add(lblleft);
  add(lblright);

  
  add(txtid);
  add(txtdoj);
  add(txtname);
  add(txtaddress);
  add(txtcontact);
  add(txtemail);
  add(cmbspecialized);
  add(cmbvisitinghrs);
  add(cmbvisitinghrs3);
  add(txtvisitingdays);
  add(txtvisitinghrs);
  add(txtvisitinghrs2);
  add(txtvisitinghrs3);
  add(txtvisitinghrs4);
  add(txtvisitinghrs5);
  add(txtvisitinghrs1);

 // add(txtemail2);
  
  add(btnnew);
  add(btnsearch);
  add(btnedit);
  add(btnsave);
  add(btncancel);
  add(btnchange);
  add(chsun);
  add(chmon);
  add(chtue);
  add(chwed);
  add(chthu);
  add(chfri);
  add(chsat);

  txtvisitinghrs2.setText("  TO  ");
  txtvisitinghrs2.setEditable(false);
  txtid.setEditable(false);
  //txtdoj.setText(""+sdf.format(dt));
  cmbvisitinghrs.addItem("SET");
  cmbvisitinghrs.addItem("am");
  cmbvisitinghrs.addItem("pm");


  cmbvisitinghrs3.addItem("SET");
  cmbvisitinghrs3.addItem("am");
  cmbvisitinghrs3.addItem("pm");
  try
  {   
		Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
		String str="select * from doctortbl";
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery(str);	
		    cmbspecialized.addItem("SELECT");
			cmbspecialized.addItem("orthopedist");//bone heal
			cmbspecialized.addItem("cardiologist");//heart specialist
			cmbspecialized.addItem("surgen");
			cmbspecialized.addItem("dermatologist");//skin hair specialist
			cmbspecialized.addItem("pediatrician");//child specialist
			cmbspecialized.addItem("psychiatrist");// complex mental and physical health
			cmbspecialized.addItem("radiologist");//xray
			cmbspecialized.addItem("oncologist");//cancer specialist
			cmbspecialized.addItem("urologist");//men and women urinary tract
			cmbspecialized.addItem("anesthesiologist");//drug specialist for numb the pain 
			cmbspecialized.addItem("pathologist");//lab speicialist
			cmbspecialized.addItem("nephrologist");//kidney specialist
			cmbspecialized.addItem("dentist");//teeth and gum spcialist
			cmbspecialized.addItem("neurology");//nervous system
			cmbspecialized.addItem("general physician");//

			
		
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
	btnnew.addActionListener(this);
	btnsave.addActionListener(this);
	btnsearch.addActionListener(this);
	btnedit.addActionListener(this);
	btncancel.addActionListener(this);
	btnchange.addActionListener(this);
	btnsave.setEnabled(false);
	btnedit.setEnabled(false);
	cmbvisitinghrs.addActionListener(this);
	cmbvisitinghrs3.addActionListener(this);
	txtvisitingdays.setEditable(false);
	btnchange.setVisible(false);

	chsun.addItemListener(this);
	chmon.addItemListener(this);
	chtue.addItemListener(this);
	chwed.addItemListener(this);
	chthu.addItemListener(this);
	chfri.addItemListener(this);
	chsat.addItemListener(this);

  }
  public void itemStateChanged(ItemEvent i)
{
	txtvisitingdays.setText("");
	if(chsun.isSelected())
	{
	txtvisitingdays.setText(txtvisitingdays.getText()+" "+"sun");   
    } 

		if(chmon.isSelected())
	{
	txtvisitingdays.setText(txtvisitingdays.getText()+" "+"mon");   
    } 

		if(chtue.isSelected())
	{
	txtvisitingdays.setText(txtvisitingdays.getText()+" "+"tue");   
    } 

		if(chwed.isSelected())
	{
	txtvisitingdays.setText(txtvisitingdays.getText()+" "+"wed");   
    } 

		if(chthu.isSelected())
	{
	txtvisitingdays.setText(txtvisitingdays.getText()+" "+"thu");   
    } 

		if(chfri.isSelected())
	{
	txtvisitingdays.setText(txtvisitingdays.getText()+" "+"fri");   
    } 

		if(chsat.isSelected())
	{
	txtvisitingdays.setText(txtvisitingdays.getText()+" "+"sat");   
    } 
} 
  public void actionPerformed(ActionEvent e)
  {

	  if(e.getSource()==btnnew)
	  {
		  txtid.setText("");
		  txtname.setText("");
		 // txtdoj.setText("");
		  txtaddress.setText("");
		  txtcontact.setText("");
		  txtemail.setText("");
		  txtvisitingdays.setText("");
		  txtvisitinghrs.setText("");
		 // txtemail2.setText("@gmail.com");
		  cmbspecialized.setSelectedItem("SELECT");
		  txtdoj.setText(""+sdf.format(dt));
		  btnedit.setEnabled(false);
		  btnsave.setEnabled(true);
		  		txtvisitinghrs.setVisible(true);
				txtvisitinghrs2.setVisible(true);
				txtvisitinghrs3.setVisible(true);
				txtvisitinghrs4.setVisible(true);
				txtvisitinghrs5.setVisible(true);
				cmbvisitinghrs.setVisible(true);
				cmbvisitinghrs3.setVisible(true);
				btnchange.setEnabled(false);
		    	
		  try
		  {
			  Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
			  Statement st=con.createStatement();
			  String str="select drid from keytbl";
			  ResultSet res=st.executeQuery(str);
			 
			  while(res.next())
			  {
				  txtid.setText("D/"+res.getString(1));
			  }
			  btnsave.setEnabled(true);
			  chsun.setSelected(false);
			  chmon.setSelected(false);
			  chtue.setSelected(false);
			  chwed.setSelected(false);
			  chthu.setSelected(false);
			  chfri.setSelected(false);
			  chsat.setSelected(false);
			  	//txtid.setText("");
				txtname.setText("");
				//txtdoj.setText("");
				txtaddress.setText("");
				txtcontact.setText("");
				txtemail.setText("");
				txtvisitingdays.setText("");
				txtvisitinghrs.setText("");
				txtvisitinghrs3.setText("");
				txtvisitinghrs4.setText("");
				txtvisitinghrs5.setText("");
				txtvisitinghrs1.setText("");
				con.close();
		  }
		  catch(Exception ee)
		  {
			  System.out.println(ee);
		  }
	  }
///////	 // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	  if(e.getSource()==btnsearch)
	  {
		  
		  int flag=0;

		  	try
			{
				int ctr=0;
				btnchange.setVisible(true);
				btnchange.setEnabled(true);
				txtvisitinghrs.setVisible(false);
				txtvisitinghrs2.setVisible(false);
				txtvisitinghrs3.setVisible(false);
				txtvisitinghrs4.setVisible(false);
				txtvisitinghrs5.setVisible(false);
				cmbvisitinghrs.setVisible(false);
				cmbvisitinghrs3.setVisible(false);
				btnedit.setEnabled(true);
				btnsave.setEnabled(false);

				String wstr=JOptionPane.showInputDialog(null,"Enter Doctor id:");
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from doctortbl where Drid='"+wstr+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				btnedit.setEnabled(true);
				//txtemail2.setVisible(false);


				btnsave.setEnabled(false);
			while(res.next())
			{
				txtid.setText(res.getString(1));
				txtdoj.setText(res.getString(2));
	            txtname.setText(res.getString(3));
				txtaddress.setText(res.getString(4));
				txtcontact.setText(res.getString(5));
				txtemail.setText(res.getString(6));
				txtvisitingdays.setText(res.getString(8));
				txtvisitinghrs1.setText(res.getString(9));
				cmbspecialized.setSelectedItem(res.getString(7));
				flg=1;
				flag=1;
			}
			
			if(flg==0)
			{
				JOptionPane.showMessageDialog(null,"Invalid doctor id");
				txtid.setText("");
				txtname.setText("");
				txtdoj.setText("");
				txtaddress.setText("");
				txtcontact.setText("");
				txtemail.setText("");
				txtvisitingdays.setText("");
				txtvisitinghrs.setText("");
				cmbspecialized.addItem("SELECT");
				btnedit.setEnabled(false);
			}
			con.close();
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
	  }	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	  
			if(e.getSource()==btnsave)
			{
				char ch,chh,chhh,chhhh,nn,hh;
				int i,ff=0,fff=0,ffff=0,fffff=0;
				String s="",w="",p="",t="",n="",h="";
				int ctr=0,tt=0,t5=0,ttt=0,tttt=0,ctr1=0,ctr2=0,ctr3=0,ctr4=0 ,ctr8=0,c=0;
				try
				{
				Connection con =DriverManager .getConnection("jdbc:odbc:nursingdsn");
				String str="insert into doctortbl(drid,drDOJ,drname,draddress,drcontact,dremail,specializedin,visitingdays,visitinghrs)values(?,?,?,?,?,?,?,?,?)";
	  		  PreparedStatement ps=con.prepareStatement(str);
			  ps.setString(1,txtid.getText());
			  ps.setString(2,txtdoj.getText());
			  ps.setString(3,txtname.getText());
			  ps.setString(4,txtaddress.getText());
			  ps.setString(5,txtcontact.getText());
			  ps.setString(6,txtemail.getText());
			  ps.setString(7,""+cmbspecialized.getSelectedItem());
			  ps.setString(8,txtvisitingdays.getText());
			  ps.setString(9,txtvisitinghrs.getText()+lbldot1.getText()+txtvisitinghrs3.getText()+cmbvisitinghrs.getSelectedItem()+txtvisitinghrs2.getText()+""+txtvisitinghrs4.getText()+lbldot2.getText()+txtvisitinghrs5.getText()+cmbvisitinghrs3.getSelectedItem());
			  if((txtid.getText().trim().length()!=0)&&(txtdoj.getText().trim().length()!=0)&&(txtname.getText().trim().length()!=0)&&(txtaddress.getText().trim().length()!=0)&&(txtdoj.getText().trim().length()!=0)&&(txtcontact.getText().trim().length()!=0)&&(txtemail.getText().trim().length()!=0)&&(txtvisitingdays.getText().trim().length()!=0)&&(txtvisitinghrs.getText().trim().length()!=0))
			  {
				if(cmbspecialized.getSelectedItem()!="SELECT")
				{	


				   s=txtvisitinghrs.getText();
				
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

				     w=txtvisitinghrs3.getText();
			      for(i=0;i<w.length();i++)
			       {
					  ctr++;
				     chh=w.charAt(i);
				     if((chh>='0'&& chh<='9')&&(ctr<=60))
				     {
                         fff=1;
				      }
					  else{
						fff=0;
						break;
					  }
				   }

			       h=txtcontact.getText();
			      for(i=0;i<h.length();i++)
			       {
				     hh=h.charAt(i);
				     if(hh>='0'&& hh<='9')
				     {
                          c=1;
				      }
					  else{
						c=0;
						break;
					  }
				   }
				   
				   p=txtvisitinghrs4.getText();
			      for(i=0;i<p.length();i++)
			       {
				     chhh=p.charAt(i);
				     if(chhh>='0'&& chhh<='9')
				     {
                         ffff=1;
				      }
					  else{
						ffff=0;
						break;
					  }
				   }
				   
				   t=txtvisitinghrs5.getText();
			      for(i=0;i<t.length();i++)
			       {
				     chhhh=t.charAt(i);
				     if(chhhh>='0'&& chhhh<='9')
				     {
                         fffff=1;
				      }
					  else{
						fffff=0;
						break;
					  }
				   }

				 n=txtname.getText();
			      for(i=0;i<n.length();i++)
			       {
				     nn=n.charAt(i);
				     if((nn>='a'&& nn<='z')||(nn>='A'&& nn<='Z')||(nn=='.'))
				     { 

						
                         ctr4=1;
					 }

				      
					  else{
						ctr4=0;
						break;
					  }
				   }




				   if((ff==1)&&(fff==1)&&(ffff==1)&&(fffff==1))	
				   {
					
                       if((cmbvisitinghrs.getSelectedItem()!="SET")&&(cmbvisitinghrs3.getSelectedItem()!="SET"))
					   {
						for(i=1;i<=Integer.parseInt(txtvisitinghrs.getText());i++)
						{
							ctr3++;
							if(ctr3<=12)
							{
								tttt=1;
							}
							else
							{
								tttt=0;
							}

						
					   }
						for(i=1;i<=Integer.parseInt(txtvisitinghrs3.getText());i++)
						{
							ctr++;
						}
							if(ctr<=60)
							{
								tt=1;
							}
							else
							{
								tt=0;
							}
						for(i=1;i<=Integer.parseInt(txtvisitinghrs4.getText());i++)
						{
							ctr1++;
						}
							if(ctr1<=12)
							{
								t5=1;
							}
							else
							{
								t5=0;
							}

						for(i=1;i<=Integer.parseInt(txtvisitinghrs5.getText());i++)
						{
							ctr2++;
						}
							if(ctr2<=60)
							{
								ttt=1;
							}
							else
							{
								ttt=0;
							}
						
				 if((tt==1)&&(t5==1)&&(ttt==1)&&(tttt==1))
                  {		
					if(ctr4==1)
					{		
						if(c==1)
						{
				ps.executeUpdate();
			  JOptionPane.showMessageDialog(null,"Saved Successfully");
			  btnsave.setEnabled(false);
			  btnedit.setEnabled(false);
			 // txtemail2.setVisible(false);
			  //System.out.println("11111");
			  Statement st=con.createStatement();
			  System.out.println("111111111");
			  st.executeUpdate("update keytbl set drid=drid+1");
			  cmbspecialized.setSelectedItem("SELECT");
			  cmbvisitinghrs.setSelectedItem("SET");
			  cmbvisitinghrs3.setSelectedItem("SET");
			  chsun.setSelected(false);
			  chmon.setSelected(false);
			  chtue.setSelected(false);
			  chwed.setSelected(false);
			  chthu.setSelected(false);
			  chfri.setSelected(false);
			  chsat.setSelected(false);
			  	txtid.setText("");
				txtname.setText("");
				txtdoj.setText("");
				txtaddress.setText("");
				txtcontact.setText("");
				txtemail.setText("");
				txtvisitingdays.setText("");
				txtvisitinghrs.setText("");
				txtvisitinghrs3.setText("");
				txtvisitinghrs4.setText("");
				txtvisitinghrs5.setText("");
				txtvisitinghrs1.setText("");
						}
						else{
							JOptionPane.showMessageDialog(null,"contact invalid");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"invalid name ");
						txtname.setText("");
					}

			  
				  }
				  else{
					JOptionPane.showMessageDialog(null,"enter appropiate time");
				     txtvisitinghrs.setText("");
				     txtvisitinghrs3.setText("");
				     txtvisitinghrs4.setText("");
				     txtvisitinghrs5.setText("");
				      txtvisitinghrs1.setText("");
				  }
						
		
					   }
					   else{
						JOptionPane.showMessageDialog(null,"invalid meridiem");
					   }
				   }
				   else
				   {
					JOptionPane.showMessageDialog(null,"invalid time");
				   }
		
				}
				else
				{
					JOptionPane.showMessageDialog(null,"please select appropiate specialist");
				}
			  }
			  else
			  {
            
			  JOptionPane.showMessageDialog(null,"please fill all the details properly");
		   txtid.setText("");
		  txtname.setText("");
		  txtdoj.setText("");
		  txtaddress.setText("");
		  txtcontact.setText("");
		  txtemail.setText("");
		  txtvisitingdays.setText("");
		  txtvisitinghrs.setText("");
		  //txtemail2.setText("@gmail.com");
		  cmbspecialized.setSelectedItem("SELECT");

	          }
			  con.close();
				}
				
				
			
		  catch(Exception ee)
		  {
			  System.out.println(ee);
		  }
			}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	  

         if(e.getSource()==btncancel)
		 {
          this.dispose();
		 }	
          
          if(e.getSource()==btnedit)
		  { 

				
			try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
					if(flg==1)
					{
				
				Statement st=con.createStatement();				
				String dstr="delete from doctortbl where drid='"+txtid.getText()+"'";
				st.executeUpdate(dstr);
			  String str="insert into doctortbl(drid,drDOJ,drname,draddress,drcontact,dremail,specializedin,visitingdays,visitinghrs)values(?,?,?,?,?,?,?,?,?)";
	  		  PreparedStatement ps=con.prepareStatement(str);



			  if((txtid.getText().trim().length()!=0)&&(txtdoj.getText().trim().length()!=0)&&(txtname.getText().trim().length()!=0)&&(txtaddress.getText().trim().length()!=0)&&(txtdoj.getText().trim().length()!=0)&&(txtcontact.getText().trim().length()!=0)&&(txtemail.getText().trim().length()!=0)&&(txtvisitingdays.getText().trim().length()!=0))
			  {
				if(cmbspecialized.getSelectedItem()!="SELECT")
				{	

				if(txtvisitinghrs.getText().length()!=0)
				{
				 s=txtvisitinghrs.getText();
				System.out.println("check value$$"+s+"$$");
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
				}
				 if(txtvisitinghrs3.getText().length()!=0)
				 {

				     w=txtvisitinghrs3.getText();
			      for(i=0;i<w.length();i++)
			       {
					  ctr++;
				     chh=w.charAt(i);
				     if((chh>='0'&& chh<='9')&&(ctr<=60))
				     {
                         fff=1;
				      }
					  else{
						fff=0;
						break;
					  }
				   }
				 }
				 if(txtvisitinghrs4.getText().length()!=0)
				 {
				   
				   p=txtvisitinghrs4.getText();
			      for(i=0;i<p.length();i++)
			       {
				     chhh=p.charAt(i);
				     if(chhh>='0'&& chhh<='9')
				     {
                         ffff=1;
				      }
					  else{
						ffff=0;
						break;
					  }
				   }
				 }
				   if(txtvisitinghrs5.getText().length()!=0)
				   {
				   t=txtvisitinghrs5.getText();
			      for(i=0;i<t.length();i++)
			       {
				     chhhh=t.charAt(i);
				     if(chhhh>='0'&& chhhh<='9')
				     {
                         fffff=1;
				      }
					  else{
						fffff=0;
						break;
					  }
				   }

				   }
                    if(txtvisitinghrs.getText().length()!=0)
					{
					for(i=1;i<=Integer.parseInt(txtvisitinghrs.getText());i++)
						{
							ctr3++;
							if(ctr3<=12)
							{
								tttt=1;
							}
							else
							{
								tttt=0;
							}

						}
					}
					if(txtvisitinghrs3.getText().length()!=0)
					{
						for(i=1;i<=Integer.parseInt(txtvisitinghrs3.getText());i++)
						{
							ctr++;
						}
							if(ctr<=60)
							{
								tt=1;
							}
							else
							{
								tt=0;
							}
					}
					   if(txtvisitinghrs4.getText().length()!=0)
					   {
						for(i=1;i<=Integer.parseInt(txtvisitinghrs4.getText());i++)
						{
							ctr1++;
						}
							if(ctr1<=12)
							{
								t5=1;
							}
							else
							{
								t5=0;
							}
					   }
                        if(txtvisitinghrs5.getText().length()!=0)
						{
						for(i=1;i<=Integer.parseInt(txtvisitinghrs5.getText());i++)
						{
							ctr2++;
						}
							if(ctr2<=60)
							{
								ttt=1;
							}
							else
							{
								ttt=0;
							}
						}
						if(cmbvisitinghrs.getSelectedItem().toString().equals("SET"))
						{
							set=1;
						}
						else{
							set=0;
						}

						if(cmbvisitinghrs3.getSelectedItem().toString().equals("SET"))
						{
							set2=1;
						}
						else
						{
							set2=0;
						}

				if((tt==1)&&(t5==1)&&(ttt==1)&&(tttt==1)&&(ff==1)&&(fff==1)&&(ffff==1)&&(fffff==1)&&(set==0)&&(set2==0))
                  {	
                    System.out.println("#"+ts+"#");
					ts=1;
				  }
				  else{
					ts=0;
				  }


					if((ts==1)&&(change==1))
					{
							ps.setString(1,txtid.getText());
							ps.setString(2,txtdoj.getText());
							ps.setString(3,txtname.getText());
							ps.setString(4,txtaddress.getText());
							ps.setString(5,txtcontact.getText());
							ps.setString(6,txtemail.getText());
							ps.setString(7,""+cmbspecialized.getSelectedItem());
							ps.setString(8,txtvisitingdays.getText());
						    ps.setString(9,txtvisitinghrs.getText()+lbldot1.getText()+txtvisitinghrs3.getText()+cmbvisitinghrs.getSelectedItem()+txtvisitinghrs2.getText()+""+txtvisitinghrs4.getText()+lbldot2.getText()+txtvisitinghrs5.getText()+cmbvisitinghrs3.getSelectedItem());
						   if((txtvisitinghrs.getText().length()!=0)&&(txtvisitinghrs3.getText().length()!=0)&&(txtvisitinghrs4.getText().length()!=0)&&(txtvisitinghrs5.getText().length()!=0)/*(cmbvisitinghrs.getSelectedItem()!="SET")&&(cmbvisitinghrs3.getSelectedItem()!="SET")*/)
						    {
									ps.executeUpdate();
									btnedit.setEnabled(false);
									btnsave.setEnabled(false);
									JOptionPane.showMessageDialog(null,"update succesfully");
									txtid.setText("");
									txtname.setText("");
									// txtdoj.setText("");
									txtaddress.setText("");
									txtcontact.setText("");
									txtemail.setText("");
									txtvisitingdays.setText("");
									txtvisitinghrs.setText("");
									txtvisitinghrs.setText("");
									txtvisitinghrs3.setText("");
									txtvisitinghrs4.setText("");
									txtvisitinghrs5.setText("");
									txtvisitinghrs1.setText("");
									 chsun.setSelected(false);
									chmon.setSelected(false);
									chtue.setSelected(false);
									chwed.setSelected(false);
									chthu.setSelected(false);
									chfri.setSelected(false);
									chsat.setSelected(false);
									cmbspecialized.setSelectedItem("SELECT");
									cmbvisitinghrs.setSelectedItem("SET");
									cmbvisitinghrs3.setSelectedItem("SET");

							}
					}
					if(change==0)
					{
							ps.setString(1,txtid.getText());
							ps.setString(2,txtdoj.getText());
							ps.setString(3,txtname.getText());
							ps.setString(4,txtaddress.getText());
							ps.setString(5,txtcontact.getText());
							ps.setString(6,txtemail.getText());
							ps.setString(7,""+cmbspecialized.getSelectedItem());
							ps.setString(8,txtvisitingdays.getText());

									ps.setString(9,txtvisitinghrs1.getText());
									ps.executeUpdate();
									btnedit.setEnabled(false);
									btnsave.setEnabled(false);
									JOptionPane.showMessageDialog(null,"update successfully");
									txtid.setText("");
									txtname.setText("");
									// txtdoj.setText("");
									txtaddress.setText("");
									txtcontact.setText("");
									txtemail.setText("");
									txtvisitingdays.setText("");
									txtvisitinghrs.setText("");
									txtvisitinghrs.setText("");
									txtvisitinghrs3.setText("");
									txtvisitinghrs4.setText("");
									txtvisitinghrs5.setText("");
									txtvisitinghrs1.setText("");
									 chsun.setSelected(false);
									chmon.setSelected(false);
									chtue.setSelected(false);
									chwed.setSelected(false);
									chthu.setSelected(false);
									chfri.setSelected(false);
									chsat.setSelected(false);
									cmbspecialized.setSelectedItem("SELECT");
									cmbvisitinghrs.setSelectedItem("SET");
									cmbvisitinghrs3.setSelectedItem("SET");
									
					}
                   if((ts==0)&&(change==1))
				   {
				   JOptionPane.showMessageDialog(null,"invalid time");
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
  if(e.getSource()==btnchange)
  {
	
	//int result=JOptionPane.YES_NO_OPTION;
	int result=JOptionPane.showConfirmDialog (null,"sure ? you want to change time slot ? ",
	"Confirmation",JOptionPane.YES_NO_OPTION);
    if(result==JOptionPane.YES_OPTION)
	{      change=1;
				txtvisitinghrs.setVisible(true);
				txtvisitinghrs2.setVisible(true);
				txtvisitinghrs3.setVisible(true);
				txtvisitinghrs4.setVisible(true);
				txtvisitinghrs5.setVisible(true);
				cmbvisitinghrs.setVisible(true);
				cmbvisitinghrs3.setVisible(true);
				btnchange.setEnabled(false);

		       
					
						//System.out.println("#"+ts+"#");
					//	(cmbvisitinghrs.getSelectedItem()!="SET")&&(cmbvisitinghrs3.getSelectedItem().toString()!="SET")&&
				       //  System.out.println("=="+(tt)+" "+(t5)+" "+(ttt)+" "+(tttt)+" "+(ff)+" "+(fff)+" "+(ffff)+" "+(fffff)+"==");

				   
				   }
				   
	
	if(result==JOptionPane.NO_OPTION)
	{
		change=0;
				txtvisitinghrs.setVisible(false);
				txtvisitinghrs2.setVisible(false);
				txtvisitinghrs3.setVisible(false);
				txtvisitinghrs4.setVisible(false);
				txtvisitinghrs5.setVisible(false);
				cmbvisitinghrs.setVisible(false);
				cmbvisitinghrs3.setVisible(false);
	}

  }
  }

}