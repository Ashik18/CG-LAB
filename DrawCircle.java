import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 
public class DrawCircle extends Applet 
{ 
      public static void main(String[] args) 
   { 
     Frame DrawingApplet = new Frame("DrawingApplet"); 
     DrawingApplet.setSize(350, 250); 
     Applet DrawCircle = new DrawCircle(); 
     DrawingApplet.add(DrawCircle); 
     DrawingApplet.setVisible(true); 
     DrawingApplet.addWindowListener(new WindowAdapter() { 
     public void windowClosing(WindowEvent e) {System.exit(0);}});
     
     }
     public void paint(Graphics g) 
     { 
    	 g.setColor(Color.red); 
         g.drawOval(170, 120, 100, 100);
         g.setColor(Color.cyan);
         g.fillOval(170, 120, 100, 100);
     
     }
 }