import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.*;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.table.DefaultTableModel;
public class testrequest extends JFrame implements ActionListener
{
	int ctr4=0;
	char nn;
	String n="";
	String arr[]=new String[25];
	String arr2[]=new String[25];
	
	int i,j,flaag=0;
	String per="";
	 String[]col={"TEST ID","TEST NAME"};
	 
	Object[][] data={{"",""}};
	DefaultTableModel model=new DefaultTableModel(col,0);
	JScrollPane sp;
	JTable tbl=new JTable(data,col);
JRadioButton rbtpatient=new JRadioButton("Patient");
JRadioButton rbtnonpatient=new JRadioButton("Non-patient");
ButtonGroup bg=new ButtonGroup();

JLabel lblreqid=new JLabel("Test request id");
JTextField txtreqid=new JTextField(15);

JLabel lbldate=new JLabel("Date");
JTextField txtdate=new JTextField(15);

JLabel  lblname=new JLabel("Test name");
JComboBox cmbname=new JComboBox();

JLabel lblid=new JLabel ("Test id");
JTextField txtid=new JTextField(15);

JLabel lblaid=new JLabel ("Admit id");
JTextField txtaid=new JTextField(15);

JLabel lblnpid=new JLabel (" Non-Patient id");
JTextField txtnpid=new JTextField(15);

JLabel lblnpname=new JLabel ("Non-Patient name");
JTextField txtnpname=new JTextField(15);

JLabel lblnpcontact=new JLabel (" Non-Patient contact");
JTextField txtnpcontact=new JTextField(15);

JLabel lblref=new JLabel ("referenced By:");
JTextField txtref=new JTextField(15);

JLabel lblheading=new JLabel("TEST REQUEST FORM");
JLabel lblleft=new JLabel();
JLabel lblright=new JLabel();


SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
Date dt=new Date();

JButton btnnew=new JButton("NEW");
JButton btnsearch=new JButton("SEARCH");
JButton btnsave=new JButton("SAVE");
JButton btnedit=new JButton("EDIT");
JButton btncancel=new JButton("CANCEL");
JButton btnadd=new JButton("ADD");
JButton btnremove=new JButton("REMOVE");


public testrequest()
{
	

	txtdate.setText(""+sdf.format(dt));


	
	
	
	
		sp=new JScrollPane(tbl); 
		 tbl.setModel(model); 
		 add(sp);
		sp.setBounds(100,550,650,300);
		     tbl.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
     tbl.setRowHeight(3,40); 
		  setTitle("TEST REQUEST...");
          setLayout(null);
		  Dimension size=Toolkit.getDefaultToolkit().getScreenSize(); 
          setVisible(true);
          setSize(1000,1000);
		  setLocation(((int)size.getWidth()/2-500),((int)size.getHeight()/2-500));
		  tbl.getTableHeader().setFont(new Font( "Franklin Gothic Medium Cond ",Font.BOLD,15)); 
		  rbtpatient.setBounds(150,100,200,40);
		  rbtpatient.setFont(new Font("Courier New",Font.BOLD,25));
		  rbtnonpatient.setBounds(400,100,400,40);;
		  rbtnonpatient.setFont(new Font("Courier New",Font.BOLD,25));
		  bg.add(rbtpatient);
		  bg.add(rbtnonpatient);

		  		lblheading.setBounds(0,0,1000,70);
	lblheading.setOpaque(true);
	lblleft.setOpaque(true);
	lblright.setOpaque(true);
	  lblheading.setHorizontalAlignment(JLabel.CENTER);
	  lblheading.setFont(new Font("Courier New",Font.BOLD,25));
	  lblheading.setBackground(new Color(63,147,203));
	  lblheading.setForeground(new Color(0,0,0));

     lblleft.setBounds(0,0,20,1000);
	 lblleft.setBackground(new Color(133,186,222));
	 lblright.setBounds(960,0,20,1000);
	 lblright.setBackground(new Color(133,186,222));

		lblreqid.setBounds(150,300,200,40);
		lblreqid.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		txtreqid.setBounds(350,300,150,40);
		
		lbldate.setBounds(540,300,200,40);
		lbldate.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		txtdate.setBounds(650,300,150,40);
		
		lblname.setBounds(150,400,200,40);
		lblname.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		cmbname.setBounds(350,400,150,40);
		
		lblid.setBounds(540,400,200,40);
		lblid.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		txtid.setBounds(650,400,150,40);
		
		lblaid.setBounds(150,200,200,40);
		lblaid.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		txtaid.setBounds(350,200,150,40);
		
		lblnpid.setBounds(150,200,200,40);
		lblnpid.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		txtnpid.setBounds(350,200,150,40);
		
		lblnpname.setBounds(540,200,200,40);
		lblnpname.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		txtnpname.setBounds(700,200,200,40);
		
		lblnpcontact.setBounds(150,500,200,40);
		lblnpcontact.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		txtnpcontact.setBounds(350,500,150,40);
		
		lblref.setBounds(540,500,200,40);
		lblref.setFont(new Font("Franklin Gothic Medium Cond",Font.BOLD,20));
		txtref.setBounds(670,500,150,40);

		
		
		btnnew.setBounds(200,870,100,40);
		btnnew.setBackground(new Color(133,186,222));
		btnnew.setForeground(new Color(0,0,0));
		btnsave.setBounds(310,870,100,40);
		btnsave.setBackground(new Color(133,186,222));
		btnsave.setForeground(new Color(0,0,0));
		btnsearch.setBounds(420,870,100,40);
		btnsearch.setBackground(new Color(133,186,222));
		btnsearch.setForeground(new Color(0,0,0));
		btnedit.setBounds(530,870,100,40);
		btnedit.setBackground(new Color(133,186,222));
		btnedit.setForeground(new Color(0,0,0));
		btncancel.setBounds(640,870,100,40);
		btncancel.setBackground(new Color(133,186,222));
		btncancel.setForeground(new Color(0,0,0));
		btnadd.setBounds(770,650,100,40);
		btnadd.setBackground(new Color(133,186,222));
		btnadd.setForeground(new Color(0,0,0));
		btnremove.setBounds(770,700,110,40);
		btnremove.setBackground(new Color(133,186,222));
		btnremove.setForeground(new Color(0,0,0));
		
		add(lblid);
		add(lblname);
		add(lbldate);
		add(lblreqid);
		add(lblaid);
		add(lblnpid);
		add(lblnpname);
		add(lblnpcontact);
		add(lblref);
		add(lblheading);
		add(lblleft);
		add(lblright);
		
		add(txtid);
		add(txtdate);
		add(txtreqid);
		add(txtaid);
		add(txtnpid);
		add(txtnpname);
		add(txtnpcontact);
		add(txtref);
		add(cmbname);
		add(rbtpatient);
		add(rbtnonpatient);
		add(btnnew);
		add(btnsave);
		add(btnsearch);
		add(btnedit);
		add(btncancel);
		add(btnadd);
		add(btnremove);
		//setBackground(new Color(133,186,222));
		
		
		btnnew.addActionListener(this);
		btnsearch.addActionListener(this);
		btnsave.addActionListener(this);
		btncancel.addActionListener(this);
		btnedit.addActionListener(this);
		btnadd.addActionListener(this);
		btnremove.addActionListener(this);
	    rbtpatient.addActionListener(this);
	    rbtnonpatient.addActionListener(this);
		cmbname.addItem("SELECT");
					
		
		lblaid.setVisible(false);
		txtaid.setVisible(false);
		
		lblnpid.setVisible(false);
		txtnpid.setVisible(false);
		
		lblnpname.setVisible(false);
		txtnpname.setVisible(false);
		
		lblnpcontact.setVisible(false);
		txtnpcontact.setVisible(false);
		
		lblref.setVisible(false);
		txtref.setVisible(false);
		tbl.setEnabled(false);		
		txtaid.setEditable(false);
		txtid.setEditable(false);
		txtreqid.setEditable(false);
		txtnpid.setEditable(false);
		txtdate.setEditable(false);
     try
      {   
		Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
		String str="select * from testdetailtbl";
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery(str);	
		while(res.next())
		{
			cmbname.addItem(res.getString(2));
		}
	  }
	catch(Exception ee)
	{
		System.out.println(ee);
	}
	cmbname.addActionListener(this);
	btnsave.setEnabled(false);
	btnedit.setEnabled(false);
}
public void actionPerformed(ActionEvent e)
{
int i=0;

         if(rbtpatient.isSelected())
		 {
			    lblaid.setVisible(true);
			    txtaid.setVisible(true);
			 
				lblnpid.setVisible(false);
				txtnpid.setVisible(false);
				
				lblnpname.setVisible(false);
				txtnpname.setVisible(false);
				
				lblnpcontact.setVisible(false);
				txtnpcontact.setVisible(false);
				
				lblref.setVisible(false);
				txtref.setVisible(false);			 
		 }
		 if(rbtnonpatient.isSelected())
		 {
			 lblnpid.setVisible(true);
			 txtnpid.setVisible(true);
			 
			 lblnpname.setVisible(true);
			 txtnpname.setVisible(true);
			 
			 lblnpcontact.setVisible(true);
			 txtnpcontact.setVisible(true);
			 
			 lblref.setVisible(true);
			 txtref.setVisible(true);
			 
		     lblaid.setVisible(false);
		     txtaid.setVisible(false);			 
		 }
		if(e.getSource()==btnadd)
		{
			int f=0;
		  if((txtid.getText().trim().length()!=0)&&(cmbname.getSelectedItem()!="SELECT"))
		  {


				for(i=0;i<tbl.getRowCount();i++)
				{
					if(txtid.getText().equals(tbl.getValueAt(i,0)))
					{
						JOptionPane.showMessageDialog(null,"already exist");
						txtid.setText("");
				        //txtvalue.setText("");
						f=1;
						break;
					}
				}
				if(f==0)
				{
				arr2[i]=(txtid.getText());
				arr[i]=(""+cmbname.getSelectedItem());
				
			Vector v=new Vector();
			v.add(arr2[i]);
			v.add(arr[i]);
			model.addRow(v);
			txtid.setText("");
			cmbname.addItem("SELECT");
				}	
			
		  }
       }
		if(e.getSource()==btnnew)
		{
			int ff=0;
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
					Statement st=con.createStatement();
					String str="select * from keytbl";	
                    ResultSet res=st.executeQuery(str);					
					while(res.next())
					{							
				        if(rbtnonpatient.isSelected())
						{
						cmbname.addItem("SELECT");
						txtreqid.setText("treq/"+res.getString(5));
						txtnpid.setText("Np/"+res.getString(6));
						txtid.setText("");
						txtnpname.setText("");
						txtnpcontact.setText("");	
						txtdate.setText(""+sdf.format(dt));															
						}
					
						if(rbtpatient.isSelected())
						{		

						 String wstr=JOptionPane.showInputDialog(null,"enter admit id");	
						 String str2="select * from admittbl where Aid='"+wstr+"'";
						 Statement st2=con.createStatement();
						 ResultSet res2=st2.executeQuery(str2);
						 String str3="select * from dischargetbl where Aid='"+wstr+"'";
						 Statement st3=con.createStatement();
						 ResultSet res3=st3.executeQuery(str3);
						 txtdate.setText(""+sdf.format(dt));	
						 while(res3.next())
						 {
							flaag=1;
						 }			
						 if(flaag==1)
						 {
							JOptionPane.showMessageDialog(null,"patient was discharged");
							btnsave.setEnabled(false);
						 }	
						 else
						 {										
						 while(res2.next())
						 {
                            ff=1;
							if(ff==1)
							{
								txtaid.setText(res2.getString(3));
							}
						 }
						 if(ff==1)
						 {
							cmbname.addItem("SELECT");
							txtreqid.setText("treq/"+res.getString(5));
							//txtpid.setText("p/"+res.getString(4));
							txtid.setText("");
							txtnpid.setText("");
							txtnpname.setText("");
							txtnpcontact.setText("");
						 }
						 else
						 {
							JOptionPane.showMessageDialog(null,"patient does not exist");
						 }	
						}														
						}
						}   		
							
                     btnsave.setEnabled(true);					
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
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				if(rbtnonpatient.isSelected())
				{			
				String wstr=JOptionPane.showInputDialog(null,"Enter non-patient request id:");
				String str="select * from nonpatientreqtbl where treqid='"+wstr+"'";	
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				btnedit.setEnabled(true);
				btnsave.setEnabled(false);
				model.setRowCount(0);
				i=0;
			
				while(res.next())
				{       
			        txtreqid.setText(res.getString(1));
					txtdate.setText(res.getString(4));
					txtnpid.setText(res.getString(5));
					txtnpname.setText(res.getString(6));
					txtnpcontact.setText(res.getString(7));
					txtref.setText(res.getString(8));
			        Vector v=new Vector();
					v.add(res.getString(2));
					v.add(res.getString(3));
					model.addRow(v);
					flg=1;
				 }
					
				}
				
				if(rbtpatient.isSelected())
				{
					
				String wstr=JOptionPane.showInputDialog(null,"Enter patient request id:");
				String str="select * from patientreqtbl where treqid='"+wstr+"'";	
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				btnedit.setEnabled(true);
				btnsave.setEnabled(false);
				model.setRowCount(0);
				i=0;
				while(res.next())
				{       
			        txtreqid.setText(res.getString(1));
					txtaid.setText(res.getString(2));
					txtdate.setText(res.getString(5));
			        Vector v=new Vector();
					v.add(res.getString(3));
					v.add(res.getString(4));
					model.addRow(v);
					flg=1;
				 }
				
				}
				tbl.setEnabled(false);
				if(flg==0)
				{
					JOptionPane.showMessageDialog(null,"kindly please select appropiate id");
					txtreqid.setText("");
					txtid.setText("");
					txtdate.setText("");
				}
			}			
				catch(Exception ee)
				{
					System.out.println(ee);
				}
		}
		
