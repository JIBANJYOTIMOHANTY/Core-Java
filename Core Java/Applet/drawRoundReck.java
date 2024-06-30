import java.applet.*;
import java.awt.*;
@Deprecated
public class drawRoundReck extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawRoundRect(10, 10, 10, 50, 100, 100);
        g.setColor(Color.red);//--> if you want to change the rectangle color then you must use setColor()
    }
}
/*<applet code = "drawRoundReck.class" width = 850 height = 650>
</applet>
*/