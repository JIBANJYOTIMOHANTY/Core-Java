import java.io.*;
public class Demo1
{
    public static void main(String[] args) 
    {
        FileWriter fw = null;
        String data = "I Like Java Programming";
        try
        {
            fw = new FileWriter("aa.txt");
            fw.write(data);
            System.out.println("Writing was Successful.");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found.");
        }
        catch(IOException ie)
        {
            System.out.println("Io Exception arise at runtime.");
        }
        finally
        {
            try
            {
                fw.close();
            }
            catch(IOException ie)
            {
                System.out.println("IOException arised at runtime.");
            }
        }
    }
}