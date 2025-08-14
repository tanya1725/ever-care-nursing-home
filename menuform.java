import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class menuform extends JFrame implements ActionListener,MouseListener,MouseMotionListener
{
	int y;
JLabel lbladmit=new JLabel("ADMIT");
JLabel lbltestrequest=new JLabel("TEST REQUEST");
JLabel lblpayment=new JLabel("PAYMENT");
JLabel lbldischarge=new JLabel("DISCHARGE");
JLabel lblreport=new JLabel(" REPORTS");
JLabel lbldischargereport=new JLabel(" DISCHARGE REPORTS");
JLabel lblpaymentreport=new JLabel(" PAYMENT REPORTS");
JLabel lblpatient=new JLabel("PATIENT");
JLabel lblward=new JLabel("WARD");
JLabel lblborder=new JLabel();
JLabel lblhome=new JLabel("HOME");
JLabel lbltransaction=new JLabel("TRANSACTION");
JLabel lblmaster=new JLabel("MASTER");
JLabel lblreport2=new JLabel("REPORT");
JLabel lblexit=new JLabel("EXIT");
JLabel lbllogin=new JLabel("LOGIN");
JLabel lbltestmaster=new JLabel("TEST MASTER");
JLabel lblbedchange=new JLabel("BED CHANGE");
JLabel lbldoctor=new JLabel("DOCTOR");
JLabel lbltestsubmit=new JLabel("TEST SUBMIT");
//JLabel lbldoctor=new JLabel("DOCTOR");
JLabel lblmiddle=new JLabel("EVER  CARE  NURSING  HOME");
JLabel lblmiddle2=new JLabel();
JLabel lblmiddle3=new JLabel();
JLabel lblmiddle4=new JLabel();
JLabel lblmiddle5=new JLabel();

JLabel lblby=new JLabel("NILU GORAI");
JLabel lbldeveloped=new JLabel(new ImageIcon("images/developed.jpg"));
JLabel lblbedchangelogo=new JLabel(new ImageIcon("images/bedchange2.jpg"));
JLabel lblreportslogo=new JLabel(new ImageIcon("images/reports.jpg"));
JLabel lbltestsubmitlogo=new JLabel(new ImageIcon("images/testsubmitlogo.jpg"));
JLabel lbldoctorlogo=new JLabel(new ImageIcon("images/master.jpg"));
JLabel lblloginlogo=new JLabel(new ImageIcon("images/login.jpg"));
JLabel lbltransactionlogo=new JLabel(new ImageIcon("images/transaction.jpg"));
JLabel lblexitlogo=new JLabel(new ImageIcon("images/exit.jpg"));

JLabel lbllogo=new JLabel(new ImageIcon("images/backnms2.jpg"));
//JLabel lbllogo3=new JLabel(new ImageIcon("images/backnms2.jpg"));
JLabel lbllogo2=new JLabel(new ImageIcon("images/nms.jpg"));
JLabel lbladmitlogo=new JLabel(new ImageIcon("images/admit.jpg"));
JLabel lblpatientlogo=new JLabel(new ImageIcon("images/patient.jpg"));
JLabel lblhomelogo=new JLabel(new ImageIcon("images/home.jpg"));
JLabel lblmasterlogo=new JLabel(new ImageIcon("images/master.jpg"));

JLabel lbldischargelogo=new JLabel(new ImageIcon("images/discharge.jpg"));
JLabel lblpaymentlogo=new JLabel(new ImageIcon("images/payment.jpg"));
JLabel lbltestlogo=new JLabel(new ImageIcon("images/test.jpg"));
JLabel lblleft=new JLabel("");
JLabel lblright=new JLabel("");

public menuform( int x)
{
	setSize(2000,2000);
	setVisible(true);
	setLayout(null);
	setResizable(false);
	y=x;
	
   lbldeveloped.setBounds(0,0,100,100);
   lblby.setBounds(0,100,110,10);

	lbllogo.setBounds(50,70,2000,1000);
	//lbllogo3.setBounds(20,1000,2000,200);
	lbllogo2.setBounds(520,0,200,100);
	lblloginlogo.setBounds(1800,0,100,100);
	lbllogin.setBounds(1800,90,100,20);

	lbladmit.setBounds(25,560,210,70);
	lbladmitlogo.setBounds(60,440,150,150);

	lblborder.setBounds(0,110,2000,50);

	lblhome.setBounds(150,120,100,40);
    lblhomelogo.setBounds(100,115,60,40);

	lbltransaction.setBounds(905,120,250,40);
	lbltransactionlogo.setBounds(850,115,60,40);

	lblmaster.setBounds(500,120,150,40);
	lblmasterlogo.setBounds(440,115,60,40);

	

	lblexit.setBounds(1700,120,100,40);
	lblexitlogo.setBounds(1650,115,60,40);

    lblmiddle2.setBounds(0,10,2000,260);
	lblmiddle3.setBounds(0,165,250,950);


	lbltestrequest.setBounds(905,160,250,40);
	

	lbltestsubmit.setBounds(905,200,250,40);
	
    

    lblpayment.setBounds(1350,200,190,40);
	//lblpaymentlogo.setBounds(1350,170,100,70);

	lbldischarge.setBounds(30,840,190,67);
	lbldischargelogo.setBounds(80,750,100,100);

	lblreport.setBounds(1350,160,190,40);
	lblreport2.setBounds(1350,120,150,40);
    lblreportslogo.setBounds(1300,115,60,40);



	lblpatient.setBounds(45,280,190,67);
	lblpatientlogo.setBounds(100,200,100,100);

	lbldoctor.setBounds(500,200,150,40);
  //  lbldoctorlogo.setBounds(420,175,100,70);

	
	

	lblward.setBounds(500,240,150,40);
	lbltestmaster.setBounds(500,160,150,40);




	lblbedchange.setBounds(905,240,250,40);


	

   lblmiddle.setBounds(0,0,2000,110);


	lblleft.setBounds(0,180,350,870);
	lblright.setBounds(1870,160,50,890);
	
	lblleft.setOpaque(true);
	lblright.setOpaque(true);
	//lbladmit.setOpaque(true);
	lbltestrequest.setOpaque(true);
	
	//lbldischarge.setOpaque(true);
	
	//lblpatient.setOpaque(true);
	lblward.setOpaque(true);
	lbldoctor.setOpaque(true);
	lbltestmaster.setOpaque(true);
	lblbedchange.setOpaque(true);
	lblmiddle.setOpaque(true);
	lblmiddle.setOpaque(true);
	lblmiddle2.setOpaque(true);
	lblmiddle3.setOpaque(true);
	//lbllogin.setOpaque(true);
	lblreport.setOpaque(true);
	lblborder.setOpaque(true);

	
	
    lbltestrequest.setOpaque(true);
	lbltestsubmit.setOpaque(true);
	lbldischargereport.setOpaque(true);
	lblpaymentreport.setOpaque(true);

	lbladmit.setHorizontalAlignment(JLabel.CENTER);
	lblmiddle.setHorizontalAlignment(JLabel.CENTER);
	lblreport.setHorizontalAlignment(JLabel.CENTER);
	lbldischarge.setHorizontalAlignment(JLabel.CENTER);
	lblpatient.setHorizontalAlignment(JLabel.CENTER);
	lbltestrequest.setHorizontalAlignment(JLabel.CENTER);
	lbltestsubmit.setHorizontalAlignment(JLabel.CENTER);
	lbltestrequest.setHorizontalAlignment(JLabel.CENTER);

	lblpayment.setHorizontalAlignment(JLabel.CENTER);
	lbldischargereport.setHorizontalAlignment(JLabel.CENTER);
	lblpaymentreport.setHorizontalAlignment(JLabel.CENTER);

		lblhome.setHorizontalAlignment(JLabel.CENTER);

		lbllogin.setHorizontalAlignment(JLabel.CENTER);
		lbltransaction.setHorizontalAlignment(JLabel.CENTER);
		lblmaster.setHorizontalAlignment(JLabel.CENTER);
		lblreport2.setHorizontalAlignment(JLabel.CENTER);
		lblexit.setHorizontalAlignment(JLabel.CENTER);




	lblward.setHorizontalAlignment(JLabel.CENTER);

	//lbldoctor.setHorizontalAlignment(JLabel.CENTER);
	lblbedchange.setHorizontalAlignment(JLabel.CENTER);
	
	lbldoctor.setHorizontalAlignment(JLabel.CENTER);
	lbltestmaster.setHorizontalAlignment(JLabel.CENTER);

    lblmiddle.setForeground(new Color(0,0,0));
	lblleft.setBackground(new Color(13,109,147));
	lblright.setBackground(new Color(133,186,222));
	lblmiddle.setBackground(new Color(133,186,222));
	lbldischargereport.setBackground(new Color(102,204,255));
	lblpaymentreport.setBackground(new Color(102,204,255));
	//lbladmit.setBackground(new Color(255,255,255));
	//lbldischarge.setBackground(new Color(255,255,255));
	//lbltestrequest.setBackground(new Color(255,255,255));
	//lbltestsubmit.setBackground(new Color(255,255,255));
	//lbltestsubmit.setBackground(new Color(255,255,255));
	//lblpatient.setBackground(new Color(255,255,255));
	//lblreport.setBackground(new Color(255,255,255));
	//lblward.setBackground(new Color(16,158,184));
	
	//lbldoctor.setBackground(new Color(16,158,184));
	lblborder.setBackground(new Color(63,147,203));

	lblmiddle3.setBackground(new Color(133,186,222));
	//lblmiddle2.setBackground(new Color(174,231,133));

	
	//lblpayment.setBackground(new Color(255,255,255));

	//lblbedchange.setBackground(new Color(255,255,255));
	
    	lbldischarge.setFont(new Font("Arial",Font.BOLD,15));

    	lbladmit.setFont(new Font("Arial",Font.BOLD,15));
    	lblmiddle.setFont(new Font("Arial",Font.BOLD,35));
		lblhome.setFont(new Font("Arial",Font.BOLD,20));
		lbltransaction.setFont(new Font("Arial",Font.BOLD,20));
		lblexit.setFont(new Font("Arial",Font.BOLD,20));

		lblmaster.setFont(new Font("Arial",Font.BOLD,20));
		lblreport2.setFont(new Font("Arial",Font.BOLD,20));
		lbllogin.setFont(new Font("Arial",Font.BOLD,15));

		lblpatient.setFont(new Font("Arial",Font.BOLD,15));
		lblby.setFont(new Font("Arial",Font.BOLD,15));



		lblward.setVisible(false);
		lbldoctor.setVisible(false);
		lbltestmaster.setVisible(false);
		lbltestrequest.setVisible(false);
		lbltestsubmit.setVisible(false);
		lblbedchange.setVisible(false);
		lblreport.setVisible(false);

if(y==1)
{

		lblward.setVisible(true);
		lbldoctor.setVisible(true);
		lbltestmaster.setVisible(true);
		lbltestrequest.setVisible(true);
		lbltestsubmit.setVisible(true);
		lblbedchange.setVisible(true);
		lblreport2.setVisible(true);
}



 
	add(lbllogo2);
    add(lblpaymentlogo);
    add(lbldischargelogo);
    add(lbladmitlogo);
	
	add(lblpatientlogo);
	add(lblhomelogo);
	add(lblreportslogo);
   
	add(lblmasterlogo);
	add(lbldoctorlogo);
	add(lbltransactionlogo);
    add(lblexitlogo);

	
	add(lblloginlogo);
	//add(lbldoctor);
	


    add(lbllogo2);
	add(lbldeveloped);
    add(lblpaymentlogo);
    add(lbldischargelogo);
    add(lbladmitlogo);
	add(lbltestlogo);
	add(lblpatientlogo);
    add(lbltestrequest);
    add(lblpayment);	
	add(lbladmit);	 	
	add(lbldischarge);
	add(lbllogin);
	add(lblbedchange);
	add(lbldoctor);
	add(lbltestmaster);
    add(lbltestsubmit);
	add(lblhome);
	add(lbltransaction);
	add(lblmaster);
	add(lblreport2);
	add(lblexit);
	add(lblborder);
	
	add(lblward);
	//add(lblby);

	add(lblmiddle);
     add(lblreport);

	// add(lblward);
	 add(lblpatient);

	 add(lblright);
	 add(lblmiddle3);
	//add(lblmiddle2);

	// add(lbllogo3);
	 add(lbllogo);




	 lblmaster.addMouseListener(this);
	 lblmaster.addMouseMotionListener(this);

	 lbltransaction.addMouseListener(this);
	 lbltransaction.addMouseMotionListener(this);

	 lblreport2.addMouseListener(this);
	 lblreport2.addMouseMotionListener(this);

	 lblexit.addMouseListener(this);
	 lblexit.addMouseMotionListener(this);

	 lbltestsubmit.addMouseListener(this);
	 lbltestsubmit.addMouseMotionListener(this);

	 lbltestrequest.addMouseListener(this);
	 lbltestrequest.addMouseMotionListener(this);

	 lblbedchange.addMouseListener(this);
	 lblbedchange.addMouseMotionListener(this);

	 lbllogo.addMouseListener(this);
	 lbllogo.addMouseMotionListener(this);

	 lblhome.addMouseListener(this);
	 lblhome.addMouseMotionListener(this);

	 lblward.addMouseListener(this);
	 lblward.addMouseMotionListener(this);

	 lbldoctor.addMouseListener(this);
	 lbldoctor.addMouseMotionListener(this);

	 lbltestmaster.addMouseListener(this);
	 lbltestmaster.addMouseMotionListener(this);

	 lblreport.addMouseListener(this);
	 lblreport.addMouseMotionListener(this);

	 lbllogin.addMouseListener(this);
	 lbllogin.addMouseMotionListener(this);

	 lblexit.addMouseListener(this);
	 lblexit.addMouseMotionListener(this);

	 lbltestmaster.addMouseListener(this);
	 lbltestmaster.addMouseMotionListener(this);

	 lblpatient.addMouseListener(this);
	 lblpatient.addMouseMotionListener(this);

	 lbladmit.addMouseListener(this);
	 lbladmit.addMouseMotionListener(this);

	 lbldischarge.addMouseListener(this);
	 lbldischarge.addMouseMotionListener(this);

	 lblpayment.addMouseListener(this);
	 lblpayment.addMouseMotionListener(this);





		lblward.setVisible(false);
		lbldoctor.setVisible(false);
		lbltestmaster.setVisible(false);
		lbltestrequest.setVisible(false);
		lbltestsubmit.setVisible(false);
		lblbedchange.setVisible(false);
		lblreport.setVisible(false);
		lblpayment.setVisible(false);
	 
	
	

}
public void mouseExited(MouseEvent m)
{

}
public void mouseEntered(MouseEvent m)
{
	
}
public void mouseReleased(MouseEvent m)
{

}
public void mousePressed(MouseEvent m)
{
	
}
public void mouseClicked(MouseEvent m)
{
	if(y==1)
	{
		if(m.getSource()==lbladmit)
	{
		bedavailbility obj=new bedavailbility(1,"","","","","","",0);
		//lbladmit.setBackground(new Color(0,0,255));
	}
	if(m.getSource()==lbltestrequest)
	{
		testrequest obj=new testrequest();
	}

	if(m.getSource()==lbltestsubmit)
	{
		testsubmit obj=new testsubmit();
	}

	if(m.getSource()==lblpayment)
	{
		paymentform obj=new paymentform();
	}
	if(m.getSource()==lbldischarge)
	{
		dischargeform obj=new dischargeform();
	}
	if(m.getSource()==lblbedchange)
	{
		bedchange obj=new bedchange("","","","","","","",0);
	}



	if(m.getSource()==lblward)
	{
		Wardmaster obj=new Wardmaster();
		//lblward.setVisible(false);
		//lbldoctor.setVisible(false);
	}
	if(m.getSource()==lbldoctor)
	{
		doctorform obj=new doctorform();

	}


	if(m.getSource()==lblreport)
	{
		report obj=new report();

	}
	if(m.getSource()==lblexit)
	{
		this.dispose();
	}

	if(m.getSource()==lbltestmaster)
	{
		testmaster obj=new testmaster();
	}
	if(m.getSource()==lblpatient)
	{
		patientform obj=new patientform();
	}
	}
	if(m.getSource()==lblhome)
	{
		Splashform obj=new Splashform();
	}
	
	if(m.getSource()==lbllogin)
	{
	 Loginform obj=new Loginform();

	}
}
public void mouseMoved(MouseEvent m)
{



if(y==1)
{

		if(m.getSource()==lblmaster)
		{
			lblmaster.setOpaque(true);
			lbltransaction.setOpaque(false);
			lbltestrequest.setVisible(false);
			lbltestsubmit.setVisible(false);
			lblbedchange.setVisible(false);
           lblward.setVisible(true);
		   lbldoctor.setVisible(true);
		   lbltestmaster.setVisible(true);
		   lblreport2.setOpaque(false);
		   lblexit.setOpaque(false);
		   lblreport.setVisible(false);
			lblhome.setOpaque(false);
			lbllogin.setOpaque(false);
			lblpayment.setVisible(false);
			lblpatient.setFont(new Font("Arial",Font.BOLD,15));
			lbldischarge.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,15));
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setFont(new Font ("Arial",Font.BOLD,20));
		   lblmaster.setBackground(new Color(133,186,222));
		   lblmaster.setFont(new Font("Arial",Font.BOLD,25));
		   	lbltransaction.setFont(new Font("Arial",Font.BOLD,20));	
			lblreport2.setFont(new Font("Arial",Font.BOLD,20));	
		    lblexit.setFont(new Font ("Arial",Font.BOLD,20));
		}
		if(m.getSource()==lblward)
		{
			lblward.setBackground(new Color(133,186,222));
			lbldoctor.setBackground(new Color(255,255,255));
			lbltestmaster.setBackground(new Color(255,255,255));
		}
		if(m.getSource()==lbldoctor)
		{
			lbldoctor.setBackground(new Color(133,186,222));
			lblward.setBackground(new Color(255,255,255));
			lbltestmaster.setBackground(new Color(255,255,255));
		}
		if(m.getSource()==lbltestmaster)
		{
			lbltestmaster.setBackground(new Color(133,186,222));
			lblward.setBackground(new Color(255,255,255));
			lbldoctor.setBackground(new Color(255,255,255));
		}
		if(m.getSource()==lbltransaction)
		{
		   lbltestrequest.setVisible(true);
		   lbltestsubmit.setVisible(true);
		   lblbedchange.setVisible(true);
		   lblmaster.setOpaque(false);
		   lblward.setVisible(false);
		   lbldoctor.setVisible(false);
		   lbltestmaster.setVisible(false);
		   lbltransaction.setOpaque(true);
		   lblreport2.setOpaque(false);
		   lblexit.setOpaque(false);
		   lblreport.setVisible(false);
		   	lblhome.setOpaque(false);
			lbllogin.setOpaque(false);
			lblpayment.setVisible(false);
			lblpatient.setFont(new Font("Arial",Font.BOLD,15));
			lbldischarge.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,15));
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setFont(new Font ("Arial",Font.BOLD,20));
		   lbltransaction.setBackground(new Color(133,186,222));
		   lbltransaction.setFont(new Font("Arial",Font.BOLD,25));	
		    lblmaster.setFont(new Font("Arial",Font.BOLD,20));
			lblreport2.setFont(new Font("Arial",Font.BOLD,20));	
			lblexit.setFont(new Font ("Arial",Font.BOLD,20));

		}
			if(m.getSource()==lbltestsubmit)
			{
				  
				  lbltestsubmit.setBackground(new Color(133,186,222));	
				  lbltestrequest.setBackground(new Color(255,255,255));
				  lblbedchange.setBackground(new Color(255,255,255));		  

			}
			if(m.getSource()==lbltestrequest)
			{
				lbltestrequest.setBackground(new Color(133,186,222));
				lbltestsubmit.setBackground(new Color(255,255,255));
				lblbedchange.setBackground(new Color(255,255,255));

			}
			if(m.getSource()==lblbedchange)
			{
				lblbedchange.setBackground(new Color(133,186,222));
				lbltestrequest.setBackground(new Color(255,255,255));
				lbltestsubmit.setBackground(new Color(255,255,255));
			}

		if(m.getSource()==lblreport2)
		{
			lbltransaction.setOpaque(false);
			lblmaster.setOpaque(false);
			lblreport.setOpaque(true);
			lblpayment.setOpaque(true);
			lblreport.setVisible(true);
			lblexit.setOpaque(false);
			lbltestrequest.setVisible(false);
			lbltestsubmit.setVisible(false);
			lblbedchange.setVisible(false);
			lblward.setVisible(false);
			lbldoctor.setVisible(false);
			lbltestmaster.setVisible(false);
			lblhome.setOpaque(false);
			lblpayment.setVisible(false);
			lblpatient.setFont(new Font("Arial",Font.BOLD,15));
			lbldischarge.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setFont(new Font ("Arial",Font.BOLD,20));
			lblexit.setFont(new Font ("Arial",Font.BOLD,20));
			lbllogin.setOpaque(false);
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
		    lblreport.setFont(new Font("Arial",Font.BOLD,15));	
			lblpayment.setFont(new Font("Arial",Font.BOLD,15));	
		    lbltransaction.setFont(new Font("Arial",Font.BOLD,20));	
			 lblmaster.setFont(new Font("Arial",Font.BOLD,20));
			 lblreport2.setBackground(new Color(133,186,222));
			 lblpayment.setVisible(true);
		}
		if(m.getSource()==lblpayment)
		{
			lblpayment.setBackground(new Color(133,186,222));
			lblreport.setBackground(new Color(255,255,255));
		}
		if(m.getSource()==lblreport)
		{
			lblreport.setBackground(new Color(133,186,222));
			lblpayment.setBackground(new Color(255,255,255));
		}
		if(m.getSource()==lblexit)
		{
			lblmaster.setOpaque(false);
			lbltransaction.setOpaque(false);
			lblreport2.setOpaque(false);
			lblexit.setOpaque(true);
			lbltestrequest.setVisible(false);
			lbltestsubmit.setVisible(false);
			lblbedchange.setVisible(false);
			lblward.setVisible(false);
			lbldoctor.setVisible(false);
			lbltestmaster.setVisible(false);
			lblreport.setVisible(false);
			lblhome.setOpaque(false);
			lblpayment.setVisible(false);
						lbllogin.setOpaque(false);
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setFont(new Font ("Arial",Font.BOLD,20));
			lblpatient.setFont(new Font("Arial",Font.BOLD,15));
			lbldischarge.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,15));
			lblexit.setBackground(new Color(133,186,222));
			lblexit.setFont(new Font ("Arial",Font.BOLD,25));
			 lbltransaction.setFont(new Font("Arial",Font.BOLD,20));	
			 lblmaster.setFont(new Font("Arial",Font.BOLD,20));
			  lblreport2.setFont(new Font("Arial",Font.BOLD,20));	
			  lblpayment.setFont(new Font("Arial",Font.BOLD,15));
		}

		if(m.getSource()==lblhome)
		{
			lbltransaction.setOpaque(false);
			lblreport2.setOpaque(false);
			lblexit.setOpaque(false);
			lbltestrequest.setVisible(false);
			lbltestsubmit.setVisible(false);
			lblbedchange.setVisible(false);
			lblward.setVisible(false);
			lbldoctor.setVisible(false);
			lbltestmaster.setVisible(false);
			lblreport.setVisible(false);
			lblhome.setOpaque(true);
			lbllogin.setOpaque(false);
			lblpayment.setVisible(false);
			lblpatient.setFont(new Font("Arial",Font.BOLD,15));
			lbldischarge.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,15));
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setBackground(new Color(133,186,222));
			lblhome.setFont(new Font ("Arial",Font.BOLD,25));
			lblexit.setFont(new Font ("Arial",Font.BOLD,20));
			lbltransaction.setFont(new Font("Arial",Font.BOLD,20));	
			lblmaster.setFont(new Font("Arial",Font.BOLD,20));
			lblreport2.setFont(new Font("Arial",Font.BOLD,20));
			 lblpayment.setFont(new Font("Arial",Font.BOLD,15));

		}
		if(m.getSource()==lbllogo)
		{
			lblmaster.setOpaque(false);
			lbltransaction.setOpaque(false);
			lblreport2.setOpaque(false);
			lblexit.setOpaque(false);
			lblhome.setOpaque(false);
			lbldoctor.setVisible(false);
			lblward.setVisible(false);
			lbltestmaster.setVisible(false);
			lbltestrequest.setVisible(false);
			lbltestsubmit.setVisible(false);
			lblbedchange.setVisible(false);
			lblreport.setVisible(false);
			lbllogin.setOpaque(false);
			lblpayment.setVisible(false);
			lblpatient.setFont(new Font("Arial",Font.BOLD,15));
			lbldischarge.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,15));
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setFont(new Font ("Arial",Font.BOLD,20));
			lblexit.setFont(new Font ("Arial",Font.BOLD,20));
			lbltransaction.setFont(new Font("Arial",Font.BOLD,20));	
			lblmaster.setFont(new Font("Arial",Font.BOLD,20));
			lblreport2.setFont(new Font("Arial",Font.BOLD,20));	
			 lblpayment.setFont(new Font("Arial",Font.BOLD,15));
		}	
		if(m.getSource()==lbllogin)
		{
			//lbllogin.setOpaque(true);
			lbllogin.setFont(new Font("Arial",Font.BOLD,20));
			
		}
		if(m.getSource()==lblpatient)
		{
			lblmaster.setOpaque(false);
			lbltransaction.setOpaque(false);
			lblreport2.setOpaque(false);
			lblexit.setOpaque(false);
			lblhome.setOpaque(false);
			lbldoctor.setVisible(false);
			lblward.setVisible(false);
			lbltestmaster.setVisible(false);
			lbltestrequest.setVisible(false);
			lbltestsubmit.setVisible(false);
			lblbedchange.setVisible(false);
			lblreport.setVisible(false);
			lbllogin.setOpaque(false);
			lblpayment.setVisible(false);
			lbldischarge.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,15));
			lblpatient.setFont(new Font("Arial",Font.BOLD,20));
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setFont(new Font ("Arial",Font.BOLD,20));
			lblexit.setFont(new Font ("Arial",Font.BOLD,20));
			lbltransaction.setFont(new Font("Arial",Font.BOLD,20));	
			lblmaster.setFont(new Font("Arial",Font.BOLD,20));
			lblreport2.setFont(new Font("Arial",Font.BOLD,20));	
			 lblpayment.setFont(new Font("Arial",Font.BOLD,15));
				
		}
		if(m.getSource()==lbladmit)
		{
			 lblmaster.setOpaque(false);
			lbltransaction.setOpaque(false);
			lblreport2.setOpaque(false);
			lblexit.setOpaque(false);
			lblhome.setOpaque(false);
			lbldoctor.setVisible(false);
			lblward.setVisible(false);
			lbltestmaster.setVisible(false);
			lbltestrequest.setVisible(false);
			lbltestsubmit.setVisible(false);
			lblbedchange.setVisible(false);
			lblreport.setVisible(false);
			lbllogin.setOpaque(false);
			lblpayment.setVisible(false);
			lbldischarge.setFont(new Font("Arial",Font.BOLD,15));
			lblpatient.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,20));
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setFont(new Font ("Arial",Font.BOLD,20));
			lblexit.setFont(new Font ("Arial",Font.BOLD,20));
			lbltransaction.setFont(new Font("Arial",Font.BOLD,20));	
			lblmaster.setFont(new Font("Arial",Font.BOLD,20));
			lblreport2.setFont(new Font("Arial",Font.BOLD,20));	
			 lblpayment.setFont(new Font("Arial",Font.BOLD,15));
		}
		if(m.getSource()==lbldischarge)
		{
			lblmaster.setOpaque(false);
			lbltransaction.setOpaque(false);
			lblreport2.setOpaque(false);
			lblexit.setOpaque(false);
			lblhome.setOpaque(false);
			lbldoctor.setVisible(false);
			lblward.setVisible(false);
			lbltestmaster.setVisible(false);
			lbltestrequest.setVisible(false);
			lbltestsubmit.setVisible(false);
			lblbedchange.setVisible(false);
			lblreport.setVisible(false);
			lbllogin.setOpaque(false);
			lblpayment.setVisible(false);
			lbldischarge.setFont(new Font("Arial",Font.BOLD,20));
			lblpatient.setFont(new Font("Arial",Font.BOLD,15));
			lbladmit.setFont(new Font("Arial",Font.BOLD,15));
			lbllogin.setFont(new Font("Arial",Font.BOLD,15));
			lblhome.setFont(new Font ("Arial",Font.BOLD,20));
			lblexit.setFont(new Font ("Arial",Font.BOLD,20));
			lbltransaction.setFont(new Font("Arial",Font.BOLD,20));	
			lblmaster.setFont(new Font("Arial",Font.BOLD,20));
			lblreport2.setFont(new Font("Arial",Font.BOLD,20));	
			 lblpayment.setFont(new Font("Arial",Font.BOLD,15));
		}
}
}
public void mouseDragged(MouseEvent m)
{
	
}
public void actionPerformed(ActionEvent e)
{

	
}
public static void main(String args[])
{
	menuform obj=new menuform(0);
}

}
	