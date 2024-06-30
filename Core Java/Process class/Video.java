public class Video 
{
    @Deprecated
    public static void main(String[] args) throws Exception
    {
        String s[] = {"C:\\Program Files\\Windows Media Player\\wmplayer.exe","D:\\Videos\\Ishq-Shava-Full-Song-Jab-Tak-Hai-Jaan-Sh_128.mp4"};
        Runtime rr = Runtime.getRuntime();
        rr.exec(s);
    }
}
