import java.io.*;
public class Reverse 
{
    @Deprecated
    public static void main(String[] args) throws Exception
    {
        DataInputStream dd = new DataInputStream(System.in);

        System.out.print("Enter the line : ");
        String name = dd.readLine();

        String arr[] = name.split(" ");
        String sum = "";
        
        for(int i = (arr.length - 1); i >= 0; i--)
        {
            System.out.println(arr[i]);
        }

        
    }
}
