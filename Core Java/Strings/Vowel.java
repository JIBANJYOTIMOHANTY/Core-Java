import java.io.*;
public class Vowel 
{
    @Deprecated
    public static void main(String[] args) throws Exception
    {
        DataInputStream dd = new DataInputStream(System.in);
        System.out.print("Enter the line : ");
        String line = dd.readLine();
        char ch[] = new char[line.length()];

        for(int i = 0; i < line.length() ; i++)
        {
            ch[i] = line.charAt(i);
        }
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < line.length(); i++)
        {
            if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u')
            {
                count++;
            }
            else 
            {
                count2++;
            }
        }
        System.out.println("Vowels : " + count);
        System.out.println("Consonant : " + count2);
    }
}
