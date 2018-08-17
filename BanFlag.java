import java.awt.*;
import java.applet.*;

public class BanFlag extends Applet
{

public void paint (Graphics g)
{
 g.setColor(Color.black);
 g.fillRect(10,30,20,500);
 g.setColor(new Color(46, 139, 89));
 g.fillRect(40,50,300,170);
 g.setColor(Color.red);
 g.fillOval(120,80,120,120);
}

}