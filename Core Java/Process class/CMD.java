import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CMD 
{
    @Deprecated
    public static void main(String[] args) throws Exception
    {
        Process p = Runtime.getRuntime().exec("cmd /c start echo Hi my name is Jiban");     
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));  
        System.out.println("Enter line : ");
        String line = br.readLine();
        
        while(line != null)
        {
            System.out.println(line);
            line = br.readLine();
        }
        p.waitFor();
        System.out.println();
    }
}