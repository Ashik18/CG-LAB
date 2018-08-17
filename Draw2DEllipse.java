import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.Color; 
import java.awt.Graphics; 
import javax.swing.*; 
import java.awt.geom.*; 
import java.awt.image.*; 
public class Draw2DEllipse extends Applet { 
public static void main(String[] args) { 
Frame Draw2DEllipse = new Frame("2DEllipse"); 
Draw2DEllipse.setSize(350, 250); 
Applet Draw2DEllipseExample = new Draw2DEllipse(); 
Draw2DEllipse.add(Draw2DEllipseExample); 
Draw2DEllipse.setVisible(true); 
Draw2DEllipse.addWindowListener(new WindowAdapter() { 
public void windowClosing(WindowEvent e) { 
System.exit(0); 
      } 
    }); 
  } 
  public void paint(Graphics g) { 
    g.setColor(Color.blue); 
    g.setFont(new Font("Arial",Font.BOLD,14)); 
    g.drawString("Draw Ellipse2D Example", 50, 40); 
                super.paint(g); 
                Graphics2D G2D = (Graphics2D)g; 
                G2D.setColor(Color.orange); 
                G2D.setStroke(new BasicStroke(3.0f)); 
                Ellipse2D E2D = new Ellipse2D.Float(100.0f,75.0f,50.0f,100.0f); 
                G2D.draw(E2D); 
  } 
} 