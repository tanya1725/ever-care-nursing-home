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
import java.io.*;
public class testrequestreport extends JFrame implements ActionListener
{
    JLabel lbldate=new JLabel("date");
    JTextField txtdate=new JTextField(15);
    JLabel lbldate2=new JLabel("to date");
    JTextField txtdate2=new JTextField(15);
    JButton btnok=new JButton("OK");
    JButton btncancel=new JButton("cancel");

public testrequestreport()
{

    
         setTitle(" TEST REQUEST REPORT...");
        setLayout(null);
        setVisible(true);
        setSize(2000,2000);  

        lbldate.setBounds(300,200,100,40);
        txtdate.setBounds(400,200,100,40);
        lbldate2.setBounds(520,200,100,40);
        txtdate2.setBounds(600,200,100,40);
        btnok.setBounds(330,250,80,40);
        btncancel.setBounds(420,250,80,40);

        add(lbldate);
        add(txtdate);
        add(lbldate2);
        add(txtdate2);
        add(btnok);
        add(btncancel);
        btnok.addActionListener(this);
        btncancel.addActionListener(this); 
}
public void actionPerformed(ActionEvent e)
{
    String p="";
    if(e.getSource()==btnok)
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
            Statement st=con.createStatement();
            String str="select * from testsubmittbl where Tdate='"+txtdate.getText()+"'";
            ResultSet res=st.executeQuery(str);

            PrintWriter pw=new PrintWriter("rep.txt");
            while(res.next())
            {    p=res.getString(3);
                pw.print(res.getString(1)+" ");
                pw.print(res.getString(5)+" ");
                pw.print(p+" ");
                pw.print(res.getString(6)+" ");
               
             Statement st2=con.createStatement();
            String str2="select * from testdetailtbl where TESTid='"+p+"'";
            ResultSet res2=st2.executeQuery(str2);
                while(res2.next())
                {
                   pw.print(res2.getString(3));
                    
                }
                pw.println();

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
public static void main(String args[])
{
    testrequestreport obj=new testrequestreport();
}
}