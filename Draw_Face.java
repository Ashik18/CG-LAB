import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Draw_Face extends JFrame
{

	public Draw_Face()
	{
		setTitle("FaceDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(250, 200, 350, 350);
		
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(290,300,80,15);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(480,300,80,15);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(400,500,80,15);



		
	
		
	}
	public static void main(String[] args) 
	{
		Draw_Face f = new Draw_Face();
	}

}
