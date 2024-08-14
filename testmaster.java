import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
public class testmaster extends JFrame implements ActionListener
{
    String arr[]=new String[20];
	String arr2[]=new String[20];
	String arr3[]=new String[25];
	String[]col={"testdetail","testvalue"};
	
	Object[][] data={{"",""}};
	DefaultTableModel model=new DefaultTableModel(col,0);
	JScrollPane sp;
	JTable tbl=new JTable(data,col);
	

	JLabel lblheading=new JLabel("TEST MASTER");
	JLabel lblleft=new JLabel();
	JLabel lblright=new JLabel();
JLabel lblid=new JLabel("TEST id");
JTextField txtid=new JTextField(15);

JLabel lblname=new JLabel("TEST name");
JTextField txtname=new JTextField(15);

JLabel lblcharge=new JLabel("TEST charge");
JTextField txtcharge=new JTextField(15);

JLabel lbldetails=new JLabel("TEST details");
JTextField txtdetails=new JTextField(15);

JLabel lblvalue =new JLabel("TEST value");
JTextField txtvalue=new JTextField(15);

JButton btnadd=new JButton("ADD");
JButton btnremove=new JButton("REMOVE");
JButton btnnew=new JButton("NEW");
JButton btnsave=new JButton("SAVE");
JButton btnsearch=new JButton("SEARCH");
JButton btnedit=new JButton("EDIT");
JButton btncancel=new JButton("CANCEL");




  public testmaster()
  {
	  	 
		 sp=new JScrollPane(tbl); 
		 tbl.setModel(model); 
		 add(sp);
		sp.setBounds(50,500,750,300);
  setTitle("TEST MASTER...");
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
  
  lblid.setBounds(150,200,130,40);
  	  lblid.setFont(new Font("Courier new",Font.BOLD,25));

  txtid.setBounds(280,200,80,40);
  
  lblname.setBounds(150,280,150,40);
  lblname.setFont(new Font("Courier new",Font.BOLD,25));

  txtname.setBounds(300,280,200,40);
  
  lbldetails.setBounds(530,280,200,40);
    lbldetails.setFont(new Font("Courier new",Font.BOLD,25));

  txtdetails.setBounds(720,280,200,40);
  
  lblcharge.setBounds(150,370,180,40);
  lblcharge.setFont(new Font("Courier new",Font.BOLD,25));

  txtcharge.setBounds(330,370,200,40);
  
  lblvalue.setBounds(530,370,200,40);
    lblvalue.setFont(new Font("Courier new",Font.BOLD,25));

  txtvalue.setBounds(720,370,200,40);
  
  btnadd.setBounds(810,550,80,40);
  btnremove.setBounds(810,620,100,40);

  btnnew.setBounds(100,850,80,40);
    btnnew.setFont(new Font("Courier new",Font.BOLD,15));
	btnsave.setFont(new Font("Courier new",Font.BOLD,15));
  btncancel.setFont(new Font("Courier new",Font.BOLD,15));
  btnsearch.setFont(new Font("Courier new",Font.BOLD,15));
  btnadd.setFont(new Font("Courier new",Font.BOLD,15));
  btnedit.setFont(new Font("Courier new",Font.BOLD,15));
  btnremove.setFont(new Font("Courier new",Font.BOLD,15));


  btnsave.setBounds(200,850,80,40);
  btnsearch.setBounds(300,850,100,40);
  btnedit.setBounds(440,850,100,40);
  btncancel.setBounds(560,850,100,40);
  
  add(lblid);
  add(lblname);
  add(lblcharge);
  add(lbldetails);
  add(lblvalue);
  add(lblheading);
  add(lblleft);
  add(lblright);
  
  add(txtid);
  add(txtname);
  add(txtcharge);
  add(txtdetails);
  add(txtvalue);
  
  add(btnadd);
  add(btnremove);
  add(btnnew);
  add(btnsearch);
  add(btnsave);
  add(btnedit);
  add(btncancel);
  
  btnadd.addActionListener(this);
  btnremove.addActionListener(this);
  btnnew.addActionListener(this);
  btncancel.addActionListener(this);
  btnedit.addActionListener(this);
  btnsearch.addActionListener(this);
  btnsave.addActionListener(this);
  btnsave.setEnabled(false);
  btnedit.setEnabled(false);
  txtid.setEditable(false);
  
  }
  
