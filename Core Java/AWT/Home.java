import java.applet.Applet;
import java.awt.*;
public class Home extends Applet
{
    @Override
    public void init()
    {
        setBackground(Color.red);
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawLine(10, 10, 50, 10);
    }
}
/*<applet code = "Home.class" width = 500 height = 500>
</applet>
*/