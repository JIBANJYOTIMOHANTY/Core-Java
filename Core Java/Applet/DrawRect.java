import java.applet.*;
import java.awt.*;
public class DrawRect extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawRect(100, 10, 100, 100);
        // g.setColor(Color.red);//--> if you want to change the rectangle color then you must use setColor()
        g.fillRect(250, 10, 100, 100);
    }
}
/*<applet code = "DrawRect.class" width = 850 height = 650>
</applet>
*/