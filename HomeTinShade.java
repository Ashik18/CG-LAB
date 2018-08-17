
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
public class HomeTinShade extends JFrame 
{

	public HomeTinShade()
	{
		setTitle("Tin shadded Home");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawLine(100, 250, 400, 250);
		g.setColor(Color.RED);
		g.drawLine(100, 250, 250, 100);
		g.setColor(Color.RED);
		g.drawLine(250, 100, 400, 250);
		
		
		g.setColor(Color.BLACK);
		g.drawLine(120, 250, 120, 500);
		
		g.setColor(Color.BLACK);
		g.drawLine(120, 500, 370, 500);
		
		g.setColor(Color.BLACK);
		g.drawLine(370, 500,370, 250);
		
		
	    g.setColor(Color.RED);
	    g.fillRect(220,350,60,150);
	
	    g.setColor(Color.GREEN);
	    g.fillRect(150,300,50,50);
	    
	    g.setColor(Color.GREEN);
	    g.fillRect(300,300,50,50);
	}
	public static void main(String[] args) 
	{
		HomeTinShade h = new HomeTinShade();

	}

}


