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
public class paymentreport extends JFrame implements ActionListener,FocusListener
{

       int i=0;
     String[]col={"payment date","payment amount","mode of payment"};
	 String arr[]=new String[9];
     String arr2[]=new String[9];
     String arr3[]=new String[9];
     String arr4[]=new String[9];
	Object[][] data={{"",""}};
	DefaultTableModel model=new DefaultTableModel(col,0);
	JScrollPane sp;
	JTable tbl=new JTable(data,col);
    JLabel lblaid=new JLabel("admit id");
    JTextField txtaid=new JTextField(15);

    JLabel lblpid=new JLabel("patient id");
    JTextField txtpid=new JTextField(15);

   /* JLabel lbltestcharge=new JLabel("Test charge");
    JTextField txttestcharge=new JTextField(15);

    JLabel lblbedcharge=new JLabel("Bed charge");
    JTextField txtbedcharge=new JTextField(15);

    JLabel lbltotal=new JLabel("Total");
    JTextField txttotal=new JTextField(15);
    
    JLabel lblrefund=new JLabel("Refunded amount");
    JTextField txtrefund=new JTextField(15);*/

    JButton btnnew=new JButton("NEW");
    JButton btnprint=new JButton("Print");

    public paymentreport()
    {
        sp=new JScrollPane(tbl); 
		 tbl.setModel(model); 
		 add(sp);
		sp.setBounds(350,200,500,300);
        setTitle(" PAYMENT REPORT...");
        setLayout(null);
        setVisible(true);
        setSize(2000,2000); 

        lblaid.setBounds(350,150,100,40);
        txtaid.setBounds(460,150,100,40);

        lblpid.setBounds(570,150,100,40);
        txtpid.setBounds(680,150,100,40);

        //lbltestcharge.setBounds(350,250,100,40);
        //txttestcharge.setBounds(460,250,100,40);

        //lblbedcharge.setBounds(570,250,100,40);
        //txtbedcharge.setBounds(680,250,100,40);

        //lbltotal.setBounds(350,350,100,40);
//        txttotal.setBounds(460,350,100,40);

  //      lblrefund.setBounds(570,350,100,40);
    //    txtrefund.setBounds(680,350,100,40);

        btnnew.setBounds(350,550,100,40);
        btnprint.setBounds(460,550,100,40);

        add(lblaid);
        add(lblpid);
        //add(lbltestcharge);
        //add(lblbedcharge);
        //add(lbltotal);
        //add(lblrefund);

        add(txtaid);
        add(txtpid);
       // add(txttestcharge);
       // add(txtbedcharge);
        //add(txttotal);
        //add(txtrefund);

        add(btnnew);
        add(btnprint);

        btnnew.addActionListener(this);
        btnprint.addActionListener(this);
        txtaid.addFocusListener(this);
        txtaid.setEditable(false);
        txtpid.setEditable(false);
        tbl.setEnabled(false);
        btnprint.setEnabled(false);



    }

    public void focusLost(FocusEvent f)
    {
        if(f.getSource()==txtaid)
        {
            try{
            Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
            Statement st=con.createStatement();
            String str="select * from paymenttbl where aid='"+txtaid.getText()+"'";
            ResultSet res=st.executeQuery(str);
            while(res.next())
            {
                for(i=0;i<6;i++)
                {
                    arr[i]=res.getString(2);
                    arr2[i]=res.getString(5);
                    arr3[i]=res.getString(6);
                    Vector v=new Vector();
                    for(i=0;i<6;i++)
                    {
                    v.add(arr[i]);
                    v.add(arr2[i]);
                    v.add(arr3[i]);

                    }
                    model.addRow(v);
                }
            }
            Statement st2=con.createStatement();
            String str2="select * from admittbl where aid='"+txtaid.getText()+"'";
            ResultSet res2=st.executeQuery(str2);
            while(res2.next())
            {
                txtpid.setText(res2.getString(1));
            }
            txtaid.setEditable(false);
            btnprint.setEnabled(true);
           
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
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnnew)
        {
            txtaid.setText("");
            txtpid.setText("");
            model.setRowCount(0);
            txtaid.setEditable(true);
        }
        if(e.getSource()==btnprint)
        {
                    try
        {
             Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
            Statement st=con.createStatement();
            PrintWriter pw=new PrintWriter("rep.txt");

                    pw.println(" admit id  patient id  payment date  payment amount    mode of payment");
                for(i=0;i<tbl.getRowCount();i++)
                {
                pw.printf("\n%-15s",txtaid.getText());
                pw.printf("%-8s",txtpid.getText());
                pw.printf("%-15s",tbl.getValueAt(i,0));
                pw.printf("%-18s",tbl.getValueAt(i,1));
                pw.printf("%-15s",tbl.getValueAt(i,2));
                //pw.printf("%-10s",tbl.getValueAt(i,3));
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

}
