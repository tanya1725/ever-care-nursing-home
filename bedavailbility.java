import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
public class bedavailbility extends Frame implements ActionListener
{
JButton btnshow[]=new JButton[25];
JComboBox cmbward=new JComboBox();
//JLabel lbllogo=new JLabel(new ImageIcon("images/nursing.jpg"));
JLabel lblheading =new JLabel("BED AVAILABILITY");
   int t,x;
   String tt;
   String name,Diagnosed,doa,contact,pid,currentbed;
  public bedavailbility(int z,String p,String q,String r,String s,String n,String u,int w)
  {
	        t=z;
			tt=p;
			name=q;
       	    Diagnosed=r;
            doa=s;
            contact=n;
			pid=u;
			//currentbed=v;
			x=w;
	  int i;
	  int flag=0;

	  setLayout(null);
	  	  setVisible(true);
	  setSize(800,600);
	  Dimension size=Toolkit.getDefaultToolkit().getScreenSize(); 
	  setLocation(((int)size.getWidth()/2-400),((int)size.getHeight()/2-300));

	  //lbllogo.setBounds(0,0,1900,800);
	  cmbward.setBounds(200,150,300,40);

	  lblheading.setBounds(0,30,800,70);
	  lblheading.setOpaque(true);
	lblheading.setHorizontalAlignment(JLabel.CENTER);
	  lblheading.setFont(new Font("Courier New",Font.BOLD,25));
	  lblheading.setBackground(new Color(102,205,255));
	 cmbward.setFont(new Font("Arial",Font.BOLD,20));
  
  add(cmbward);

 
  /////////////////to bring data in the combobox/////////////////////
  
         try
		  {
			    Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from wardmastertbl ";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);		
                cmbward.addItem("select");
                while(res.next())
				{
 				  cmbward.addItem(res.getString(1));
				}
			con.close();	
		  }
			catch(Exception ee)
			{
				System.out.println(ee);
			}
  //////////////////////////////////////////////////////////////////
			for(i=1;i<=20;i++)
			{
				btnshow[i]=new JButton();
			}
			int x=0,y=0;
			for(i=1;i<=20;i++)
			{
				btnshow[i].setBounds(x+50,250+y,120,60);
				add(btnshow[i]);
				btnshow[i].setVisible(false);
				btnshow[i].addActionListener(this);
				if(i%5!=0)
				{
					x=x+130;
				}
				else
				{
					y=y+70;
					x=0;
			    }
			}
	//add(lbllogo);	
	add(lblheading);
	cmbward.addActionListener(this);
	repaint();
  }
	  
	public void actionPerformed(ActionEvent e)
	  {  
			int flg=0,i=0;
			int flag=0;
			if(e.getSource()==cmbward)
			{ 

               for(i=1;i<=20;i++)
			   {
				   btnshow[i].setVisible(false);
			   }
			      try
			      {   
	
					Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
					String str="select * from wardmastertbl where wtype='"+cmbward.getSelectedItem().toString()+"'";
					Statement st=con.createStatement();
					ResultSet res=st.executeQuery(str);					
					while(res.next())
					{    
						//JOptionPane.showMessageDialog(null,"hello");		

						for(i=1;i<20;i++)
						{
							String tbed=res.getString(i+2);
							if(tbed.equals("a")||tbed.equals("n"))
							{
								btnshow[i].setVisible(true);
								if(tbed.equals("a"))
									btnshow[i].setBackground(new Color(0,255,0));
								else
									btnshow[i].setBackground(new Color(255,0,0));
							}
							btnshow[i].setText(cmbward.getSelectedItem()+"/"+i);
							btnshow[i].setFont(new Font("Courier New",Font.BOLD,15));
							
						}


						
							
						
					}
					
					con.close();	
				  }				
			     catch(Exception ee)
			     {
				System.out.println(ee);
			     }	  
	  
	  }
	  	for(i=0;i<20;i++)
		{
			if(e.getSource()==btnshow[i])
			{
				 try
			      {   
	
					Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
					String str="select * from wardmastertbl where wtype='"+cmbward.getSelectedItem().toString()+"'";
					Statement st=con.createStatement();
					ResultSet res=st.executeQuery(str);					
					while(res.next())
					{    
				     String tbed=res.getString(i+2);
				      if(tbed.equals("a"))
				      {
						if(t==1)
						{						
					   admitform obj=new admitform(btnshow[i].getText());
					   btnshow[i].setBackground(new Color(255,0,0));
					   
					   
						}
						else
						{
							bedchange obj=new bedchange(btnshow[i].getText(),tt,name,Diagnosed,doa,contact,pid,x);
						  
  

						
						}
	
					this.dispose();
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
				
	}	  
}
  