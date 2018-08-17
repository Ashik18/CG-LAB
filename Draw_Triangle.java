import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Draw_Triangle extends JFrame
{

	public Draw_Triangle()
	{
		setTitle("TriangleDraw");
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
		
	
	}

	public static void main(String[] args) 
	{
		Draw_Triangle l = new Draw_Triangle();
	}

}
