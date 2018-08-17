import java.applet.Applet;

import java.awt.*;

import java.awt.event.*;

public class Rectangle extends Applet

{

      public static void main(String[] args)

   {

     Frame DrawingApplet = new Frame("Draw Rectangle using the drawRect () method.");

     DrawingApplet.setSize(350, 250);

     Applet shapeRectangle = new Rectangle();

     DrawingApplet.add(shapeRectangle);

     DrawingApplet.setVisible(true);

     DrawingApplet.addWindowListener(new WindowAdapter() {

     public void windowClosing(WindowEvent e) {System.exit(0); }

                                                                             });

  }

           public void paint(Graphics g)

            {

                     setBackground(Color.cyan);
     
              
            // draws a Rectangle
            g.setColor(Color.black);
            g.drawRect(120, 50, 100, 70);
          
       }

}