import java.applet.*;
import java.awt.*;
public class Arc extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawArc(20, 20, 200, 300, 40, 270);
        g.setColor(Color.red);//--> if you want to change the rectangle color then you must use setColor()
        g.fillArc(20, 330, 200, 300, 40, 270);
    }
}
/*<applet code = "Arc.class" width = 850 height = 650>
</applet>
*/