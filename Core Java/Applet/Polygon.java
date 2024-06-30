import java.applet.*;
import java.awt.*;
public class Polygon extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        int x[] = {200,400,600};
        int y[] = {200,20,200};
        g.drawPolygon(x, y, 3);
        g.setColor(Color.red);//--> if you want to change the rectangle color then you must use setColor()
        // g.fillPolygon(x, y, 3);
    }
}
/*<applet code = "Polygon.class" width = 850 height = 650>
</applet>
*/