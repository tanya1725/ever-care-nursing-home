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
public class refundform extends JFrame implements FocusListener,ActionListener
{
    int flg=0;
    JLabel lblaid=new JLabel("Admit id");
    JTextField txtaid=new JTextField(15);

    JLabel lbltotal=new JLabel("Total bill");
    JTextField txttotal=new JTextField(15);

    JLabel lblpaid=new JLabel("Paid amount");
    JTextField txtpaid=new JTextField(15);

    JLabel lblrefunded=new JLabel("Refunded amount");
    JTextField txtrefunded=new JTextField(15);

    JLabel lbldate=new JLabel("Date");
    JTextField txtdate=new JTextField(15);

    JButton btnnew=new JButton("new");
    JButton btnrefunded=new JButton("refunded");
    JButton btncancel=new JButton("cancel");
    JLabel lblheading=new JLabel("REFUND FORM");
    JLabel lblleft=new JLabel();
    JLabel lblright=new JLabel();
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
Date dt=new Date();   

    public refundform()
    {
          setTitle("REFUND FORM...");
          setLayout(null);
          setVisible(true);
          Dimension size=Toolkit.getDefaultToolkit().getScreenSize(); 
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

          lblaid.setBounds(150,300,200,40);
          lblaid.setFont(new Font("Courier New",Font.BOLD,25));

          txtaid.setBounds(350,300,150,40);

          lbldate.setBounds(550,300,200,40);
          lbldate.setFont(new Font("Courier New",Font.BOLD,25));
          txtdate.setBounds(750,300,150,40);

          lbltotal.setBounds(150,450,200,40);
          lbltotal.setFont(new Font("Courier New",Font.BOLD,25));

          txttotal.setBounds(350,450,150,40);

          lblpaid.setBounds(550,450,200,40);
          lblpaid.setFont(new Font("Courier New",Font.BOLD,25));

          txtpaid.setBounds(750,450,150,40);

          lblrefunded.setBounds(150,550,250,40);
          lblrefunded.setFont(new Font("Courier New",Font.BOLD,25));

          txtrefunded.setBounds(400,550,150,40);

          btnnew.setBounds(200,700,80,40);
          btnrefunded.setBounds(290,700,100,40);
          btncancel.setBounds(400,700,100,40);

          add(lblaid);
          add(lbldate);
          add(lblrefunded);
          add(lbltotal);
          add(lblpaid);

          add(txtaid);
          add(txtpaid);
          add(txttotal);
          add(txtrefunded);
          add(txtdate);

          add(btnnew);
          add(btnrefunded);
          add(btncancel);
          btnnew.addActionListener(this);
          btnrefunded.addActionListener(this);
          btncancel.addActionListener(this);
          txtaid.addFocusListener(this);
          txttotal.setEditable(false);
          txtpaid.setEditable(false);
          txtrefunded.setEditable(false);
          btnrefunded.setEnabled(false);
          txtaid.setEditable(false);
          txtdate.setEditable(false);


    }
    public void focusGained(FocusEvent f)
    {

    }
    public void focusLost(FocusEvent f)
    {
        int y=0;
        String pending="";
        int refund=0;
        String total="";

        if(f.getSource()==txtaid)
        {
            try{

            	Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from paymenttbl where aid ='"+txtaid.getText()+"'";
                Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
                String str2="select * from refundtbl where aid ='"+txtaid.getText()+"'";
                Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);
                 
                while(res2.next())
                {
                    flg=1;
                }
                if(flg==1)
                {
                    JOptionPane.showMessageDialog(null,"amount is already refunded");
                }
                else
                {
                while(res.next())
                {
                     total=res.getString(4);
                     int total1=Integer.parseInt(total);
                  txttotal.setText(String.valueOf(total1));
                  pending=res.getString(5);
                 int pending1=Integer.parseInt(pending); 
				 y=y+pending1;
                 txtpaid.setText(String.valueOf(y));
                 refund=y-total1;
                 txtrefunded.setText(String.valueOf(refund));
                 btnrefunded.setEnabled(true);
                 txtaid.setEditable(false);

                }
            }
            con.close();
            }
            catch(Exception ee)
            {
                System.out.println(ee);
            }
        }

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnrefunded)
        {
            try
            {
        Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");	
		String str="insert into refundtbl(aid,RDate,totalAmount,paid,refundAmount)values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(str);
        ps.setString(1,txtaid.getText());
        ps.setString(2,txtdate.getText());
        ps.setString(3,txttotal.getText());
        ps.setString(4,txtpaid.getText());
        ps.setString(5,txtrefunded.getText());
        int total1=Integer.parseInt(txttotal.getText()); 
        int paid1=Integer.parseInt(txtpaid.getText()); 
        int refunded1=Integer.parseInt(txtrefunded.getText()); 
        if(total1<=paid1)
        {
          if(refunded1!=0)
            {
              ps.executeUpdate();    
              btnrefunded.setEnabled(false); 
              JOptionPane.showMessageDialog(null,"refund sucessfully");   
              this.dispose();
            }
        
           else
            {
            JOptionPane.showMessageDialog(null,"no refund");
            btnrefunded.setEnabled(false);
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"please clear all dues");
            btnrefunded.setEnabled(false);

            }
            con.close();
            }
            
        catch(Exception ee)
        {
            System.out.println(ee);
        }
        }
        if(e.getSource()==btnnew)
        {
            txtaid.setText("");
            txttotal.setText("");
            txtpaid.setText("");
            txtrefunded.setText("");
            txtdate.setText(""+sdf.format(dt));
            txtaid.setEditable(true);
        }
 
    
    if(e.getSource()==btncancel)
    {
        this.dispose();
    }
    }
    public static void main(String args[])
    {
        refundform obj=new refundform();
    }

}
