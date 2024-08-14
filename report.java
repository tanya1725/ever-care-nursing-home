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
public class report extends JFrame implements ActionListener
{

String p="";
String d="";
  JLabel lblreport=new JLabel("REPORTS");
  
  JRadioButton rbtpayment =new JRadioButton("PAYMENT REPORT");
  JRadioButton rbtrefund =new JRadioButton("REFUND REPORT");
  JRadioButton rbttest =new JRadioButton("TEST REQUEST REPORT");
  JRadioButton rbtdischarge=new JRadioButton("PATIENT DISCHARGE REPORT");
 
  JRadioButton rbtdate=new JRadioButton("DATE WISE");
  JRadioButton rbtid=new JRadioButton("ADMIT ID WISE");

  JLabel lblstartdate=new JLabel("START DATE");
  JTextField txtstartdate=new JTextField(15);

  JLabel lblenddate=new JLabel("END DATE");
  JTextField txtenddate=new JTextField(15);

  JLabel lbladmitid=new JLabel("ADMIT ID");
  JTextField txtadmitid=new JTextField(15);

  



    JLabel lblbackground=new JLabel();
    JLabel lblbackground2=new JLabel();
    JLabel lblbackground3=new JLabel();

    JButton btnsubmit=new JButton("SUBMIT");
    JButton btncancel=new JButton("CANCEL");

    ButtonGroup bg=new ButtonGroup();
    ButtonGroup bg2=new ButtonGroup();