  public void actionPerformed(ActionEvent e)
  { 
      int i=0;
	  int flag=0;
	  int ff=0;
	  if(e.getSource()==btnadd)
	  {			
		

				for(i=0;i<tbl.getRowCount();i++)
				{
					if(txtdetails.getText().equals(tbl.getValueAt(i,0)))
					{
						JOptionPane.showMessageDialog(null,"already exist");
						txtdetails.setText("");
				        txtvalue.setText("");
						ff=1;
						break;
					}
				}
				if(ff==0)
				{
				arr2[i]=(txtdetails.getText());
				arr[i]=(txtvalue.getText());
				
				Vector v=new Vector();
		         v.add(arr2[i]);
				 v.add(arr[i]);
				model.addRow(v);
				txtdetails.setText("");
				txtvalue.setText("");
				}	

		//}
		//}
	  }

				
	  
		  
	 
	  
	   
	   if(e.getSource()==btnremove)
	   {
		   if(tbl.getSelectedRow()>=0)
		   {			   
		   model.removeRow(tbl.getSelectedRow());
		   }
	   }
	   if(e.getSource()==btnnew)
	   {
		   txtcharge.setText("");
		   txtvalue.setText("");
		   txtdetails.setText("");
		   txtname.setText("");
		   btnsave.setEnabled(true);
		   model.setRowCount(0);
		   btnedit.setEnabled(false);
		   		  try
				  {
			  Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
			  Statement st=con.createStatement();
			  String str="select testid from keytbl";
			  ResultSet res=st.executeQuery(str);
			  
			  while(res.next())
			  {
				  txtid.setText("T/"+res.getString(1));
			  }
			  
			  flag=1;
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
		   try
			{
				
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
                String str1="insert into testdetailtbl(TESTid,TESTname,TESTcharge,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
                String str2="insert into testvaluetbl(TESTid,TESTname,TESTcharge,V1,V2,V3,V4,V5,V6,V7,V8,V9,V10,V11,V12,V13,V14,V15)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";				
				PreparedStatement ps1=con.prepareStatement(str1);
				PreparedStatement ps2=con.prepareStatement(str2);
			    ps1.setString(1,txtid.getText());
			    ps1.setString(2,txtname.getText());
			    ps1.setString(3,txtcharge.getText());
				ps2.setString(1,txtid.getText());
			    ps2.setString(2,txtname.getText());
			    ps2.setString(3,txtcharge.getText());
				for(i=1;i<=tbl.getRowCount();i++)
				{
					ps1.setString(i+3,""+tbl.getValueAt(i-1,0));	
					ps2.setString(i+3,""+tbl.getValueAt(i-1,1));	
				}
				for(;i<=15;i++)
				{
					ps1.setString(i+3,"x");	
					ps2.setString(i+3,"x");	
				}
				if((txtid.getText().trim().length()!=0)&&(txtname.getText().length()!=0)&&(txtcharge.getText().trim().length()!=0))
				{

				ps1.executeUpdate();
				ps2.executeUpdate();
				JOptionPane.showMessageDialog(null,"Saved Successfully");
				Statement st=con.createStatement();
				st.executeUpdate("update keytbl set testid=testid+1");
				btnsave.setEnabled(false);
				model.setRowCount(0);
				txtcharge.setText("");
		        txtname.setText("");
		        txtid.setText("");
				
			    }
				
				else
				{
					JOptionPane.showMessageDialog(null,"please enter all the details properly");
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
				String s="",p="";
				String wstr=JOptionPane.showInputDialog(null,"Enter TEST id:");
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str1="select * from testdetailtbl where testid='"+wstr+"'";
				String str2="select * from testvaluetbl where testid='"+wstr+"'";
				Statement st1=con.createStatement();
				ResultSet res1=st1.executeQuery(str1);
				Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);
				btnedit.setEnabled(true);
				btnsave.setEnabled(false);
				model.setRowCount(0);
			while(res1.next())
			{
				while(res2.next())
				{
				txtid.setText(res1.getString(1));
				txtname.setText(res1.getString(2));
	            txtcharge.setText(res1.getString(3));
				for(i=4;i<=15;i++)
				{
                  Vector v=new Vector();


				arr[i]=(res1.getString(i));
				 arr2[i]=(res2.getString(i));
				 if((arr[i].equals("x"))&&(arr2[i].equals("x")))
				 {
				 }
				 else
				 {
				  
				  v.add(arr[i]);
				  v.add(arr2[i]);
				 
				  model.addRow(v);
				  
				  flg=1;
				  
				 }
			     }
			}
			}
			if(flg==0)
			{
				JOptionPane.showMessageDialog(null,"invalid test id");
				btnedit.setEnabled(false);
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
			   Statement st1=con.createStatement();
			   Statement st2=con.createStatement();
			   String dstr="delete from testdetailtbl where testid='"+txtid.getText()+"'";
			   String dstr2="delete from testvaluetbl where testid='"+txtid.getText()+"'";
			   st1.executeUpdate(dstr);
			   st2.executeUpdate(dstr2);
			   
                String str1="insert into testdetailtbl(TESTid,TESTname,TESTcharge,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
                String str2="insert into testvaluetbl(TESTid,TESTname,TESTcharge,V1,V2,V3,V4,V5,V6,V7,V8,V9,V10,V11,V12,V13,V14,V15)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";				
				PreparedStatement ps1=con.prepareStatement(str1);
				PreparedStatement ps2=con.prepareStatement(str2);
			    ps1.setString(1,txtid.getText());
			    ps1.setString(2,txtname.getText());
			    ps1.setString(3,txtcharge.getText());
				ps2.setString(1,txtid.getText());
			    ps2.setString(2,txtname.getText());
			    ps2.setString(3,txtcharge.getText());
				for(i=1;i<=tbl.getRowCount();i++)
				{
					ps1.setString(i+3,""+tbl.getValueAt(i-1,0));	
					ps2.setString(i+3,""+tbl.getValueAt(i-1,1));	
				}
				for(;i<=15;i++)
				{
					ps1.setString(i+3,"x");	
					ps2.setString(i+3,"x");	
				}
				if((txtid.getText().trim().length()!=0)&&(txtname.getText().length()!=0)&&(txtcharge.getText().trim().length()!=0))
				{

				ps1.executeUpdate();
				ps2.executeUpdate();
				JOptionPane.showMessageDialog(null,"update Successfully");
				btnsave.setEnabled(false);
				model.setRowCount(0);
				txtcharge.setText("");
		        txtname.setText("");
		        txtid.setText("");
				
			    }
				
				else
				{
					JOptionPane.showMessageDialog(null,"please enter all the details properly");
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
  