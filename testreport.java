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
public class testreport extends JFrame implements ActionListener,FocusListener
{
    int i=0;
    String p="";

    	 String[]col={"test date","test id","test name","test charge"};
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

   // JLabel lbltestdate=new JLabel("Test date");
    //JTextField txttestdate=new JTextField(15);

    //JLabel lbltestid=new JLabel("Test id");
    //JTextField txttestid=new JTextField(15);

   // JLabel lbltestname=new JLabel("Test name");
   // JTextField txttestname=new JTextField(15);

   // JLabel lbltestcharge=new JLabel("Test charge");
    //JTextField txttestcharge=new JTextField(15);

    JButton btnnew=new JButton("NEW");
    JButton btnprint=new JButton("PRINT");
   // JButton btnshow=new JButton("SHOW");


public testreport()
{
            sp=new JScrollPane(tbl); 
		 tbl.setModel(model); 
		 add(sp);
		sp.setBounds(350,200,500,300);
        setTitle(" TEST REPORT...");
        setLayout(null);
        setVisible(true);
        setSize(2000,2000); 

        lblaid.setBounds(350,150,100,40);
        txtaid.setBounds(460,150,100,40);

        lblpid.setBounds(570,150,100,40);
        txtpid.setBounds(680,150,100,40);

        //lbltestdate.setBounds(350,300,100,40);
       // txttestdate.setBounds(460,300,100,40);

        //lbltestid.setBounds(570,300,100,40);
       // txttestid.setBounds(680,300,100,40);

        //lbltestname.setBounds(350,400,100,40);
       // txttestname.setBounds(460,400,100,40);

       // lbltestcharge.setBounds(570,400,100,40);
       // txttestcharge.setBounds(680,400,100,40);

        btnnew.setBounds(400,510,100,40);
      //  btnshow.setBounds(980,510,100,40);
        btnprint.setBounds(510,510,100,40);

         add(lblaid);
         add(lblpid);
         //add(lbltestdate);
        // add(lbltestid);
        // add(lbltestname);
        // add(lbltestcharge);

         add(txtaid);
         add(txtpid);
         //add(txttestname);
         //add(txttestid);
        // add(txttestcharge);
        // add(txttestdate);
         //add(btnshow);
        add(btnprint);
         add(btnnew);

        // btnshow.addActionListener(this);
         btnnew.addActionListener(this);
         btnprint.addActionListener(this);
         txtaid.addFocusListener(this);
         txtaid.setEditable(false);
         btnprint.setEnabled(false);
         txtpid.setEditable(false);
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

                    pw.println("admit id  patient id  test  date   test id    test   name   test  charge");
                for(i=0;i<tbl.getRowCount();i++)
                {
                pw.printf("\n%-10s",txtaid.getText());
                pw.printf("%-10s",txtpid.getText());
                pw.printf("%-15s",tbl.getValueAt(i,0));
                pw.printf("%-10s",tbl.getValueAt(i,1));
                pw.printf("%-15s",tbl.getValueAt(i,2));
                pw.printf("%-10s",tbl.getValueAt(i,3));
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
                    txtpid.setText(res.getString(1));
                }
                
                String str2="select * from patientreqtbl where aid ='"+txtaid.getText()+"'";
				Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);
                while(res2.next())
                {
                    
                    Vector v=new Vector();
                    for(i=0;i<5;i++)
                    {
                       
                    arr[i]=(res2.getString(5));
                     
                    p=(res2.getString(3));
                    
                    arr3[i]=(res2.getString(4)+"    ");
                String str3="select * from testdetailtbl where TESTid ='"+p+"'";
				Statement st3=con.createStatement();
				ResultSet res3=st3.executeQuery(str3);
                while(res3.next())
                {
                    for(i=0;i<4;i++)
                    {
                        arr4[i]=res3.getString(3);
                        arr2[i]=p;
                

                 for(i=0;i<5;i++)
                 {
                  v.add(arr[i]);
                  v.add(arr2[i]);
                  v.add(arr3[i]);
                  v.add(arr4[i]);
                  
                 }
                    }

                  model.addRow(v);
                    
                    }
                    }
                }
                btnprint.setEnabled(true);
                txtaid.setEditable(false);
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
    testreport obj=new testreport();

}
}
