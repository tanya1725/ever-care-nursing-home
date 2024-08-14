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
public class dischargereport extends JFrame implements ActionListener,FocusListener
{
    int i=0;
	 String[]col={"",""};
	 String arr[]=new String[9];
     String arr2[]=new String[9];
	Object[][] data={{"",""}};
	DefaultTableModel model=new DefaultTableModel(col,0);
	JScrollPane sp;
	JTable tbl=new JTable(data,col);
        JLabel lblaid=new JLabel("Admit id");
    JTextField txtaid=new JTextField(15);

    JLabel lblpid=new JLabel("patient id");
    JTextField txtpid=new JTextField(15);

    JLabel lblaiddate=new JLabel("date of admit");
    JTextField txtaiddate=new JTextField(15);

    JLabel lbldisdate=new JLabel("date of discharge");
    JTextField txtdisdate=new JTextField(15);

    JLabel lblbedcharge=new JLabel("Bed charge");
    JTextField txtbedcharge=new JTextField(15);

    JLabel lbltestcharge=new JLabel("Test charge");
    JTextField txttestcharge=new JTextField(15);

   // JLabel lblmisccharge=new JLabel("miscellaneous charge");
   // JTextField txtmisccharge=new JTextField(15);

    JLabel lbltotal=new JLabel("Total");
    JTextField txttotal=new JTextField(15);

    JLabel lbldues=new JLabel("Dues");
    JTextField txtdues=new JTextField(15);

    JLabel lblstatus=new JLabel("current status");
    JTextField txtstatus=new JTextField(15);
     JButton btnadd=new JButton("add");
     JButton btnnew=new JButton("new");
     JButton btnprint=new JButton("print");

