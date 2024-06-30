import java.io.IOException;

public class Video2 
{
    public static void main(String[] args) throws IOException
    {
        Runtime rr = Runtime.getRuntime();
        String s[] = {"C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe","D:\\Videos\\Jana Gana Mana.mp4"};    
        rr.exec(s);
    }    
}
