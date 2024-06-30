import java.io.*;
public class Try_With_Resource
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("ab.txt");
        try(fw)
        {
            String data = "I Love India.";
            fw.write(data);
            System.out.println("\033cWriting was successful.");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found.");
        }
        catch(IOException ie)
        {
            System.out.println("Io Exception arise at runtime.");
        }
    }
}