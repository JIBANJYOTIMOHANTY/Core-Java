import java.io.IOException;

public class Open
{
    public static void main(String[] args) throws IOException
    {
        Runtime rr = Runtime.getRuntime();
        String a = "jiban.txt";
        String b = """ 
            D:\\%s """;
        String c = b.formatted(a);
        System.out.println(c);
        String s[] = {"notepad.exe",c};    
        rr.exec(s);

    }
}