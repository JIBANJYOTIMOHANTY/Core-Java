public class Pangram
{
    public static void main(String[] args) 
    {
        String s = "The quick brown fox jumps over the lazy dog";
        boolean bb[] = new boolean[26];
        int index = 0;
        int flag = 1;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                index = s.charAt(i) - 'a';

            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                index = s.charAt(i) - 'A';

            bb[index] = true;
        }

        for(int i = 0; i < 26; i++)
        {
            if(bb[i] == false)
                flag = 0;
        }
        
        if(flag == 1)
        {
            System.out.println("The String is pangram.");
        }
        else
        {
            System.out.println("The String is not pangram.");
        }
    }
}