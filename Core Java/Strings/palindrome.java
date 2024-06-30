import java.io.*;
public class palindrome 
{
    @Deprecated
    public static void main(String[] args) throws Exception
    {
        DataInputStream dd = new DataInputStream(System.in);
        System.out.println("Enter the string : ");
        String ss = dd.readLine();
        String word = "";
        for(int i = ss.length() - 1; i >= 0; i--)
        {
            word += ss.charAt(i);
        }
        if(ss.equalsIgnoreCase(word))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}