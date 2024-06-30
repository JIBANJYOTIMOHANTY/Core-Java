import java.applet.*;
import java.awt.*;
public class Line extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawLine(10, 10, 500, 10);
        g.setColor(Color.red);//--> if you want to change the rectangle color then you must use setColor()
        
    }
}
/*<applet code = "Line.class" width = 850 height = 650>
</applet>
*/