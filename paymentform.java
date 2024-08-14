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

public class paymentform extends JFrame implements FocusListener,ActionListener,KeyListener
{
	String s="";
	int flg=0;
	int check=0;
	int check2=0;
	int check3=0;
	  String p="",q="",b="";
  int bcflg=0;
  String tdate="";
  long z;
  long j=0;
  String charge="";
  long totalcharge=0,totalcharge1=0;
  long charge1=0;
	
	 String[]col={"date","testname","charge"};
	 
	Object[][] data={{"","",""}};
	DefaultTableModel model=new DefaultTableModel(col,0);
	JScrollPane sp;
	JTable tbl=new JTable(data,col);


	 String[]col1={"date","bedalloc","charge"};
	 
	Object[][] data1={{"","",""}};
	DefaultTableModel model1=new DefaultTableModel(col1,0);
	JScrollPane sp1;
	JTable tbl1=new JTable(data,col1);

    JLabel lblheading=new JLabel("PAYMENT FORM");
	JLabel lblleft=new JLabel();
	JLabel lblright=new JLabel();

    JLabel lbltestbill=new JLabel("  TEST BILL PAYMENT");
    JTextField txttestbill=new JTextField();

	    JLabel lblbedbill=new JLabel(" BED BILL PAYMENT");
    JTextField txtbedbill=new JTextField();

	//JLabel lblbill=new JLabel("  BILL PAYMENT");
    //JTextField txtbill=new JTextField();

	JLabel lblgst=new JLabel(" 18% GST");
    JTextField txtgst=new JTextField();

	JLabel lbltotalbill=new JLabel(" TOTAL PAYMENT");
    JTextField txttotalbill=new JTextField();

    JLabel lblaid=new JLabel("Admit id");
    JTextField txtaid=new JTextField();

	JLabel lblreceipt=new JLabel("Receipt id");
    JTextField txtreceipt=new JTextField();

	JLabel lblpay=new JLabel("PAY NOW AMOUNT");
    JTextField txtpay=new JTextField();

	JLabel lblpending=new JLabel("PENDING AMOUNT");
    JTextField txtpending=new JTextField();

	JLabel lblmode=new JLabel("MODE OF PAYMENT");
	JComboBox cmbmode=new JComboBox();

