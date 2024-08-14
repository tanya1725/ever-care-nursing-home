
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class bedchange extends JFrame implements ActionListener
{
  int flag=0;
  int flaag=0;

  	String[]col={"Date Of Allot","Bed To Allot"};
	
	Object[][] data={{"",""}};
	DefaultTableModel model=new DefaultTableModel(col,0);
	JScrollPane sp;
	JTable tbl=new JTable(data,col);


    JLabel lblheading=new JLabel("PATIENT BED CHANGE");
JLabel lblleft=new JLabel();
JLabel lblright=new JLabel();

    JLabel lbladid=new JLabel("Admit Id:");

    JTextField txtadid=new JTextField(15);

    JLabel lblpname=new JLabel("Patient Name:");
    JTextField txtpname=new JTextField(15);

    JLabel lbldoa=new JLabel("Date Of admit");
    JTextField txtdoa=new JTextField(15);

    JLabel lbldiagnosed=new JLabel("Diagnosed For:");
    JTextField txtdiagnosed=new JTextField(15);

    JLabel lblbedtoallot=new JLabel("Bed To Allot:");
    JTextField txtbedtoallot=new JTextField(15);



    JLabel lblcontact=new JLabel("Contact");
    JTextField txtcontact=new JTextField(15);

    JLabel lblpid=new JLabel("Patient Id");
    JTextField txtpid=new JTextField(15);

    JButton btnnew=new JButton("NEW");
    JButton btnsave=new JButton("SAVE");
    JButton btnsearch=new JButton("SEARCH");
    JButton btnedit=new JButton("EDIT");
    JButton btncancel=new JButton("CANCEL");
    JButton btnca=new JButton("CA");

    SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
    Date dt=new Date();
    String allot;
    String ad,name,Diagnosed,doa,contact,pid,currentbed;
    int x;
    public bedchange(String bed ,String p,String q,String r,String s,String n,String u,int w)
    {
        allot=bed;
        name=q;
        ad=p;
        Diagnosed=r;
        doa=s;
        contact=n;
        pid=u;
        //currentbed=v;
        x=w;

     sp=new JScrollPane(tbl); 
		 tbl.setModel(model); 
		 add(sp);
		 sp.setBounds(100,500,800,300);
     tbl.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
     tbl.setRowHeight(3,40); 
     tbl.setBackground(new Color(102,204,255));
     tbl.getTableHeader().setFont(new Font( "Franklin Gothic Medium Cond ",Font.BOLD,15));     
        
        
       txtdoa.setText(""+sdf.format(dt));
        setTitle(" BED CHANGE...");
        Dimension size=Toolkit.getDefaultToolkit().getScreenSize(); 
        setLayout(null);
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
    
    lblpid.setBounds(470,100,200,40);
    lblpid.setHorizontalAlignment(JLabel.CENTER);
	  lblpid.setFont(new Font("Arial",Font.BOLD,25));
    txtpid.setBounds(680,100,150,40);

    lbladid.setBounds(70,100,200,40);
     lbladid.setHorizontalAlignment(JLabel.CENTER);
	  lbladid.setFont(new Font("Arial",Font.BOLD,25));
    txtadid.setBounds(310,100,150,40);

    lblcontact.setBounds(470,300,200,40);
    lblcontact.setHorizontalAlignment(JLabel.CENTER);
	  lblcontact.setFont(new Font("Arial",Font.BOLD,25));
    txtcontact.setBounds(680,300,150,40);

    lblpname.setBounds(100,200,200,40);
   lblpname.setHorizontalAlignment(JLabel.CENTER);
	  lblpname.setFont(new Font("Arial",Font.BOLD,25));
    txtpname.setBounds(310,200,150,40);

    lbldoa.setBounds(470,200,250,40);
    lbldoa.setHorizontalAlignment(JLabel.CENTER);
	  lbldoa.setFont(new Font("Arial",Font.BOLD,25));
    txtdoa.setBounds(730,200,150,40);

    lbldiagnosed.setBounds(70,300,250,40);
    lbldiagnosed.setHorizontalAlignment(JLabel.CENTER);
	  lbldiagnosed.setFont(new Font("Arial",Font.BOLD,25));
    txtdiagnosed.setBounds(340,300,150,40);
    


    lblbedtoallot.setBounds(100,400,200,40);
    lblbedtoallot.setHorizontalAlignment(JLabel.CENTER);
	  lblbedtoallot.setFont(new Font("Arial",Font.BOLD,25));
    txtbedtoallot.setBounds(310,400,150,40);

    btnca.setBounds(470,400,100,40);
    btnnew.setBounds(300,850,100,40);
    btnsave.setBounds(410,850,100,40);
    btnsearch.setBounds(520,850,100,40);
  
    btncancel.setBounds(630,850 ,100,40);

    add(lblpid);
    add(lbladid);
    add(lblcontact);
    add(lblpname);
    add(lbldoa);
    add(lbldiagnosed);

      add(lblbedtoallot);
      add(lblheading);
      add(lblleft);
      add(lblright);

    add(txtpid);
    add(txtadid);
    add(txtcontact);
    add(txtpname);
    add(txtdoa);
    add(txtdiagnosed);

    add(txtbedtoallot);

    add(btnsave);
    add(btncancel);
    add(btnsearch);

    add(btnnew);
    add(btnca);

      txtadid.setText(ad);
     txtpname.setText(name);
     txtdiagnosed.setText(Diagnosed);

     txtcontact.setText(contact);
     txtpid.setText(pid);
 
     if(x==1)
{

  lblcontact.setVisible(true);
  txtcontact.setVisible(true);
  lblpname.setVisible(true);
  txtpname.setVisible(true);
  lbldiagnosed.setVisible(true);
  txtdiagnosed.setVisible(true);
  lbldoa.setVisible(true);
  txtdoa.setVisible(true); 
  lblpid.setVisible(true);
  txtpid.setVisible(true);
  btnsave.setEnabled(true);
}
else
{

   lblcontact.setVisible(false);
  txtcontact.setVisible(false);
  lblpname.setVisible(false);
  txtpname.setVisible(false);
  lbldiagnosed.setVisible(false);
  txtdiagnosed.setVisible(false);
  lbldoa.setVisible(false);
  txtdoa.setVisible(false);
  lblpid.setVisible(false);
  txtpid.setVisible(false);
  btnsave.setEnabled(false);

}


  btnca.addActionListener(this);
  btnnew.addActionListener(this);
  btncancel.addActionListener(this);
  btnedit.addActionListener(this);
  btnsearch.addActionListener(this);
  btnsave.addActionListener(this);

  txtpid.setEditable(false);
  txtpname.setEditable(false);
  txtdiagnosed.setEditable(false);
  txtcontact.setEditable(false);
  txtdoa.setEditable(false);
  txtadid.setEditable(false);

  txtbedtoallot.setEditable(false);

  btnca.setEnabled(false);
  txtbedtoallot.setText(allot);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btnnew)
{

    try
    {
    
  lblcontact.setVisible(true);
  txtcontact.setVisible(true);
  lblpname.setVisible(true);
  txtpname.setVisible(true);
  lbldiagnosed.setVisible(true);
  txtdiagnosed.setVisible(true);
  lbldoa.setVisible(true);
  txtdoa.setVisible(true); 
  lblpid.setVisible(true);
  txtpid.setVisible(true);
  model.setRowCount(0);
  btnca.setEnabled(true);
  txtbedtoallot.setText("");
  txtadid.setText("");
  txtpid.setText("");
  txtpname.setText("");
  txtdoa.setText("");
  txtdiagnosed.setText("");
  txtcontact.setText("");

  Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
  String wstr=JOptionPane.showInputDialog(null,"Enter admit id:");
  String str="select * from admittbl where Aid='"+wstr+"'";
  String str3="select * from bedchangetbl where aid='"+wstr+"'";
  						 String str4="select * from dischargetbl where Aid='"+wstr+"'";
						 Statement st4=con.createStatement();
						 ResultSet res4=st4.executeQuery(str4);
			

						 while(res4.next())
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
  Statement st=con.createStatement();
  ResultSet res=st.executeQuery(str);   
  Statement st3=con.createStatement();
  ResultSet res3=st3.executeQuery(str3);   
  while(res.next())
  {
    txtcontact.setText(res.getString(10));
    txtdiagnosed.setText(res.getString(5));

    txtpid.setText(res.getString(1));
    txtadid.setText(res.getString(3));


  }
  while(res3.next())
  {
         Vector v=new Vector();
					v.add(res3.getString(5));
			
          v.add(res3.getString(4));
					model.addRow(v); 
  }
   String str2="select * from patienttbl where Pid='"+txtpid.getText()+"'";
   Statement st2=con.createStatement();
  ResultSet res2=st2.executeQuery(str2);   
  while(res2.next())
  {
    txtpname.setText(res2.getString(3));
  }
             }
  
con.close();
    }
catch(Exception ee)
{
    System.out.println(ee);
}
}
if(e.getSource()==btnca)
{
 

  bedavailbility obj=new bedavailbility(0,txtadid.getText(),txtpname.getText(),txtdiagnosed.getText(),txtdoa.getText(),txtcontact.getText(),txtpid.getText(),1);
  lblcontact.setVisible(true);
  txtcontact.setVisible(true);
  lblpname.setVisible(true);
  txtpname.setVisible(true);
  lbldiagnosed.setVisible(true);
  txtdiagnosed.setVisible(true);
  lbldoa.setVisible(true);
  txtdoa.setVisible(true); 
  lblpid.setVisible(true);
  txtpid.setVisible(true);
  txtadid.setVisible(true);

  this.dispose();
  
}
if(e.getSource()==btnsave)
{
  String p="",q="",b="";
  int bcflg=0;
  String tdate="";
  long z;
  long j=0;
  String charge="";
  long totalcharge=0,totalcharge1=0;
  long charge1=0;
  String tt[]=txtbedtoallot.getText().split("/");
  			try
				{
Connection con =DriverManager .getConnection("jdbc:odbc:nursingdsn");
       String str3="select * from bedchangetbl where aid='"+txtadid.getText()+"'";
       Statement st3=con.createStatement();
			 ResultSet res3=st3.executeQuery(str3);      
        while(res3.next())
         {
          bcflg=1;
         }
            
              
                String str4="select * from bedchangetbl where aid='"+txtadid.getText()+"'";
                  Statement st4=con.createStatement();
			            ResultSet res4=st4.executeQuery(str4);      
                 while(res4.next())
                 {
                  if(bcflg==1)
                  {
                  p=res4.getString(5);
                  q=""+sdf.format(dt);
                  b=res4.getString(4);
                  Date dt1=sdf.parse(p);
                  Date dt2=sdf.parse(q);
                  long x=dt1.getTime();
                  long y=dt2.getTime();
                  z=y-x;
                  j=z/(1000*60*60*24);
                  System.out.println(j);
                  }
                 String t1[]=b.split("/");
                 
            String str6="select wcharge from wardmastertbl where wtype='"+t1[0]+"'";
            Statement st6=con.createStatement();
				    ResultSet res6=st6.executeQuery(str6);   
            while(res6.next())
            {

              System.out.println("1234567890");
              charge=res6.getString(1);
             
            long num=new Long(charge);
           charge1=Long.parseLong(charge);
            totalcharge=j*charge1;    
            System.out.println(totalcharge);   
            } 
                  

                
       }
         
      

        
        
            String str2="select * from admittbl";
             Statement st2=con.createStatement();
				    ResultSet res2=st2.executeQuery(str2);
            while(res2.next())
            {
              if(bcflg==0)
              {
              p=res2.getString(4);
              b=res2.getString(8);
              q=""+sdf.format(dt);
              Date dt1=sdf.parse(p);
              Date dt2=sdf.parse(q);
              long x=dt1.getTime();
              long y=dt2.getTime();
            
               z=y-x;
               j=z/(1000*60*60*24);
              System.out.println(j);
            }
            }
            String t1[]=b.split("/");
            String str5="select wcharge from wardmastertbl where wtype='"+t1[0]+"'";
            Statement st5=con.createStatement();
				    ResultSet res5=st5.executeQuery(str5);   
            while(res5.next())
            {
              charge=res5.getString(1);

            long num=new Long(charge);
           charge1=Long.parseLong(charge);
            totalcharge1=j*charge1;    
           System.out.println(totalcharge1);   
            } 

        

        if(bcflg==1)
        {
				String str="insert into bedchangetbl(aid,pid,pname,bedtoallot,DOA,charge)values(?,?,?,?,?,?)";
	  		PreparedStatement ps=con.prepareStatement(str);

        ps.setString(1,txtadid.getText());
        ps.setString(2,txtpid.getText());
        ps.setString(3,txtpname.getText());
        ps.setString(4,txtbedtoallot.getText());
        ps.setString(5,txtdoa.getText());
        ps.setString(6,""+totalcharge);   
        ps.executeUpdate();      
        }
        if(bcflg==0)
        {
				String str="insert into bedchangetbl(aid,pid,pname,bedtoallot,DOA,charge)values(?,?,?,?,?,?)";
	  		PreparedStatement ps=con.prepareStatement(str);

        ps.setString(1,txtadid.getText());
        ps.setString(2,txtpid.getText());
        ps.setString(3,txtpname.getText());
        ps.setString(4,txtbedtoallot.getText());
        ps.setString(5,txtdoa.getText());
        ps.setString(6,""+totalcharge1);
        

        ps.executeUpdate();
        }
        
        JOptionPane.showMessageDialog(null,"saved successfully");
        btnca.setEnabled(false);
        btnsave.setEnabled(false);

        Statement st7=con.createStatement();
			  st7.executeUpdate("update wardmastertbl set B"+tt[1]+"='n' where wtype='"+tt[0]+"'");
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
        Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
		    lblcontact.setVisible(true);
        txtcontact.setVisible(true);
        lblpname.setVisible(true);
        txtpname.setVisible(true);
        lbldiagnosed.setVisible(true);
        txtdiagnosed.setVisible(true);
        lbldoa.setVisible(true);
        txtdoa.setVisible(true); 
        lblpid.setVisible(true);
        txtpid.setVisible(true);
        btnsave.setEnabled(false);
          txtbedtoallot.setText("");
          txtadid.setText("");
          txtpid.setText("");
          txtpname.setText("");
          txtdoa.setText("");
          txtdiagnosed.setText("");
          txtcontact.setText("");
        model.setRowCount(0);
        
        btnca.setEnabled(false);
				String wstr=JOptionPane.showInputDialog(null,"Enter admit id:");
				
				String str="select * from bedchangetbl where aid='"+wstr+"'";
        String str2="select * from admittbl where aid='"+wstr+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
        Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);
				btnedit.setEnabled(true);
			while(res.next())
			{
        
				txtadid.setText(res.getString(1));
        txtpid.setText(res.getString(2));
        txtpname.setText(res.getString(3));

       
        Vector v=new Vector();
					v.add(res.getString(5));
          v.add(res.getString(4));
					model.addRow(v);
					flg=1;

        }
        while(res2.next())
        {
          txtdiagnosed.setText(res2.getString(5));
          txtcontact.setText(res2.getString(10));
          flg=1;

        }
        if(flg==0)
        {
          JOptionPane.showMessageDialog(null,"invalid admit id");
          lblcontact.setVisible(false);
          txtcontact.setVisible(false);
          lblpname.setVisible(false);
          txtpname.setVisible(false);
          lbldiagnosed.setVisible(false);
          txtdiagnosed.setVisible(false);
          lbldoa.setVisible(false);
          txtdoa.setVisible(false);
          lblpid.setVisible(false);
          txtpid.setVisible(false);
          txtpid.setEditable(false);
          txtpname.setEditable(false);
          txtdiagnosed.setEditable(false);
          txtcontact.setEditable(false);
          txtdoa.setEditable(false);
          btnca.setEnabled(false);
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




