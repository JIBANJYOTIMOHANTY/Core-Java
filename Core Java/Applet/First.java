import java.applet.*;
import java.awt.*;
public class First extends Applet 
{
    @Override
    public void paint(Graphics g)    
    {
        g.drawString("Hello Java",100,100);
    }
}
/*<applet code = "First.class" width = 250 height = 150>
</applet>
*/