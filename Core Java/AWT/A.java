public class A
{
    public static void main(String[] args) 
    {
        int num1 = 0;
        int num2 = 0;
        int value = 0;
        String res = "15+69*98*23/2";
        String s1 = "";
        String s2 = "";
        int num3 = 0;
        int j = 0;
        for(int i = 0; i < res.length(); i++)
        {
            
            if(res.charAt(i) == '+' || res.charAt(i) == '-' || res.charAt(i) == '*' || res.charAt(i) == '/')
            {
                char op = res.charAt(i);
                if(op == '+')
                {

                    j = i + 1;
                    while(res.charAt(j) != '+' && res.charAt(j) != '-' && res.charAt(j) != '*' && res.charAt(j) != '/')
                    {
                        s2 +=  res.charAt(j);
                        num2 = Integer.parseInt(s2);
                        j++;
                        if(j == res.length() || res.charAt(j) == '+' || res.charAt(j) == '-' || res.charAt(j) == '*' || res.charAt(j) == '/')
                        {
                            i = j - 1;
                            s1 = "";
                            s2 = "";
                            num3 += num2;
                            // num3 += num1;
                            num1 = 0;
                            num2 = 0;
                            break;
                        }
                    }
                }
                else if(op == '-')
                {
                    j = i + 1;
                    while(res.charAt(j) != '+' && res.charAt(j) != '-' && res.charAt(j) != '*' && res.charAt(j) != '/')
                    {
                        s2 +=  res.charAt(j);
                        num2 = Integer.parseInt(s2);
                        j++;
                        if(j == res.length() || res.charAt(j) == '+' || res.charAt(j) == '-' || res.charAt(j) == '*' || res.charAt(j) == '/')
                        {
                            i = j - 1;
                            s1 = "";
                            s2 = "";
                            num3 -= num2;
                            num2 = 0;
                            break;
                        }
                    }
                }
                else if(op == '*')
                {
                    j = i + 1;
                    while(res.charAt(j) != '+' && res.charAt(j) != '-' && res.charAt(j) != '*' && res.charAt(j) != '/')
                    {
                        s2 +=  res.charAt(j);
                        num2 = Integer.parseInt(s2);
                        j++;
                        if(j == res.length() || res.charAt(j) == '+' || res.charAt(j) == '-' || res.charAt(j) == '*' || res.charAt(j) == '/')
                        {
                            i = j - 1;
                            s1 = "";
                            s2 = "";
                            num3 *= num2;
                            num2 = 0;
                            break;
                        }
                    }
                }
                else if(op == '/')
                {
                    j = i + 1;
                    while(res.charAt(j) != '+' && res.charAt(j) != '-' && res.charAt(j) != '*' && res.charAt(j) != '/')
                    {
                        s2 +=  res.charAt(j);
                        num2 = Integer.parseInt(s2);
                        j++;
                        if(j == res.length() || res.charAt(j) == '+' || res.charAt(j) == '-' || res.charAt(j) == '*' || res.charAt(j) == '/')
                        {
                            i = j - 1;
                            s1 = "";
                            s2 = "";
                            num3 /= num2;
                            num2 = 0;
                            break;
                        }
                    }
                }
            }
            else    
            {
                int k = 0;
                while(res.charAt(k) != '+' && res.charAt(k) != '-' && res.charAt(k) != '*' && res.charAt(k) != '/')
                {
                    s1 += res.charAt(k);
                    num1 = Integer.parseInt(s1);
                    k++;
                }
                i = k - 1;
                num3 += num1;
            }
        }
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}