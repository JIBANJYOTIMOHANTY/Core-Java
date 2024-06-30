public class Notepad
{
    @Deprecated
    public static void main(String[] args) 
    {
        try
        {

            System.out.println("Creating a new process");
            Process p1 = Runtime.getRuntime().exec("notepad.exe");
            System.out.println("Waiting");
            Thread.sleep(3000);
            p1.waitFor();
            System.out.println(p1.exitValue());
            System.out.println("Process has been destroyed");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}