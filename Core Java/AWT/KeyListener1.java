import java.awt.*;
import java.awt.event.*;
public class KeyListener1 extends Frame implements KeyListener
{
    @Override
    public void keyTyped(KeyEvent ke)
    {
        System.out.println("Hello");
    }
    @Override
    public void keyPressed(KeyEvent ke)
    {
        System.out.println("Hello1");
    }
    @Override
    public void keyReleased(KeyEvent ke)
    {
        System.out.println("Hello2");
    }
    public static void main(String[] args) 
    {
        KeyListener1 kk = new KeyListener1();
        kk.keyPressed();
    }
    
}