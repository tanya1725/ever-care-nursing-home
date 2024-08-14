import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
public class Loginform extends JFrame implements ActionListener  
{
	int flag=0;
	//int i=0;
	int k=0;
	int z=0;
	int flg=0;
	int i;
	int j;
	int x=0;

	

Label lblloading[]=new Label[20];
JLabel lbluser=new JLabel("USER :");
JLabel lblpassword=new JLabel("PASSWORD :");
JTextField txtuser=new JTextField(15);
JPasswordField password=new JPasswordField(15);
JLabel lblloading1=new JLabel();
JLabel lbllogo=new JLabel(new ImageIcon("images/nursing5.gif"));
JButton btnok=new JButton("OK");
JButton btncancel=new JButton("CANCEL");
//JLabel lblbackground=new JLabel();



	


  public Loginform()
  {
  setLayout(null);
  setVisible(true);
  setSize(600,500);
  setLocationRelativeTo(null);  
  
  lbllogo.setBounds(0,0,600,500);
  lbluser.setBounds(100,40,100,40);
  txtuser.setBounds(210,40,200,40);
  lblpassword.setBounds(100,90,100,40);

  
  
  password.setBounds(210,90,200,40);

  btnok.setBounds(410,40, 60,40);
  btncancel.setBounds(410,90,100,40);


  add(lbluser);
  add(lblpassword);
  


  add(txtuser);
  add(password);
  add(btnok);
  add(btncancel);
  

  add(lbllogo);
  repaint();
  
  btnok.addActionListener(this);
  btncancel.addActionListener(this);

  repaint();
}

  
    public void actionPerformed(ActionEvent e)
     {

	    if(e.getSource()==btncancel)
	      {
		     
             this.dispose();
		  
          }


		if(e.getSource()==btnok)
		{
			try
			{
			Connection con=DriverManager.getConnection("jdbc:odbc:nursingdsn");
			String str="select * from logintbl where usr='"+txtuser.getText()+"' and pwd='"+password.getText()+"'";
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery(str);
			
  					   /*for(i=0;i<20;i++)
				       {

						lblloading[i]=new Label();	
						lblloading[i].setBounds(90+x,400,10,20);						
						x=x+21;
						add(lblloading[i]);

					     } */


			while(res.next())
			{
				

				flag=1;
				flg=1;
			}
			if(flg==1)
			{
				for(i=0;i<20;i++)
				{
					
						lblloading[i]=new Label();	
						lblloading[i].setBounds(90+x,400,10,40);						
						x=x+21;
						add(lblloading[i]);
                         lblloading[i].setBackground(new Color(0,200,0));
					//repaint();
					for(double jj=0;jj<180000000;jj++);
					
				

					
				}  
				
				
				menuform obj=new menuform(1);

				this.dispose();

			}
			
			if(flg==0)
			{
				JOptionPane.showMessageDialog(null,"Invalid Login!");
				txtuser.setText("");
				password.setText("");
				txtuser.requestFocus();
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