		if(e.getSource()==cmbname)
		{
			try
			{   
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select TESTid from testdetailtbl where TESTname='"+cmbname.getSelectedItem()+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				while(res.next())
				{
					txtid.setText(res.getString(1));
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
		   int flg=0,j=0;
		   int temp=0,tempp=0;
		   int sav=0,sav2=0;
		   try
			{
			
				
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");

				if(rbtnonpatient.isSelected())
				{
                String str="insert into nonpatientreqtbl(treqid,tid,tname,tdate,Npid,Npname,Npcontact,referencedBy)values(?,?,?,?,?,?,?,?)";	
				PreparedStatement ps=con.prepareStatement(str);
				String str2="Select * from patientreqtbl where treqid='"+txtreqid.getText()+"'";
			     Statement st2=con.createStatement();
			    ResultSet res=st2.executeQuery(str2);
			
               
				for(i=0;i<tbl.getRowCount();i++)
				{
					
					ps.setString(1,txtreqid.getText());
					ps.setString(4,txtdate.getText());
					ps.setString(2,""+tbl.getValueAt(i,0));	
				    ps.setString(3,""+tbl.getValueAt(i,1));	
					ps.setString(5,txtnpid.getText());
					ps.setString(6,txtnpname.getText());
					ps.setString(7,txtnpcontact.getText());			
					ps.setString(8,txtref.getText());  
					while(res.next())
					{
						temp=1;
					}       
					if(temp==1)
					{
						JOptionPane.showMessageDialog(null,"request is already submitted");
					}   
					else
					{    
					 n=txtnpname.getText();
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
					
				
				if((txtnpid.getText().trim().length()!=0)&&(model.getRowCount()!=0)&&(txtnpname.getText().trim().length()!=0)&&(txtnpcontact.getText().trim().length()!=0))
				{
					if(ctr4==1)
					{
					  ps.executeUpdate();
					  sav2=1;
					Statement st=con.createStatement();
					//st.executeUpdate("update keytbl set treqid=treqid+1");
					st.executeUpdate("update keytbl set npid=npid+1");															  
				}

				}
					}
				}
				if(ctr4==0)
				{
					JOptionPane.showMessageDialog(null,"invalid name");
				}
					
							
					//JOptionPane.showMessageDialog(null,"Saved Successfully");

					btnsave.setEnabled(false);
					model.setRowCount(0);
					txtid.setText("");
					txtreqid.setText("");
					txtdate.setText("");
                    txtnpid.setText("");
                    txtnpname.setText("");
                    txtnpcontact.setText("");										
					cmbname.addItem("SELECT");
					lblaid.setVisible(false);
					txtaid.setVisible(false);
							
					lblnpid.setVisible(false);
					txtnpid.setVisible(false);
							
					lblnpname.setVisible(false);
					txtnpname.setVisible(false);
							
					lblnpcontact.setVisible(false);
					txtnpcontact.setVisible(false);
							
					lblref.setVisible(false);
					txtref.setVisible(false);	


				}
				if(rbtpatient.isSelected())
				{

					String str="insert into patientreqtbl(treqid,aid,tid,tname,tdate)values(?,?,?,?,?)";
				    PreparedStatement ps=con.prepareStatement(str);
               
				for(i=0;i<tbl.getRowCount();i++)
				{
					ps.setString(1,txtreqid.getText());
					ps.setString(5,txtdate.getText());
					ps.setString(3,""+tbl.getValueAt(i,0));	
				    ps.setString(4,""+tbl.getValueAt(i,1));	
                    ps.setString(2,txtaid.getText());	

				if((model.getRowCount()!=0)&&(txtaid.getText().trim().length()!=0))
				{
					ps.executeUpdate();
					sav=1;
					Statement st=con.createStatement();
					//st.executeUpdate("update keytbl set treqid=treqid+1");
					//st.executeUpdate("update keytbl set pid=pid+1");
					//JOptionPane.showMessageDialog(null,"Saved Successfully");
				}

				
				}


				            
							btnsave.setEnabled(false);
							btnedit.setEnabled(false);
							model.setRowCount(0);
							txtid.setText("");
							txtreqid.setText("");
							txtdate.setText("");
							txtaid.setText("");
							cmbname.addItem("SELECT");
							lblaid.setVisible(false);
							txtaid.setVisible(false);
							
							lblnpid.setVisible(false);
							txtnpid.setVisible(false);
							
							lblnpname.setVisible(false);
							txtnpname.setVisible(false);
							
							lblnpcontact.setVisible(false);
							txtnpcontact.setVisible(false);
							
							lblref.setVisible(false);
							txtref.setVisible(false);
				}
				if((sav==1)||(sav2==1))
				{
					Statement st=con.createStatement();
					st.executeUpdate("update keytbl set treqid=treqid+1");
					JOptionPane.showMessageDialog(null,"Saved Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"please request test properly");

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
					if(rbtnonpatient.isSelected())
					{
					String dstr="delete from nonpatientreqtbl where Npid='"+txtnpid.getText()+"'";
					st.executeUpdate(dstr);
					String str="insert into nonpatientreqtbl(treqid,tdate,Npid,Npname,Npcontact,referencedBy)values(?,?,?,?,?,?,?,?)";	
					PreparedStatement ps=con.prepareStatement(str);
               
					for(i=0;i<tbl.getRowCount();i++)
					{
					 
					ps.setString(1,txtreqid.getText());
					ps.setString(4,txtdate.getText());
					ps.setString(5,txtnpid.getText());
					ps.setString(6,txtnpname.getText());
					ps.setString(7,txtnpcontact.getText());			
					ps.setString(8,txtref.getText());  
					//ps.setString(2,""+tbl.getValueAt(i,0));	
				    //ps.setString(3,""+tbl.getValueAt(i,1));	  
                    //tbl.setEnabled(false);					
					ps.executeUpdate();
					}
					}
					if(rbtpatient.isSelected())
					{
						String dstr="delete from  patientreqtbl where pid='"+txtaid.getText()+"'";
						st.executeUpdate(dstr);
						if(rbtpatient.isSelected())
						{
							String str="insert into patientreqtbl(treqid,pid,tid,tname,tdate)values(?,?,?,?,?)";
							PreparedStatement ps=con.prepareStatement(str);
               
							for(i=0;i<tbl.getRowCount();i++)
							{
								
								ps.setString(1,txtreqid.getText());
								ps.setString(5,txtdate.getText());
								ps.setString(2,txtaid.getText());	
								//ps.setString(3,""+tbl.getValueAt(i,0));	
								//ps.setString(4,""+tbl.getValueAt(i,1));	
                                //tbl.setEnabled(false);								
								ps.executeUpdate();
							}
						}	
					}						
										
							JOptionPane.showMessageDialog(null,"Update Successfully");
							btnedit.setEnabled(false);
							model.setRowCount(0);
							txtid.setText("");
							txtreqid.setText("");
							txtdate.setText("");
							txtaid.setText("");
							cmbname.addItem("SELECT");
							
							
							lblaid.setVisible(false);
							txtaid.setVisible(false);
							
							lblnpid.setVisible(false);
							txtnpid.setVisible(false);
							
							lblnpname.setVisible(false);
							txtnpname.setVisible(false);
							
							lblnpcontact.setVisible(false);
							txtnpcontact.setVisible(false);
							
							lblref.setVisible(false);
							txtref.setVisible(false);	

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
		  if(e.getSource()==btnremove)
	       {
		   if(tbl.getSelectedRow()==0)
		   {			   
		   model.removeRow(tbl.getSelectedRow());
		   }
	   }
}
}
		