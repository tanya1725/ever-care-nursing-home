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

public class dischargeform extends JFrame implements FocusListener,ActionListener
{
JLabel lblheading=new JLabel("PATIENT DISCHARGE DETAILS");
JLabel lblleft=new JLabel();
JLabel lblright=new JLabel();

    JLabel lblaid=new JLabel("Admit id");
    JTextField txtaid=new JTextField(15);

    JLabel lblpid=new JLabel("Patient  id");
    JTextField txtpid=new JTextField(15);

    JLabel lbldod=new JLabel("Date of discharge");
    JTextField txtdod=new JTextField(15);

     JLabel lblpname=new JLabel("Patient name");
    JTextField txtpname=new JTextField(15);

    JLabel lbldoa=new JLabel("Date of admit");
    JTextField txtdoa=new JTextField(15);

    JLabel lbldiagnosed=new JLabel("Diagnosed for");
    JTextField txtdiagnosed=new JTextField(15);

    JLabel lbltotalbill=new JLabel("Total bill");
    JTextField txttotalbill=new JTextField(15);

    JLabel lblamountdue=new JLabel("Amount due");
    JTextField txtamountdue=new JTextField(15);

    JLabel lblremarks=new JLabel("remarks/reference");
    JTextField txtremarks=new JTextField(15);

    JLabel lblsuggestion=new JLabel("suggestion (if required)");
    JTextField txtsuggestion=new JTextField(15);

    JButton btnnew=new JButton("new");
    JButton btndischarge=new JButton("Discharge");
    JButton btncancel=new JButton("cancel");
    JButton btnrefunded=new JButton("refund");

    SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
     Date dt=new Date();

