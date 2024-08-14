import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.io.*;
public class loading extends Frame 
{
    int x=0;
    	public loading()
	{
		setSize(2000,2000);
		setLayout(null);
		setVisible(true);
	}

	public void paint(Graphics g)
		{
           
           int i;
           int j;
           for(j=1;j<2;j++)
           {
			g.setColor(new Color(154,0,255));
			g.fillRect(50+x,400,40,50);
            g.fillRect(92+x,400,40,50);
            g.fillRect(134+x,400,40,50);
            g.fillRect(176+x,400,40,50);
            g.fillRect(218+x,400,40,50);
            g.fillRect(260+x,400,40,50);
            g.fillRect(302+x,400,40,50);
            g.fillRect(344+x,400,40,50);
           // g.fillRect(260+x,400,40,50);
            

            g.setColor(new Color(120,135,155));
           // g.drawRect(550,400,350,50);
            for(i=1;i<18000000;i++);
            x=x+2;
            repaint();
           }
         //  menuform obj=new menuform();

}
public static void main(String args[])
{
    loading obj=new loading();
}
}