	JButton btnnew =new JButton("new");
	JButton btnpaynow=new JButton("pay now");
	JButton btncancel=new JButton("cancel");
 SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
Date dt=new Date();   

public paymentform()
{
    	sp=new JScrollPane(tbl); 
		 tbl.setModel(model); 
		 add(sp);
		 sp.setBounds(50,200,500,300);

		 sp1=new JScrollPane(tbl1); 
		 tbl1.setModel(model1); 
		 add(sp1);
		 sp1.setBounds(50,510,500,300);
		  setTitle("PAYMENT FORM...");
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

		  lblaid.setBounds(100,100,200,40);
		  lblaid.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,20));
		  txtaid.setBounds(250,100,150,40);

		  lblreceipt.setBounds(410,100,200,40);
		  lblreceipt.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,20));
		  txtreceipt.setBounds(610,100,150,40);

          lbltestbill.setBounds(610,300,200,40);
		  lbltestbill.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		  txttestbill.setBounds(810,300,100,40);

          lblbedbill.setBounds(610,350,200,40);
		  lblbedbill.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		  txtbedbill.setBounds(810,350,100,40);		 
         
		lblgst.setBounds(610,400,100,40);
		lblgst.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		txtgst.setBounds(810,400,100,40);

		lblmode.setBounds(610,450,200,40);
		lblmode.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		cmbmode.setBounds(810,450,100,40);

		lbltotalbill.setBounds(610,500,200,40);
		lbltotalbill.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		txttotalbill.setBounds(810,500,100,40);

		lblpay.setBounds(610,550,200,40);
		lblpay.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		txtpay.setBounds(810,550,100,40);

		lblpending.setBounds(610,600,200,40);
		lblpending.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		txtpending.setBounds(810,600,100,40);

		btnnew.setBounds(610,700,70,40);
		btnnew.setBackground(new Color(102,205,255));
		btnnew.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		btnpaynow.setBounds(700,700,100,40);
	    btnpaynow.setBackground(new Color(102,205,255));
		btnpaynow.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));
		btncancel.setBounds(810,700,100,40);
		btncancel.setBackground(new Color(102,205,255));
		btncancel.setFont(new Font("Franklin Gothic Medium Cond ",Font.BOLD,15));

		   

		  add(lblaid);
		  add(lbltestbill);
		  add(lblbedbill);
		  add(lblgst);
		  add(lbltotalbill);
		  add(lblreceipt);
		  add(lblpay);
		  add(lblpending);
		  add(lblmode);
		  add(lblheading);
		  add(lblleft);
		  add(lblright);


		  add(txtaid);
		  add(txttestbill);
		  add(txtbedbill);
		  add(txtgst);
		  add(txttotalbill);
		  add(txtreceipt);
		  add(txtpay);
		  add(txtpending);
		  add(cmbmode);

		  add(btnnew);
		  add(btnpaynow);
		  add(btncancel);

          cmbmode.addItem("SELECT");
		  cmbmode.addItem("Debit card");
		  cmbmode.addItem("Credit card");
		  cmbmode.addItem("cash");
		  cmbmode.addItem("Net banking");
          txtbedbill.requestFocus(true);
		  txtaid.addFocusListener(this);
		  btnnew.addActionListener(this);
		  btnpaynow.addActionListener(this);
		  btncancel.addActionListener(this);
		  txtpay.addKeyListener(this);
		  txttestbill.setEditable(false);
		  txtbedbill.setEditable(false);
		  tbl.setEnabled(false);
		  tbl1.setEnabled(false);
		  txtgst.setEditable(false);
		  txttotalbill.setEditable(false);
		  txtaid.setEditable(false);
		  txtreceipt.setEditable(false);
		  txtpending.setEditable(false);
		  btnpaynow.setEnabled(false);
		  cmbmode.addActionListener(this);
		 

}
public void keyReleased(KeyEvent k)
{
char ch;

		if(k.getSource()==txtpay)
		{
		 if(txtpay.getText().length()!=0)
		   {
			
			
		
				ch=txtpay.getText().charAt(txtpay.getText().length()-1);
				if(ch>='0' && ch<='9')
					{
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Enter numbers only");
					     txtpay.setText("");
					}
				}
		}
					  

}
public void keyPressed(KeyEvent k)
{

}
public void keyTyped(KeyEvent k)
{

}
public void actionPerformed(ActionEvent e)
{
	int set=1;
	if(e.getSource()==btnpaynow)
	{

             
		try{


		Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");	
				 String str1="select * from dischargetbl where aid ='"+txtaid.getText()+"'";
				Statement st1=con.createStatement();
				ResultSet res1=st1.executeQuery(str1);
				while(res1.next())
				{
					check2=1;
				}
				if(check2==1)
				{
					JOptionPane.showMessageDialog(null,"patient was discharged");
				}
				if(check2==0)
				{
		String str="insert into paymenttbl(receiptId,paymentDate,aid,paymentAmount,paidAmount,modeOfPayment)values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(str);
		ps.setString(2,(""+sdf.format(dt)));
		ps.setString(3,txtaid.getText());
		ps.setString(5,txtpay.getText());
		ps.setString(4,txttotalbill.getText());
		ps.setString(1,txtreceipt.getText());
		ps.setString(6,""+cmbmode.getSelectedItem());
		
	    int total=Integer.parseInt(txtpending.getText()); 
						if(cmbmode.getSelectedItem().toString().equals("SELECT"))
						{
							set=1;
						}
						else
						{
							set=0;
						}
		if(txtpay.getText().length()!=0)
		{
	    int pay=Integer.parseInt(txtpay.getText());
	
		//if(total>=pay)
		//{

        if(set==0)
		{
		ps.executeUpdate();
		
		Statement st=con.createStatement();
		
		st.executeUpdate("update keytbl set receipt=receipt+1");
		JOptionPane.showMessageDialog(null,"payment sucessfully");
		txttotalbill.setText("");
		txtgst.setText("");
		txtaid.setText("");
		txtbedbill.setText("");
		txttestbill.setText("");
		txtpay.setText("");
		model.setRowCount(0);
		model1.setRowCount(0);
		txtpending.setText("");
		txtaid.setEditable(false);
		txtreceipt.setText("");
		btnpaynow.setEnabled(false);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"invalid mode of payment");
		}


		}
		//else{
			//JOptionPane.showMessageDialog(null,"invalid payment amount");
		//}
		
		else
		{
			JOptionPane.showMessageDialog(null,"invalid amount");
		}

		

	
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
	if(e.getSource()==btnnew)
	{
		try
		{	
	     
		 
        Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");	
		txttotalbill.setText("");
		txtgst.setText("");
		txtaid.setText("");
		txtbedbill.setText("");
		txttestbill.setText("");
		model.setRowCount(0);
		model1.setRowCount(0);
		txtaid.setEditable(true);
		txtpending.setText("");


		check=0;
		//btnpaynow.setEnabled(true);
				Statement st=con.createStatement();
		String str="select * from keytbl";	
         ResultSet res=st.executeQuery(str);
		 while(res.next())
		 {
		 txtreceipt.setText("receipt/"+res.getString(8));
		 }
		 con.close();
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}

	}

}
public void focusLost(FocusEvent f)
{ 
	String t="",p="",q="",r="",cha="",pending="";
	long total=0,total1=0;
	int i=0;
	int amount,amount1;
	long sum=0;
    long gst=0;
	long  totalsum=0,totalpending=0;
	long y=0;
	int flag=0;
	long g=0;
	
	String tdate="";
	             if(f.getSource()==txtaid)
				 {
					try{
						


				//String wstr=JOptionPane.showInputDialog(null,"Enter admit id:");
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str15="select * from admittbl where aid ='"+txtaid.getText()+"'";
				Statement st15=con.createStatement();
				ResultSet res15=st15.executeQuery(str15);
				while(res15.next())
				{
					check3=1;
				}
				if(check3==1)
				{
				String str="select * from patientreqtbl where aid ='"+txtaid.getText()+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				btnpaynow.setEnabled(true);
				
				while(res.next())
				{
					//flg=1;
					flag=1;
					s=res.getString(3);
					//System.out.println(s);
				
				


					
				String str2="select * from testdetailtbl where TESTid ='"+s+"'";
				System.out.println(s);
				Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);
				while(res2.next())
				{
					t=res2.getString(3);
				}
					Vector v=new Vector();
					v.add(res.getString(5));
					v.add (res.getString(4));
					v.add(t);
					model.addRow(v);
				
				
				}
                  /*if(flag==0)
				  {
					JOptionPane.showMessageDialog(null,"invalid admit id");
					btnpaynow.setEnabled(false);
					//txtaid.setText("");
				  }*/

				//Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str3="select * from bedchangetbl where aid ='"+txtaid.getText()+"'";
				Statement st3=con.createStatement();
				ResultSet res3=st3.executeQuery(str3);
				//SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
                while(res3.next())
				{
					check3=1;
					p=res3.getString(5);
					q=res3.getString(4);
					cha=res3.getString(6);
					
				String tt[]=q.split("/");
				//String ttt[]=p.split("/");
				//System.out.println(ttt[0]);
				//diff=ttt[0]-ttt[0];
				Vector v1=new Vector();
				v1.add(p);
				v1.add(q);
				v1.add(cha);
				model1.addRow(v1);
				check=1;
				}
				if(check==1)
				{

				   for(i=0;i<tbl.getRowCount();i++)
				   {
					amount=Integer.parseInt((String)tbl.getValueAt(i,2));
					
						total=total+amount;
					
				   }
				   txttestbill.setText(String.valueOf(total));

				   	for(i=0;i<tbl1.getRowCount();i++)
				   {
					amount1=Integer.parseInt((String)tbl1.getValueAt(i,2));
					
						total1=total1+amount1;
					
				   }
				   txtbedbill.setText(String.valueOf(total1));
				   sum=total+total1;
				   System.out.println(sum);
				   gst=(sum/100)*18;
				   System.out.println(gst);
				   txtgst.setText(String.valueOf(gst));
				   totalsum=sum+gst;
				   txttotalbill.setText(String.valueOf(totalsum));
				  
				   txtpending.setText(String.valueOf(totalsum));
				}
				//Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");

				


				
				if(check==0)
				{
				String str8="select * from admittbl where aid ='"+txtaid.getText()+"'";
				Statement st8=con.createStatement();
				ResultSet res8=st8.executeQuery(str8);		
				while(res8.next())

				{
					check3=1;
					p=res8.getString(4);
					q=res8.getString(8);
				}	

				String tt[]=q.split("/");
				String str9="select * from wardmastertbl where wtype ='"+tt[0]+"'";
				Statement st9=con.createStatement();
				ResultSet res9=st9.executeQuery(str9);		
				while(res9.next())
				{
					cha=res9.getString(2);
				 
                  r=""+sdf.format(dt);              
                  Date dt1=sdf.parse(p);
                  Date dt2=sdf.parse(r);
                  long x=dt1.getTime();
                   y=dt2.getTime();
                  z=y-x;
                  j=z/(1000*60*60*24);
                  System.out.println(j);
				 long num=new Long(cha);
           charge1=Long.parseLong(cha);
            totalcharge=j*charge1;    
            System.out.println(totalcharge);  
				}		
						
				Vector v2=new Vector();
				v2.add(p);
				v2.add(q);
				v2.add(cha);
				model1.addRow(v2);
					for(i=0;i<tbl.getRowCount();i++)
				   {
					amount=Integer.parseInt((String)tbl.getValueAt(i,2));
					
						total=total+amount;
					
				   }
				   txttestbill.setText(String.valueOf(total));

				   	for(i=0;i<tbl1.getRowCount();i++)
				   {
					amount1=Integer.parseInt((String)tbl1.getValueAt(i,2));
					
						total1=total1+amount1;
					
				   }
				   txtbedbill.setText(String.valueOf(totalcharge));
				   sum=total+totalcharge;
				   System.out.println(sum);
				   gst=(sum/100)*18;
				   System.out.println(gst);
				   txtgst.setText(String.valueOf(gst));
				   totalsum=sum+gst;
				   txttotalbill.setText(String.valueOf(totalsum));
				   
				  
				   txtpending.setText(String.valueOf(totalsum));

				}
				String str2="select * from paymenttbl where aid ='"+txtaid.getText()+"'";
				Statement st2=con.createStatement();
				ResultSet res2=st2.executeQuery(str2);
				while(res2.next())
				{
					flg=1;
				}
				String str4="select * from paymenttbl where aid ='"+txtaid.getText()+"'";
				Statement st4=con.createStatement();
				ResultSet res4=st4.executeQuery(str4);
				if(flg==1)
				{
				while(res4.next())
				{
					pending=res4.getString(5);
					//y=y+pending;
					//System.out.println(pending);
				
				
                 int pending1=Integer.parseInt(pending); 
				 g=g+pending1;
                 System.out.println(g);
				}
				totalpending=totalsum-g;
				txtpending.setText(String.valueOf(totalpending));
				}
				//txtaid.setText("");
				txtaid.setEditable(false);

					}
										
					if(check3==0)
					{
                     JOptionPane.showMessageDialog(null,"patient does not exist");
					 txtaid.setText("");
					 txtaid.setEditable(false);
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
