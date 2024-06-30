import java.io.OutputStream;

public class Notepad2 
{
    @Deprecated
    public static void main(String[] args) throws Exception
    {
        Process p = Runtime.getRuntime().exec("notepad.exe")        ;
        OutputStream o = p.getOutputStream();
        Thread.sleep(5000);
        o.close();
    }
}