    public dischargereport()
    {
        sp=new JScrollPane(tbl); 
		 tbl.setModel(model); 
		 add(sp);
		sp.setBounds(870,200,500,300);
        setTitle(" DISCHARGE REPORT...");
        setLayout(null);
        setVisible(true);
        setSize(2000,2000); 

        lblaid.setBounds(350,150,100,40);
        txtaid.setBounds(460,150,100,40);

        lblpid.setBounds(570,150,100,40);
        txtpid.setBounds(680,150,100,40);

        lblaiddate.setBounds(350,250,100,40);
        txtaiddate.setBounds(460,250,100,40);

        lbldisdate.setBounds(570,250,100,40);
        txtdisdate.setBounds(680,250,100,40);

        lblbedcharge.setBounds(350,350,100,40);
        txtbedcharge.setBounds(460,350,100,40);

        lbltestcharge.setBounds(570,350,100,40);
        txttestcharge.setBounds(680,350,100,40);

       // lblmisccharge.setBounds(350,450,100,40);
      //  txtmisccharge.setBounds(460,450,100,40);

        lbltotal.setBounds(570,450,100,40);
        txttotal.setBounds(680,450,100,40);

        lbldues.setBounds(350,550,100,40);
        txtdues.setBounds(460,550,100,40);

        lblstatus.setBounds(570,550,100,40);
        txtstatus.setBounds(680,550,100,40);
        btnadd.setBounds(870,500,60,40);
        btnnew.setBounds(940,500,80,40);
        btnprint.setBounds(1030,500,100,40);

        add(lblaid);
        add(lblpid);
        add(lblaiddate);
        add(lbldisdate);
        add(lbltestcharge);
        add(lblbedcharge);
       // add(lblmisccharge);
        add(lbltotal);
        add(lbldues);
        add(lblstatus);

        add(txtaid);
        add(txtpid);
        add(txtaiddate);
        add(txtdisdate);
        add(txtbedcharge);
        add(txttestcharge);
        //add(txtmisccharge);
        add(txttotal);
        add(txtdues);
        add(txtstatus);
        add(btnadd);
        add(btnnew);
        add(btnprint);

         txtaid.addFocusListener(this);
        btnadd.addActionListener(this);
        btnnew.addActionListener(this);
        btnprint.addActionListener(this);
        txtaid.setEditable(false);
        txtdisdate.setEditable(false);
        txttestcharge.setEditable(false);
        txtbedcharge.setEditable(false);
        txttotal.setEditable(false);
        txtdues.setEditable(false);
        txtaiddate.setEditable(false);
        txtstatus.setEditable(false);
        txtpid.setEditable(false);
        tbl.setEnabled(false);
        btnadd.setEnabled(false);
        btnprint.setEnabled(false);





    }

    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource()==btnadd)
         {
     for(i=0;i<9;i++)
    {
    		Vector v=new Vector();
			v.add(arr[i]);
            v.add(arr2[i]);
            model.addRow(v);
            btnadd.setEnabled(false);
            btnprint.setEnabled(true);
    }
         }
         if(e.getSource()==btnnew)
         {
           // btnadd.setEnabled(true);
            txtaid.setEditable(true);
            txtaid.setText("");
            txtaiddate.setText("");
            txtpid.setText("");
            txttestcharge.setText("");
            txtbedcharge.setText("");
            txttotal.setText("");
            txtdues.setText("");
            txtstatus.setText("");
            txtdisdate.setText("");
            model.setRowCount(0);
         }
         if(e.getSource()==btnprint)
         {
            try
            {
             Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
            Statement st=con.createStatement();
            PrintWriter pw=new PrintWriter("rep.txt");
                for(i=0;i<tbl.getRowCount();i++)
                {
                pw.print(tbl.getValueAt(i,0)+"="+" ");
                pw.println(tbl.getValueAt(i,1)+" ");
                }

             pw.close();
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad rep.txt");

            }
            catch(Exception ee)
            {
                System.out.println(ee);
            }
         }
    }
    public void focusLost(FocusEvent f)
    {
        String p="";
        //String y="";
        String s="";
        String r="";
        int testcharge1=0;
        int y1=0;
        int y=0;
        int flg=0;
        if(f.getSource()==txtaid)
        {
            try
            {
               	Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from admittbl where Aid ='"+txtaid.getText()+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
                while(res.next())
                {
                    flg=1;
                    txtpid.setText(res.getString(1));
                    txtaiddate.setText(res.getString(4));
                }
                if(flg==0)
                {
                    JOptionPane.showMessageDialog(null,"invalid admit id");
                    txtaid.setText("");
                }
                if(flg==1)
                {
                String str2="select * from dischargetbl where aid ='"+txtaid.getText()+"'";
				Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);
                while(res2.next())
                {
                    txtdisdate.setText(res2.getString(7));
                    s=res2.getString(5);
                    txttotal.setText(res2.getString(6));
                    txtstatus.setText(res2.getString(10));
                    int dues1=Integer.parseInt(s); 
                    if(dues1==0)
                    {
                        txtdues.setText("NO DUES");
                    }
                }
                String str3="select * from bedchangetbl where aid ='"+txtaid.getText()+"'";
				Statement st3=con.createStatement();
				ResultSet res3=st3.executeQuery(str3);
                while(res3.next())
                {
                  p=res3.getString(6);
                  int bedcharge1=Integer.parseInt(p); 
				   y=y+bedcharge1;
                   //System.out.println(y);
                   // y1=Integer.parseInt(y); 
                   txtbedcharge.setText(String.valueOf(y));
                   //int y1=Integer.parseInt(y); 
                }
                String str4="select * from paymenttbl where aid ='"+txtaid.getText()+"'";
				Statement st4=con.createStatement();
				ResultSet res4=st4.executeQuery(str4);
                while(res4.next())
                {
                    r=res4.getString(4);
                     int test=Integer.parseInt(r); 
                      y1=Integer.parseInt(txtbedcharge.getText()); 
                     testcharge1=test-y1;
                     System.out.println(y1);                     
                     txttestcharge.setText(String.valueOf(testcharge1));
                     


                }
                txtaid.setEditable(false);
                btnadd.setEnabled(true);
            }
                 for(i=0;i<9;i++)
    {
        arr[0]="admit id";
        arr[1]="patient id";
        arr[2]="admit date";
        arr[3]="discharge date";
        arr[4]="bed charge";
        arr[5]="test charge";
        arr[6]="total";
        arr[7]="dues";
        arr[8]="status";

        arr2[0]=txtaid.getText();
        arr2[1]=txtpid.getText();
        arr2[2]=txtaiddate.getText();
        arr2[3]=txtdisdate.getText();
        arr2[4]=txtbedcharge.getText();
        arr2[5]=txttestcharge.getText();
        arr2[6]=txttotal.getText();
        arr2[7]=txtdues.getText();
        arr2[8]=txtstatus.getText();

    }       
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

    public static void main(String args[])
    {
        dischargereport obj=new dischargereport();
    }


}

