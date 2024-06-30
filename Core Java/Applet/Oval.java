import java.applet.*;
import java.awt.*;
public class Oval extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawOval(100, 10, 150, 150);
        g.setColor(Color.red);//--> if you want to change the rectangle color then you must use setColor()
        g.fillOval(260, 10, 200, 200);
        g.setColor(Color.yellow);
        g.fillOval(100, 200, 300, 300);
    }
}
/*<applet code = "Oval.class" width = 850 height = 650>
</applet>
*/