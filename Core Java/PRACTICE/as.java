public class as 
{
    static int valueOf(char c)
    {
        if(c == 'I')
            return 1;
        if(c == 'V')
            return 5;
        if(c == 'X')
            return 10;
        if(c == 'L')
            return 50;
        if(c == 'C')
            return 100;
        if(c == 'D')
            return 500;
        if(c == 'M')
            return 1000;
        return -1;
    }
    static int Roman_Integers(String str)
    {
        int sum = 0;
        for(int i = 0; i < str.length(); i++)
        {
            int s1 = valueOf(str.charAt(i));
            if(i + 1 < str.length())
            {
                int s2 = valueOf(str.charAt(i+1));
                if(s1 >= s2)
                {
                    sum += s1;
                }
                else
                {
                    sum += s2 - s1;
                    i++;
                }
            }
            else 
            {
                sum += s1;
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        as aa = new as();
        System.out.println(aa.Roman_Integers("IV"));
    }
}