    public report()
    {
         setTitle(" REPORT...");
        setLayout(null);
        setVisible(true);
        setSize(2000,2000);  

     lblreport.setBounds(500,280,550,40);
     rbtpayment.setBounds(360,420,200,40);
     rbtrefund.setBounds(630,420,200,40);
     rbttest.setBounds(360,500,200,40);
     rbtdischarge.setBounds(630,500,200,40);
     
     rbtdate.setBounds(1020,420,100,40);
     rbtid.setBounds(1160,420,120,40);

    lblstartdate.setBounds(1020,480,160,40);
    txtstartdate.setBounds(1190,480,160,40);

     lblenddate.setBounds(1020,530,160,40);
     txtenddate.setBounds(1190,530,160,40);

     lbladmitid.setBounds(1020,530,160,40);
    txtadmitid.setBounds(1190,530,160,40);




    lblbackground.setOpaque(true);
    lblbackground2.setOpaque(true);
    lblbackground3.setOpaque(true);
       lblbackground .setBackground(new Color(0,32,96));
        lblbackground.setBounds(0,0,2000,2000);
        lblbackground2.setBounds(300,250,600,500);

        lblbackground3.setBounds(1000,400,400,200);

        lblbackground2.setBackground(new Color(157,154,153));
        lblbackground3.setBackground(new Color(157,154,153));
         lblreport.setFont(new Font("Courier New",Font.BOLD,40));

        btnsubmit.setBounds(1050,640,170,60);
        btncancel.setBounds(1300,640,170,60);




       add(rbtpayment);
       add(rbtrefund);
       add(rbttest);
       add(rbtdischarge);
       add(lblstartdate);
       add(lblenddate);
       add(txtstartdate);
       add(txtenddate);
       add(lbladmitid);
       add(txtadmitid);
        add(lblreport);
        add(btnsubmit);
        add(btncancel);
        add(rbtdate);
        add(rbtid);
        add(lblbackground3);
        add(lblbackground2);
        add(lblbackground);
        bg.add(rbtpayment);
        bg.add(rbtrefund);
        bg.add(rbttest);
        bg.add(rbtdischarge);
        bg2.add(rbtdate);
        bg2.add(rbtid);
        btnsubmit.addActionListener(this);
        rbtdate.addActionListener(this);
        rbtid.addActionListener(this);
        rbtpayment.addActionListener(this);
        rbtrefund.addActionListener(this);
        rbttest.addActionListener(this);
        rbtdischarge.addActionListener(this);
        btncancel.addActionListener(this);

        lblstartdate.setVisible(false);
        txtstartdate.setVisible(false);
        lblenddate.setVisible(false);
        txtenddate.setVisible(false);
        lbladmitid.setVisible(false);
        txtadmitid.setVisible(false);


    

    }
    public void actionPerformed(ActionEvent e)
    {

    if(rbtdate.isSelected())
    {
         lblstartdate.setVisible(true);
         txtstartdate.setVisible(true);
         lblenddate.setVisible(true);
         txtenddate.setVisible(true);
         lbladmitid.setVisible(false);
         txtadmitid.setVisible(false);

    }
    if(rbtid.isSelected())
    {
        lbladmitid.setVisible(true);
        txtadmitid.setVisible(true);
        lblstartdate.setVisible(false);
         txtstartdate.setVisible(false);
         lblenddate.setVisible(false);
         txtenddate.setVisible(false);
    }
if(e.getSource()==btnsubmit)
{

                 try
                 {
                    Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
                    
                if(rbtpayment.isSelected()&& rbtid.isSelected())
                {            
            Statement st=con.createStatement();
            String str="select * from paymenttbl where aid='"+txtadmitid.getText()+"'";
            PrintWriter pw=new PrintWriter("rep.txt");            
            ResultSet res=st.executeQuery(str);
            pw.println(" admit id   payment date  payment amount    mode of payment");
            while(res.next())
            {

                

                pw.printf("\n%-10s",res.getString(3));
                 pw.printf("%-18s",res.getString(2));
                pw.printf("%-18s",res.getString(4));
                pw.printf("%-20s",res.getString(6));
               // pw.printf("%-8s",txtpid.getText());

                //pw.printf("%-10s",tbl.getValueAt(i,3));
            



            }
             pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");
        }

        if(rbtpayment.isSelected()&&rbtdate.isSelected())
        {

           
            SimpleDateFormat obj=new SimpleDateFormat("dd/MMM/yyyy");
           // Date d1=obj.parse(txtstartdate.getText());
           // Date d2=obj.parse(txtenddate.getText());
          //  long td=d2.getTime()-d1.getTime();
           // long dd=(td/(1000*60*60*24))%365;
            // System.out.println(dd);
            Statement st6=con.createStatement();
            String str6="select * from paymenttbl where  paymentDate between #"+txtstartdate.getText()+"# and #"+txtenddate.getText()+"#";   
            PrintWriter pw=new PrintWriter("rep.txt");
            ResultSet res6=st6.executeQuery(str6);
            pw.println(" admit id   payment date  payment amount    mode of payment");                        
            while(res6.next())
            {
                
                pw.printf("\n%-10s",res6.getString(3));
                d=res6.getString(2);
                String tt[]=d.split("00");
               // System.out.println(tt[0]);
                 pw.printf("%-18s",tt[0]);
                pw.printf("%-18s",res6.getString(4));
                pw.printf("%-20s",res6.getString(6));
            }
             
             pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");
        }  
         if(rbttest.isSelected()&&rbtdate.isSelected())
        {

           
            SimpleDateFormat obj=new SimpleDateFormat("dd/MMM/yyyy");
            Statement st7=con.createStatement();
            String str7="select * from patientreqtbl where  tdate between #"+txtstartdate.getText()+"# and #"+txtenddate.getText()+"#";   
            PrintWriter pw=new PrintWriter("rep.txt");
            ResultSet res7=st7.executeQuery(str7);  
            pw.println("admit id   test request id    test date       test id      test  name      test  charge ");
            while(res7.next())
            {
                
                pw.printf("\n%-15s",res7.getString(2));
                pw.printf("%-15s",res7.getString(1));
                d=res7.getString(5);
                String tt[]=d.split("00");
                pw.printf("%-18s",tt[0]);
                p=res7.getString(3);
                pw.printf("%-10s",p);
                pw.printf("%-15s",res7.getString(4));
            
            Statement st8=con.createStatement();
            String str8="select * from testdetailtbl where TESTid='"+p+"'";  
            ResultSet res8=st8.executeQuery(str8);  
            while(res8.next())
            {
                pw.printf("%10s",res8.getString(3));
            }

            }
            pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");
        } 
           if(rbtdischarge.isSelected()&& rbtdate.isSelected())
           {
           
            SimpleDateFormat obj=new SimpleDateFormat("dd/MMM/yyyy");
            Statement st9=con.createStatement();
            String str9="select * from dischargetbl where  dod between #"+txtstartdate.getText()+"# and #"+txtenddate.getText()+"#";   
            PrintWriter pw=new PrintWriter("rep.txt");
            ResultSet res9=st9.executeQuery(str9);  
            pw.println("admit id   patient id     name      amount due      date of discharge      suggestion       remarks");
            while(res9.next())
            {
                pw.printf("\n%-15s",res9.getString(1));
                pw.printf("%-10s",res9.getString(2));
                pw.printf("%-15s",res9.getString(3));
                pw.printf("%-15s",res9.getString(5));
                d=res9.getString(7);
                String tt[]=d.split("00");
                pw.printf("%-18s",tt[0]);
                pw.printf("%-20s",res9.getString(9));
                pw.printf("%-15s",res9.getString(10));
            }

             pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");
            }
            if(rbtrefund.isSelected()&&rbtdate.isSelected())
            {

            SimpleDateFormat obj=new SimpleDateFormat("dd/MMM/yyyy");
            Statement st10=con.createStatement();
            String str10="select * from refundtbl where  Rdate between #"+txtstartdate.getText()+"# and #"+txtenddate.getText()+"#";   
            PrintWriter pw=new PrintWriter("rep.txt");
            ResultSet res10=st10.executeQuery(str10);  
            pw.println("admit id      refund  date     total amount     paid  amount    refund  amount");
            while(res10.next())
            {
                pw.printf("\n%-15s",res10.getString(1));
                d=res10.getString(2);
                String tt[]=d.split("00");
                pw.printf("%-18s",tt[0]);
                pw.printf("%-15s",res10.getString(3));
                pw.printf("%-15s",res10.getString(4));
                pw.printf("%10s",res10.getString(5));
            }
              pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");
            }
            if(rbtdischarge.isSelected()&& rbtid.isSelected())
            {
             Statement st2=con.createStatement();
            String str2="select * from dischargetbl where aid='"+txtadmitid.getText()+"'";   
            PrintWriter pw=new PrintWriter("rep.txt");
            ResultSet res2=st2.executeQuery(str2);
            while(res2.next())
            {
                pw.println("admit id   patient id     name      amount due      date of discharge      suggestion       remarks");
                pw.printf("\n%-15s",res2.getString(1));
                pw.printf("%-10s",res2.getString(2));
                pw.printf("%-15s",res2.getString(3));
                pw.printf("%-15s",res2.getString(5));
                pw.printf("%-18s",res2.getString(7));
                pw.printf("%-20s",res2.getString(9));
                pw.printf("%-15s",res2.getString(10));
            }

             pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");
            }
            if(rbttest.isSelected()&&rbtid.isSelected())
            {
            Statement st3=con.createStatement();
            String str3="select * from patientreqtbl where aid='"+txtadmitid.getText()+"'";   
            PrintWriter pw=new PrintWriter("rep.txt");
            ResultSet res3=st3.executeQuery(str3);  
            while(res3.next())
            {
                pw.println("admit id   test request id    test date       test id      test  name      test  charge ");
                pw.printf("\n%-15s",res3.getString(2));
                pw.printf("%-15s",res3.getString(1));
                pw.printf("%-18s",res3.getString(5));
                p=res3.getString(3);
                pw.printf("%-10s",p);
                pw.printf("%-15s",res3.getString(4));
            
            Statement st4=con.createStatement();
            String str4="select * from testdetailtbl where TESTid='"+p+"'";  
            ResultSet res4=st4.executeQuery(str4);  
            while(res4.next())
            {
                pw.printf("%10s",res4.getString(3));
            }

            }
            pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");
            }

            if(rbtrefund.isSelected()&&rbtid.isSelected())
            {
            Statement st5=con.createStatement();
            String str5="select * from refundtbl where aid='"+txtadmitid.getText()+"'";   
            PrintWriter pw=new PrintWriter("rep.txt");
            ResultSet res5=st5.executeQuery(str5);  
            while(res5.next())
            {
                pw.println("admit id      refund  date     total amount     paid  amount    refund  amount");
                pw.printf("\n%-15s",res5.getString(1));
                pw.printf("%-18s",res5.getString(2));
                pw.printf("%-15s",res5.getString(3));
                pw.printf("%-15s",res5.getString(4));
                pw.printf("%10s",res5.getString(5));
            } 
            pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");               
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
