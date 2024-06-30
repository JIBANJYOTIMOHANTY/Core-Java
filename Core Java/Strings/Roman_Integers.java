public class Roman_Integers 
{
    static int value(char c)
    {
        if(c == 'I')
            return 1;

        else if(c == 'V')
            return 5;

        else if(c == 'X')
            return 10;

        else if(c == 'L')
            return 50;
        
        else if(c == 'D')
            return 500;

        else if(c == 'M')
            return 1000;

        return -1;
    }
    public static void main(String[] args) 
    {
        String s = "IV";
        int result = 0;

        for(int i = 0; i < s.length(); i++)
        {
            int s1 = value(s.charAt(i));

            if((i + 1) < s.length())
            {
                int s2 = value(s.charAt(i+1));

                if(s1 >= s2)
                {
                    result += s1;
                }
                else
                {
                    result += s2 - s1;
                    i++;
                }
            }
            else
            {
                result += s1;
            }
        }
        
        System.out.println("Result : " + result);
    }    
}