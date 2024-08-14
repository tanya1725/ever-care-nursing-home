import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
public class Wardmaster extends JFrame implements ActionListener,KeyListener
{
	
JLabel lblwardtype=new JLabel("WARD TYPE");
JLabel lblnoofbed=new JLabel("NO. OF BEDS");
JLabel lblcharge=new JLabel("CHARGE");
JTextField txtwardtype=new JTextField(15);
JTextField txtnoofbed=new JTextField(15);
JTextField txtcharge=new JTextField(15);
JButton btnnew=new JButton("NEW");
JButton btnsave=new JButton("SAVE");
JButton btnsearch=new JButton("SEARCH");
JButton btnedit=new JButton("EDIT");
JButton btncancel=new JButton("CANCEL");
JLabel lblheading=new JLabel("WARD MASTER FORM");
JLabel lblleft=new JLabel();
JLabel lblright=new JLabel();
//JLabel lbllogo=new JLabel(new ImageIcon("images/nursing.jpg"));
JComboBox cmbward=new JComboBox();

  public Wardmaster()
  {
  setTitle("WARD MASTER...");
  setLayout(null);
   Dimension size=Toolkit.getDefaultToolkit().getScreenSize(); 
  setVisible(true);
  setSize(700,600);
   setLocation(((int)size.getWidth()/2-350),((int)size.getHeight()/2-300));

//lbllogo.setBounds(0,0,1900,800);

	lblheading.setBounds(0,0,700,70);
	lblheading.setOpaque(true);
	lblleft.setOpaque(true);
	lblright.setOpaque(true);
	  lblheading.setHorizontalAlignment(JLabel.CENTER);
	  lblheading.setFont(new Font("Courier New",Font.BOLD,25));
	  lblheading.setBackground(new Color(102,205,255));
    
	 lblleft.setBounds(0,0,20,1000);
	 lblleft.setBackground(new Color(102,205,255));
	 lblright.setBounds(665,0,20,1000);
	 lblright.setBackground(new Color(102,205,255));

lblwardtype.setBounds(100,140,200,40);
lblwardtype.setFont(new Font("Courier New",Font.BOLD,20));
txtwardtype.setBounds(290,140,150,40);

lblnoofbed.setBounds(100,240,200,40);
lblnoofbed.setFont(new Font("Courier New",Font.BOLD,20));
txtnoofbed.setBounds(290,240,150,40);

lblcharge.setBounds(100,340,200,40);
lblcharge.setFont(new Font("Courier New",Font.BOLD,20));
txtcharge.setBounds(290,340,150,40);

btnnew.setBounds(100,440,100,40);
btnnew.setBackground(new Color(102,205,255));
btnsave.setBounds(210,440,100,40);
btnsave.setBackground(new Color(102,205,255));
btnsearch.setBounds(320,440,100,40);
btnsearch.setBackground(new Color(102,205,255));
btnedit.setBounds(430,440,100,40);
btnedit.setBackground(new Color(102,205,255));
btncancel.setBounds(540,440,100,40);
btncancel.setBackground(new Color(102,205,255));
cmbward.setBounds(100,140,200,40);
cmbward.setFont(new Font("Courier New",Font.BOLD,20));
txtwardtype.setEditable(false);
txtnoofbed.setEditable(false);
txtcharge.setEditable(false);

add(lblwardtype);
add(lblnoofbed);
add(lblcharge);
add(txtwardtype);
add(txtnoofbed);
add(txtcharge);
add(cmbward);
add(btnnew);
add(btnsave);
add(btnsearch);
add(btnedit);
add(btncancel);
add(lblleft);
add(lblright);
add(lblheading);
//add(lbllogo);

			try
			{   
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from wardmastertbl";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				//cmbward.addItem("SELECT");
				while(res.next())
				{
					cmbward.addItem(res.getString(1));
				}
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}	


btnnew.addActionListener(this);
btnsave.addActionListener(this);
btnsearch.addActionListener(this);
btnedit.addActionListener(this);
btncancel.addActionListener(this);
cmbward.addActionListener(this);
btnsave.setEnabled(false);
btnedit.setEnabled(false);
txtnoofbed.addKeyListener(this);
cmbward.setVisible(false);
cmbward.addItem("SELECT");
  }
  public void keyReleased(KeyEvent k)
  {
	char ch;
	String st="";
	int i;
	int ctr3=0;
	int tttt=0;
		if(k.getSource()==txtnoofbed)
		{
			
			   if(txtnoofbed.getText().length()!=0)
			   {
				ch=txtnoofbed.getText().charAt(txtnoofbed.getText().length()-1);
				if(ch>='0' && ch<='9')
					{
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Enter numbers only");
					     txtnoofbed.setText("");
					}
		
						   	for(i=1;i<=Integer.parseInt(txtnoofbed.getText());i++)
						{
							ctr3++;
						}
							if(ctr3<=20)
							{
							
							}
							else
							{
							   JOptionPane.showMessageDialog(null,"there will be 20 beds only");
							   txtnoofbed.setText("");
							}
			   }
			   else
			   {
				JOptionPane.showMessageDialog(null,"no of beds not accepted");
			   }
			   
		}


  }
  public void keyPressed(KeyEvent k)
  {}
public void keyTyped(KeyEvent k)
  {
  }
  public void actionPerformed(ActionEvent e)
  {
	  int flag=1;
	  int ff=0,f=0,fff=0;
	  int i;
	  char ch,chh;
	  String s="",w="";
	  if(e.getSource()==btnsave)
	  {	
		int ctr3=0;
		int tttt=0;
		int gg=0;
		char chi;
		String g="";
		  	  try
		  { 
			  Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
			  String str2="Select * from wardmastertbl where wtype='"+txtwardtype.getText()+"'";
			  String str="insert into wardmastertbl(wtype,wcharge,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			  PreparedStatement ps=con.prepareStatement(str);
			  Statement st=con.createStatement();
			  ResultSet res=st.executeQuery(str2);
			  ps.setString(1,txtwardtype.getText());
			  ps.setString(2,txtcharge.getText());
			  if((txtnoofbed.getText().length()>0)&&(txtwardtype.getText().length()>0)&&(txtcharge.getText().length()>0))
			  {

				   
			  for(i=1;i<=Integer.parseInt(txtnoofbed.getText());i++)
			  {
				  ps.setString((i+2),"a");
			  }
			  for(;i<=20;i++)
			  {
				  ps.setString((i+2),"x");
			  }
			  }
			  else
			  {
                JOptionPane.showMessageDialog(null,"kindly fill all the details");
			  }
			  while(res.next())
			  {
				f=1;
			  }
			  if(f==1)
			  {
				JOptionPane.showMessageDialog(null,"ward type are already saved");
			  }
			  else
			  {
	
			      //System.out.println("111");
                  s=txtcharge.getText();
			      for(i=0;i<s.length();i++)
			       {
				     ch=s.charAt(i);
				     if(ch>='0'&& ch<='9')
				     {
                         ff=1;
				      }
					  else{
						ff=0;
						break;
					  }
				   }
				  w=txtwardtype.getText();
			      for(i=0;i<w.length();i++)
			       {
				     chh=w.charAt(i);
				     if(chh!=' ')
				     {
                         fff=1;
				      }
					  else{
						fff=0;
						break;
					  }
				   }


						
								
				
				   if(ff==1)
				   {
					if(fff==1)
					{
				          
					
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null,"Saved successfully");
					
						btnsave.setEnabled(false);
						txtwardtype.setText("");
						txtnoofbed.setText("");
						txtcharge.setText("");
						txtwardtype.setEditable(false);
						txtnoofbed.setEditable(false);
						txtcharge.setEditable(false);
			
		
				   }
				   else{
								
					JOptionPane.showMessageDialog(null,"kindly fill all the details");
				   
				   }
				   }
				      else
				      {
						if(txtcharge.getText().length()!=0)
						{
					JOptionPane.showMessageDialog(null,"enters numbers only");
					txtcharge.setText("");
				        }
					  }
			         
		            
				
						
			 } 

			  
			  
			  con.close();
		  }
		  
		  catch(Exception ee)
		  {
			  System.out.println(ee);
		  }
		
		  }
	  if(e.getSource()==btnedit)
	  { 
             

		   try
		   {
			   if(flag==1)
			   {
			   Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
			   Statement st1=con.createStatement();
			   String dstr="delete from wardmastertbl where wtype='"+cmbward.getSelectedItem()+"'";
			   st1.executeUpdate(dstr);
               String str2="Select * from wardmastertbl where wtype='"+cmbward.getSelectedItem()+"'";
			  String str="insert into wardmastertbl(wtype,wcharge,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			  PreparedStatement ps=con.prepareStatement(str);
			  Statement st=con.createStatement();
			  ResultSet res=st.executeQuery(str2);
			  ps.setString(1,""+cmbward.getSelectedItem());
			  ps.setString(2,txtcharge.getText());
			  if((txtnoofbed.getText().length()>0)&&(cmbward.getSelectedItem()!="SELECT")&&(txtcharge.getText().length()>0))
			  {
			  for(i=1;i<=Integer.parseInt(txtnoofbed.getText());i++)
			  {

				  ps.setString((i+2),"a");
			  }
			  for(;i<=20;i++)
			  {
				  ps.setString((i+2),"x");
			  }
			  }
			  else
			  {
				JOptionPane.showMessageDialog(null,"kindly fill all the details properly");
			  }
			 /* while(res.next())
			  {
				f=1;
			  }
			  if(f==1)
			  {
				JOptionPane.showMessageDialog(null,"ward type are already saved");
			  }*/

	
			      //System.out.println("111");
                  s=txtcharge.getText();
			      for(i=0;i<s.length();i++)
			       {
				     ch=s.charAt(i);
				     if(ch>='0'&& ch<='9')
				     {
                         ff=1;
				      }
					  else{
						ff=0;
						break;
					  }
				   }
				 /* w=txtwardtype.getText();
			      for(i=0;i<w.length();i++)
			       {
				     chh=w.charAt(i);
				     if(chh!=' ')
				     {
                         fff=1;
				      }
					  else{
						fff=0;
						break;
					  }*/
				  // }
				   if(ff==1)
				   {
			
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null,"Saved successfully");
						btnsave.setEnabled(false);
						btnedit.setEnabled(false);
						//txtwardtype.setText("");
						txtnoofbed.setText("");
						txtcharge.setText("");
						txtwardtype.setEditable(false);
						txtnoofbed.setEditable(false);
						txtcharge.setEditable(false);
				   
			
				   }
				      else
				      {
					JOptionPane.showMessageDialog(null,"enters numbers onlty");
					txtcharge.setText("");
				     }
			         

			  
			  
            
			   }
			       // con.close();  
			 }
		  catch(Exception ee)
		  {
			  System.out.println(ee);
		  }
		  
		   }
	  if(e.getSource()==btnsearch)
	  {
		  int flg=0;
			try
			{
				txtwardtype.setVisible(false);
				cmbward.setVisible(true);
				cmbward.setSelectedItem("SELECT");
				btnedit.setEnabled(true);
				btnsave.setEnabled(false);
				txtwardtype.setEditable(true);
				txtnoofbed.setEditable(true);
				txtcharge.setEditable(true);
				/*int ctr=0;
				//String wstr=JOptionPane.showInputDialog(null,"Enter ward type");
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from wardmastertbl where Wtype='"+""+cmbward.getSelectedItem()+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);
				btnedit.setEnabled(true);
			while(res.next())
			{
				//txtwardtype.setText(res.getString(1));
				//cmbward.addItem(res.getString(1));
				txtcharge.setText(res.getString(2));
				for(i=3;i<=22;i++)
				{
					String saval=res.getString(i);
					if(saval.equals("a")||saval.equals("n"))
							ctr++;
				}
				txtnoofbed.setText(""+ctr);
				//flg=1;
			    flag=1;
			}
			/*if(flg==0)
			{
				JOptionPane.showMessageDialog(null,"Invalid ward type");
				txtwardtype.setText("");
				txtnoofbed.setText("");
				txtcharge.setText("");
				btnedit.setEnabled(false);
				
			}*/
			
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
	  }
	  
	  if(e.getSource()==btnnew)
	  {
		  cmbward.setVisible(false);
		   txtwardtype.setVisible(true);
		   txtwardtype.setEditable(true);
		   txtnoofbed.setEditable(true);
		   txtcharge.setEditable(true);
		  txtwardtype.setText("");
		  txtnoofbed.setText("");
		  txtcharge.setText("");
		  btnsave.setEnabled(true);
		 // txtwardtype.setEnabled(true);
		  btnedit.setEnabled(false);
		  
	  }
	  
	  if(e.getSource()==btncancel)
	  {
		  this.dispose();
	  }

	  if(e.getSource()==cmbward)
	  {
		int ctr=0;
		try{
			
				Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
				String str="select * from wardmastertbl where Wtype='"+""+cmbward.getSelectedItem()+"'";
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery(str);		

				while(res.next())
				{

					txtcharge.setText(res.getString(2));
				for(i=3;i<=22;i++)
				{
					String saval=res.getString(i);
					if(saval.equals("a")||saval.equals("n"))
							ctr++;
				}
				txtnoofbed.setText(""+ctr);				
				}
				con.close();
	  }
	  catch( Exception ee)
	  {
		System.out.println(ee);


	  }

  }
  }
  

}