    public dischargeform()
    {
    	  setTitle("DISCHARGE FORM...");
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


          lblpid.setBounds(420,250,200,40);
          lblpid.setFont(new Font("Arial",Font.BOLD,25));
          txtpid.setBounds(630,250,150,40);

          lbldod.setBounds(100,350,300,40);
          lbldod.setFont(new Font("Arial",Font.BOLD,25));
          txtdod.setBounds(350,350,150,40);

         lblpname.setBounds(100,450,200,40);
         lblpname.setFont(new Font("Arial",Font.BOLD,25));
         txtpname.setBounds(260,450,150,40);

          lblaid.setBounds(100,250,200,40);
          lblaid.setFont(new Font("Arial",Font.BOLD,25));
          txtaid.setBounds(250,250,150,40);

          lbldoa.setBounds(520,350,250,40);
          lbldoa.setFont(new Font("Arial",Font.BOLD,25));
          txtdoa.setBounds(730,350,150,40);

          lbldiagnosed.setBounds(420, 450,200,40);
          lbldiagnosed.setFont(new Font("Arial",Font.BOLD,25));
          txtdiagnosed.setBounds(630,450,150,40);

         lbltotalbill.setBounds(100,550,200,40);
         lbltotalbill.setFont(new Font("Arial",Font.BOLD,25));
          txttotalbill.setBounds(310,550,150,40);

         lblamountdue.setBounds(470,550,200,40);
         lblamountdue.setFont(new Font("Arial",Font.BOLD,25));
          txtamountdue.setBounds(680,550,150,40);

          btnrefunded.setBounds(840,550,100,40);

         lblremarks.setBounds(100,650,250,40);
         lblremarks.setFont(new Font("Arial",Font.BOLD,25));
          txtremarks.setBounds(360,650,150,40);

          lblsuggestion.setBounds(540,650,300,40);
          lblsuggestion.setFont(new Font("Arial",Font.BOLD,25));
          txtsuggestion.setBounds(520,700,340,40);

          btnnew.setBounds(200,850,100,40);
          btnnew.setBackground(new Color(102,205,255));
          btndischarge.setBounds(320,850,100,40);
          btndischarge.setBackground(new Color(102,205,255));
          btncancel.setBounds(440,850,100,40);
          btncancel.setBackground(new Color(102,205,255));

          add(lblaid);
          add(lbldod);
          add(lblpname);
          add(lbldoa);
          add(lbldiagnosed);
          add(lblamountdue);
          add(lbltotalbill);
          add(lblremarks);
          add(lblsuggestion);
          add(lblpid);
          add(lblheading);
          add(lblleft);
          add(lblright);

          add(txtaid);
          add(txtdod);
          add(txtpname);
          add(txtdoa);
          add(txtdiagnosed);
          add(txtamountdue);
          add(txttotalbill);
          add(txtremarks);
          add(txtsuggestion);
          add(txtpid);

          add(btnnew);
          add(btndischarge);
          add(btncancel);
          add(btnrefunded); 

          btnnew.addActionListener(this);
         txttotalbill.requestFocus(true);

          btndischarge.addActionListener(this);
          btncancel.addActionListener(this);
          txtaid.addFocusListener(this);
          txtpname.setEditable(false);
          txtamountdue.setEditable(false);
          txtdiagnosed.setEditable(false);
          txtdoa.setEditable(false);
          txtdod.setEditable(false);
          txttotalbill.setEditable(false);
          txtpid.setEditable(false);
          btndischarge.setEnabled(false);
          txtdod.setText(""+sdf.format(dt));
          txtaid.setEditable(false);
          btnrefunded.addActionListener(this);
          btnrefunded.setEnabled(false);

}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==btnrefunded)
    {

        
     txtaid.setText("");
     txtpid.setText("");
     txtamountdue.setText("");
     txtdiagnosed.setText("");
     txtdoa.setText("");
     txtremarks.setText("");
     txtsuggestion.setText("");
     txttotalbill.setText("");
     txtpname.setText("");
     txtaid.setEditable(true);
     btnrefunded.setEnabled(false);
     btndischarge.setEnabled(true);
     refundform obj=new refundform();
    }
    if(e.getSource()==btnnew)
    {
      txtdod.setText(""+sdf.format(dt));
      txtaid.setEditable(true);
     // btndischarge.setEnabled(true);
     txtaid.setText("");
     txtpid.setText("");
     txtamountdue.setText("");
     txtdiagnosed.setText("");
     txtdoa.setText("");
     txtremarks.setText("");
     txtsuggestion.setText("");
     txttotalbill.setText("");
     txtpname.setText("");


    }
    if(e.getSource()==btndischarge)
    {
        try{


		Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");	
		String str="insert into dischargetbl(aid,pid,pname,diagnosed,amountdue,totalbill,dod,doa,suggestion,remarks)values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(str);
        ps.setString(1,txtaid.getText());
        ps.setString(2,txtpid.getText());
        ps.setString(3,txtpname.getText());
        ps.setString(4,txtdiagnosed.getText());
        ps.setString(5,txtamountdue.getText());
        ps.setString(6,txttotalbill.getText());
        ps.setString(7,txtdod.getText());
        ps.setString(8,txtdoa.getText());
        ps.setString(9,txtsuggestion.getText());
        ps.setString(10,txtremarks.getText());
       int amountdue=Integer.parseInt(txtamountdue.getText()); 
       //int suggestion=Integer.parseInt(txtsuggestion.getText()); 
       
        if(amountdue==0)
        {
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"discharge sucessfully");
      txtaid.setText("");
     txtpid.setText("");
     txtamountdue.setText("");
     txtdiagnosed.setText("");
     txtdoa.setText("");
     txtremarks.setText("");
     txtsuggestion.setText("");
     txttotalbill.setText("");
     txtpname.setText("");

        }
        else{
            JOptionPane.showMessageDialog(null,"please clear due amount");
            txtaid.setText("");
            btndischarge.setEnabled(false);
        }
         
         btndischarge.setEnabled(false);
         con.close();
        }
         catch(Exception ee)
         {
            System.out.println(ee)  ;
          }

}
if(e.getSource()==btncancel)
{
    this.dispose();
}
}
public void focusLost(FocusEvent f)
{
    String total="",p="";
    int due;
    int y=0;
    int total1=0;
    String t="",pa="",r="";
    int s=0,sum=0;
    int ff=0;
if(f.getSource()==txtaid)
{
    int flg=0;
    try{
    Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
        String str5="select * from refundtbl where aid ='"+txtaid.getText()+"'";
	Statement st5=con.createStatement();
	ResultSet res5=st5.executeQuery(str5);
	String str3="select * from dischargetbl where aid ='"+txtaid.getText()+"'";
	Statement st3=con.createStatement();
	ResultSet res3=st3.executeQuery(str3);

    while(res5.next())
    { 
        ff=1;
       // System.out.println(ff);
          if(ff==1)
           {
 
        System.out.println(ff);
        t=res5.getString(3);
        pa=res5.getString(4);
        r=res5.getString(5);
        int totalAmount=Integer.parseInt(t); 
        int paidAmount=Integer.parseInt(pa); 
        int refundAmount=Integer.parseInt(r); 
        s=paidAmount-refundAmount;
        sum=totalAmount-s;
        txtamountdue.setText(String.valueOf(sum));


	String str="select * from admittbl where aid ='"+txtaid.getText()+"'";
	Statement st=con.createStatement();
	ResultSet res=st.executeQuery(str);
    while(res.next())
    {
          txtpid.setText(res.getString(1));
          txtpname.setText(res.getString(2));
          txtdiagnosed.setText(res.getString(5));
          txtdoa.setText(res.getString(4));
          
    }
    // Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
	String str2="select * from paymenttbl where aid ='"+txtaid.getText()+"'";
	Statement st2=con.createStatement();
	ResultSet res2=st2.executeQuery(str2);
    while(res2.next())
    {
        total=(res2.getString(4));
        p=res2.getString(5);
    
        int pending1=Integer.parseInt(p); 
        y=y+pending1;
         total1=Integer.parseInt(total);
    }

        //due=total1-y;
       // System.out.println(due);
        //txtamountdue.setText(String.valueOf(due));
        txttotalbill.setText(total);
       // txtbedbill.setText(String.valueOf(total));
      // if(due<0)
      // {
       // btnrefunded.setEnabled(true);
       // btndischarge.setEnabled(false);
      // }
         if(refundAmount==0)
        {
            btnrefunded.setEnabled(false);
        }
    
    }
    txtaid.setEditable(false);
    //btndischarge.setEnabled(true);
    }
        

            





    

if(ff==0)
{
    while(res3.next())
    {
        flg=1;
    
    }
    if(flg==1)
    {
        JOptionPane.showMessageDialog(null,"already discharged");
    }

   else
   {
    //Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
	String str="select * from admittbl where aid ='"+txtaid.getText()+"'";
	Statement st=con.createStatement();
	ResultSet res=st.executeQuery(str);
    while(res.next())
    {
          txtpid.setText(res.getString(1));
          txtpname.setText(res.getString(2));
          txtdiagnosed.setText(res.getString(5));
          txtdoa.setText(res.getString(4));
          
    }
    // Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
	String str2="select * from paymenttbl where aid ='"+txtaid.getText()+"'";
	Statement st2=con.createStatement();
	ResultSet res2=st2.executeQuery(str2);
    while(res2.next())
    {
        total=(res2.getString(4));
        p=res2.getString(5);
    
        int pending1=Integer.parseInt(p); 
        y=y+pending1;
         total1=Integer.parseInt(total);
    }

        due=total1-y;
        System.out.println(due);
        txtamountdue.setText(String.valueOf(due));
        txttotalbill.setText(total);
       // txtbedbill.setText(String.valueOf(total));
       if(due<0)
       {
        btnrefunded.setEnabled(true);
        btndischarge.setEnabled(false);
       }
       else
       {
        btnrefunded.setEnabled(false);
        btndischarge.setEnabled(true);
       }
    
    }
    txtaid.setEditable(false);
   // btndischarge.setEnabled(true);
    }
    con.close();
    }
    
    catch(Exception ee)
    {
        System.out.println(ee);
    }
}

}
public void focusGained(FocusEvent f)
{

}    
}